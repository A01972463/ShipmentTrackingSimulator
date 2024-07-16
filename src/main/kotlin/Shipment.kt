data class Shipment(
    val id: String,
    var status: String,
    var expectedDeliveryDateTimestamp: Long,
    var currentLocation: String,
) {
    private val notes = mutableListOf<(String) -> Unit>()
    private val subscribers = mutableListOf<(String) -> Unit>()

    fun addNote(note: String) {
        // Todo: Add note
    }
    fun addUpdate(update: String) {
//        Todo: Add update
    }

    fun subscribe(observer: (String) -> Unit) {
        subscribers.add(observer)
    }

    fun unsubscribe(observer: (String) -> Unit) {
        subscribers.remove(observer)
    }

    fun notifyObservers() {
        subscribers.forEach {
            it(status)
        }
    }
}