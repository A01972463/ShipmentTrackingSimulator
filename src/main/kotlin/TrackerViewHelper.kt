class TrackerViewHelper(
    shipmentID: String,
    shipmentStatus: String,
    expectedShipmentDeliveryDate: Long,
    shipmentNotes: MutableList<String>,
    shipmentUpdateHistory: MutableList<String>

) {
    var ID = shipmentID
        private set

    var Status = shipmentStatus
        private set

    var DeliveryDate = expectedShipmentDeliveryDate
        private set(value) {
            field = value
        }

    var Notes = shipmentNotes
        private set(value) {
            field = value
        }

    var History = shipmentUpdateHistory
        private set(value) {
            field = value
        }

    init {
        val shipment = Shipment(
            id = ID,
            status = Status,
            expectedDeliveryDateTimestamp = DeliveryDate,
            currentLocation = "",
        )
        shipment.subscribe {
            Status = it
        }
    }

//    fun +previousStatus: String
//    fun +newStatus: String
//    fun +timeStamp: Long
}