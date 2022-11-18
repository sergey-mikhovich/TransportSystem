import interfaces.IPassengerOrder

class PassengerOrder(
    override val passengersNumber: Int,
    override val startPoint: String,
    override val endPoint: String
) : IPassengerOrder