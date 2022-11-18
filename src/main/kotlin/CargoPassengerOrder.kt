import enums.CargoType
import interfaces.ICargoOrder
import interfaces.IPassengerOrder

class CargoPassengerOrder(
    override val volume: Int,
    override val weight: Int,
    override val cargoType: CargoType,
    override val startPoint: String,
    override val endPoint: String,
    override val passengersNumber: Int
) : ICargoOrder, IPassengerOrder