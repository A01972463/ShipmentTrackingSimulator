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
        private set

    var Notes = shipmentNotes
        private set

    var History = shipmentUpdateHistory
        private set

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
}