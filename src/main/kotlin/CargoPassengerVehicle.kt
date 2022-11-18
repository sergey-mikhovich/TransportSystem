import enums.BodyType
import enums.FuelType
import interfaces.ICargoVehicle
import interfaces.IOrder
import interfaces.IPassengerVehicle

class CargoPassengerVehicle(
    override val bodyVolume: Int,
    override val loadCapacity: Int,
    override val bodyType: BodyType,
    override val passengerCapacity: Int,
    override val yearOfIssue: Int,
    override val brand: String,
    override val model: String,
    override val fuelType: FuelType,
    override val fuelConsumption: Int
) : ICargoVehicle, IPassengerVehicle {

    override fun seal() {
        TODO("Not yet implemented")
    }

    override fun getAvailableLoadCapacity(): Int {
        TODO("Not yet implemented")
    }

    override fun getAvailableBodyVolume(): Int {
        TODO("Not yet implemented")
    }

    override fun disinfect() {
        TODO("Not yet implemented")
    }

    override fun getAvailablePassengerCapacity(): Int {
        TODO("Not yet implemented")
    }

    override fun fillUp() {
        TODO("Not yet implemented")
    }

    override fun repair() {
        TODO("Not yet implemented")
    }

    override fun loadOrder(order: IOrder): Boolean {
        TODO("Not yet implemented")
    }

    override fun unloadOrder(order: IOrder) {
        TODO("Not yet implemented")
    }

    override fun getCurrentOrders(): List<IOrder> {
        TODO("Not yet implemented")
    }
}