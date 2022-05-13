package teacher.com.epam.task1

import teacher.com.epam.task1.data.Car
import teacher.com.epam.task1.data.Part
import teacher.com.epam.task1.utils.log

@kotlinx.coroutines.ExperimentalCoroutinesApi
fun main(args: Array<String>) {
    printOrders(orders)
    startWorkShopWork(orders)
}

val orders = listOf(
    Car(Part.Body.Sedan, Part.Equipment.Premium),
    Car(Part.Body.SportCar, Part.Equipment.Family),
    Car(Part.Body.Sedan, Part.Equipment.LowCost),
    Car(Part.Body.Van, Part.Equipment.Premium),
    Car(Part.Body.Sedan, Part.Equipment.LowCost),
    Car(Part.Body.Van, Part.Equipment.LowCost),
    Car(Part.Body.Van, Part.Equipment.LowCost)
)

fun printOrders(orders: List<Car>) {
    orders.forEach {
        log(it)
    }
}