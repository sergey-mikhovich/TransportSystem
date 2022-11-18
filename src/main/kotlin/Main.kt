import enums.BodyType
import enums.CargoType
import enums.FuelType

fun main(args: Array<String>) {
    val cargoVehicle = CargoVehicle(
        yearOfIssue = 2010,
        brand = "Mercedes",
        model = "Actros",
        fuelType = FuelType.DIESEL,
        fuelConsumption = 40,
        bodyType = BodyType.REFRIGERATOR,
        bodyVolume = 180,
        loadCapacity = 50000
    )
    val passengerVehicle = PassengerVehicle(
        yearOfIssue = 2019,
        brand = "Volkswagen",
        model = "Polo",
        fuelType = FuelType.PETROL,
        fuelConsumption = 6,
        passengerCapacity = 5
    )
    val cargoPassengerVehicle = CargoPassengerVehicle(
        yearOfIssue = 2015,
        brand = "Mercedes",
        model = "Sprinter",
        fuelType = FuelType.GAS,
        fuelConsumption = 12,
        bodyType = BodyType.VAN,
        bodyVolume = 32,
        loadCapacity = 3000,
        passengerCapacity = 12
    )

    val cargoOrder1 = CargoOrder(
        volume = 50,
        weight = 6000,
        cargoType = CargoType.PERISHABLE,
        startPoint = "Minsk",
        endPoint = "Brest"
    )
    val cargoOrder2 = CargoOrder(
        volume = 12,
        weight = 65,
        cargoType = CargoType.INDUSTRIAL,
        startPoint = "Grodno",
        endPoint = "Minsk"
    )
    val passengerOrder1 = PassengerOrder(
        passengersNumber = 7,
        startPoint = "Grodno",
        endPoint = "Minsk"
    )
    val passengerOrder2 = PassengerOrder(
        passengersNumber = 3,
        startPoint = "Minsk",
        endPoint = "Brest"
    )
}