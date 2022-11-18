import enums.FuelType
import interfaces.IOrder
import interfaces.IPassengerOrder
import interfaces.IPassengerVehicle

class PassengerVehicle(
    override val yearOfIssue: Int,
    override val brand: String,
    override val model: String,
    override val fuelType: FuelType,
    override val fuelConsumption: Int,
    override val passengerCapacity: Int
) : IPassengerVehicle {

    private val orders: MutableList<IPassengerOrder> = mutableListOf()

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