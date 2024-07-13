class TrackingSimulator(
    shipments: MutableList<Shipment>
) {
    var ShipmentList = shipments
        get() {
            return field
        }
        private set(value) {
            field = value
        }
}