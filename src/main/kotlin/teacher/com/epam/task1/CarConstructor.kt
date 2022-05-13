package teacher.com.epam.task1

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.channels.SendChannel
import kotlinx.coroutines.selects.select
import teacher.com.epam.task1.data.BodyParts
import teacher.com.epam.task1.data.EquipmentParts
import teacher.com.epam.task1.factory.ChosenBody
import teacher.com.epam.task1.factory.ChosenEquipment


data class PrepareBodyRequest(
    val chosenBody: ChosenBody,
    val bodyPartsChannel: SendChannel<BodyParts>
)

data class PrepareEquipmentRequest(
    val equipment: ChosenEquipment,
    val equipmentChannel: SendChannel<EquipmentParts>
)

/**
 * suspend function to combine body parts. It has selector that defines which channel is currently available to send
 * the main thing is our channels have buffer = 1 it means that only one request could be processed in a time.
 * Once the request is sent to the channel, we wait for a response and deliver the result. The bodyLine
 * implementation sends the result on the provided channel and then closes the channel.
 * */
/*
* TODO has to implement select<BodyParts> and log(combineBodyBodyLine1) inside onSend() for bodyLineOne and log(combineBodyBodyLine2) inside onSend() for bodyLineTwo!!! it is important for test
* */
suspend fun combineBody(
    chosenBody: ChosenBody,
    bodyLineOne: SendChannel<PrepareBodyRequest>,
    bodyLineTwo: SendChannel<PrepareBodyRequest>
) = select<BodyParts> {
    //TODO
}

/**
 * suspend function to combine equipment parts. It has selector that defines which channel is currently available to send
 * the main thing is our channels have buffer = 1 it means that only one request could be processed in a time.
 * Once the request is sent to the channel, we wait for a response and deliver the result. The equipmentLine
 * implementation sends the result on the provided channel and then closes the channel.
 * */

/*
TODO has to implement select<BodyParts> and log(combineEquipmentEquipmentLine1) inside onSend() for equipmentLineOne and log(combineEquipmentEquipmentLine2) inside onSend() for equipmentLineTwo!!! it is important for test
*/
suspend fun combineEquipment(
    equipment: ChosenEquipment,
    equipmentLineOne: SendChannel<PrepareEquipmentRequest>,
    equipmentLineTwo: SendChannel<PrepareEquipmentRequest>
) = select<EquipmentParts> {
    //TODO
}

/**
 * closes all channel, checks are they closed and bring the result
 * should shotDown all channels and check is it off
 * */
@ExperimentalCoroutinesApi
fun shutdown(
    bodyLineOne: SendChannel<PrepareBodyRequest>,
    bodyLineTwo: SendChannel<PrepareBodyRequest>,
    equipmentLineOne: SendChannel<PrepareEquipmentRequest>,
    equipmentLineTwo: SendChannel<PrepareEquipmentRequest>
): Boolean {
    return TODO()
}
