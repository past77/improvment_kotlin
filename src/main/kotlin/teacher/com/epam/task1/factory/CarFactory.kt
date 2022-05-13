package teacher.com.epam.task1.factory

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.ReceiveChannel
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.delay
import teacher.com.epam.task1.PrepareBodyRequest
import teacher.com.epam.task1.PrepareEquipmentRequest
import teacher.com.epam.task1.combineBody
import teacher.com.epam.task1.combineEquipment
import teacher.com.epam.task1.data.*
import teacher.com.epam.task1.utils.log


// producer of completed car orders
/*
TODO should return produce and contain log("Processing order: $order") it is important for test!!!
   has to use functions finalCompose(), getEquipment(), getBody(), preparedEquipment(), prepareBody()

 */
@ExperimentalCoroutinesApi
fun createCar(
    orders: ReceiveChannel<Car>,
    scope: CoroutineScope,
    bodyLineOne: SendChannel<PrepareBodyRequest>,
    bodyLineTwo: SendChannel<PrepareBodyRequest>,
    equipmentLineOne: SendChannel<PrepareEquipmentRequest>,
    equipmentLineTwo: SendChannel<PrepareEquipmentRequest>
): ReceiveChannel<OutPut.FinishedCar> = TODO()


suspend fun getEquipment(
    preparedEquipment: ChosenEquipment,
    equipmentLineOne: SendChannel<PrepareEquipmentRequest>,
    equipmentLineTwo: SendChannel<PrepareEquipmentRequest>
) = combineEquipment(preparedEquipment, equipmentLineOne, equipmentLineTwo)


suspend fun getBody(
    preparedBody: ChosenBody,
    bodyLineOne: SendChannel<PrepareBodyRequest>,
    bodyLineTwo: SendChannel<PrepareBodyRequest>
) = combineBody(preparedBody, bodyLineOne, bodyLineTwo)


suspend fun prepareBody(body: Part.Body): ChosenBody {
    log("Preparing car body $body")
    delay(400)
    return ChosenBody(body)
}

suspend fun preparedEquipment(equipment: Part.Equipment): ChosenEquipment {
    log("Preparing car equipment $equipment")
    delay(400)
    return ChosenEquipment(equipment)
}

// composes provided BodyParts and EquipmentParts to FinishedCar
suspend fun finalCompose(
    order: Car,
    bodyParts: BodyParts,
    equipment: EquipmentParts
): OutPut.FinishedCar {
    log("Combining parts $bodyParts, $equipment")
    delay(100)
    return OutPut.FinishedCar(order, bodyParts, equipment)
}