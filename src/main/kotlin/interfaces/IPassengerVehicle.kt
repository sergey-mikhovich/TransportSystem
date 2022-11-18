package interfaces

interface IPassengerVehicle: IVehicle {
    val passengerCapacity: Int

    fun disinfect()
    fun getAvailablePassengerCapacity(): Int
}