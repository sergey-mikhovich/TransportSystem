import enums.BodyType
import enums.FuelType
import interfaces.ICargoOrder
import interfaces.ICargoVehicle
import interfaces.IOrder

class CargoVehicle(
    override val yearOfIssue: Int,
    override val brand: String,
    override val model: String,
    override val fuelType: FuelType,
    override val fuelConsumption: Int,
    override val bodyVolume: Int,
    override val loadCapacity: Int,
    override val bodyType: BodyType
) : ICargoVehicle {

    private val orders: MutableList<ICargoOrder> = mutableListOf()

    override fun seal() {
        TODO("Not yet implemented")
    }

    override fun getAvailableLoadCapacity(): Int {
        TODO("Not yet implemented")
    }

    override fun getAvailableBodyVolume(): Int {
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