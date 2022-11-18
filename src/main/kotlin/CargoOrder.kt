import enums.CargoType
import interfaces.ICargoOrder

class CargoOrder(
    override val volume: Int,
    override val weight: Int,
    override val cargoType: CargoType,
    override val startPoint: String,
    override val endPoint: String
) : ICargoOrder