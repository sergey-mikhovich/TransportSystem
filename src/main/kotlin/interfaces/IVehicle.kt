package interfaces

import enums.FuelType

interface IVehicle {
    val yearOfIssue: Int
    val brand: String
    val model: String
    val fuelType: FuelType
    val fuelConsumption: Int

    fun fillUp()
    fun repair()
    fun loadOrder(order: IOrder): Boolean
    fun unloadOrder(order: IOrder)
    fun getCurrentOrders(): List<IOrder>
}