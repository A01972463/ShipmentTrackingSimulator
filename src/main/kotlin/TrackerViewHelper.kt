class TrackerViewHelper(
    state: State,
    shipmentID: String,
    shipmentTotes: MutableList<String>,
    shipmentUpdateHistory: MutableList<String>,
    expectedShipmentDeliveryDate: MutableList<String>,
    shipmentStatus: String

//*all attributes have a private setter in this class
) {
    var ID = shipmentID
        private set(value) {
            field = value
        }

    var  Totes = shipmentTotes
        private set(value) {
            field = value
        }

    var History = shipmentUpdateHistory
        private set(value) {
            field = value
        }

    var DeliveryDate = expectedShipmentDeliveryDate
        private set(value) {
            field = value
        }

    var Status = shipmentStatus
        private set(value) {
            field = value
        }

//    fun +previousStatus: String
//    fun +newStatus: String
//    fun +timeStamp: Long
}