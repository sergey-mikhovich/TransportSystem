package interfaces

import enums.CargoType

interface ICargoOrder: IOrder {
    val volume: Int
    val weight: Int
    val cargoType: CargoType
}