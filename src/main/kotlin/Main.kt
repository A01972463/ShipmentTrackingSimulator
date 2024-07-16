import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var shipmentID by remember { mutableStateOf("") }
    val shipments = remember { mutableStateListOf<TrackerViewHelper>() }

    MaterialTheme {
        Column {

        Row {
            TextField(shipmentID, onValueChange = {
                shipmentID = it
            })

            Button(onClick = {
                shipments.add(
                    TrackerViewHelper(
                        shipmentID = shipmentID,
                        shipmentStatus = "created",
                        expectedShipmentDeliveryDate = 19999488398,
                        shipmentNotes = mutableListOf(),
                        shipmentUpdateHistory = mutableListOf()
                    )
//                    Shipment(
//                        id = shipmentID,
//                        status = "created",
//                        expectedDeliveryDateTimestamp = 1652712855468,
//                        currentLocation = "",
//                    )
                )
            }) {
                Text("Track")
            }

        }
        LazyColumn {
            items(shipments, key = { it.ID }) {
                Row(
                    modifier = Modifier
                        .padding(8.dp)
                        .border(1.dp, Color.Black, RoundedCornerShape(4.dp))
                        .padding(4.dp)
                ) {
                    Text("Tracking Shipment: ${it.ID}\n" +
                            "Status: ${it.Status}\n" +
                            "Location:\n" +
                            "Expected Delivery: ${it.DeliveryDate}\n" +
                            "\nStatus Updates: ${it.Status}\n" +
                            "\nNotes: ${it.Notes}")

                    Button(onClick = {
                        shipments.remove(it)
                    }) {
                        Text("X")
                    }
                }
            }
        }
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
