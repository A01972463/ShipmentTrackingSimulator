data class Shipment(
    val id: String,
//    val content: String,     // To be removed
    var status: String,
    var expectedDeliveryDateTimestamp: Long,
    var currentLocation: String,
//    notes: MutableList<String>
) {

    private val notes = mutableListOf<(String) -> Unit>()

//    fun +addNote(note: String)
//    fun +addUpdate(update: Update)
}