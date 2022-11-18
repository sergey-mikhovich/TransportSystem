package interfaces

import enums.BodyType

interface ICargoVehicle: IVehicle {
    val bodyVolume: Int
    val loadCapacity: Int
    val bodyType: BodyType

    fun seal()
    fun getAvailableLoadCapacity(): Int
    fun getAvailableBodyVolume(): Int
}