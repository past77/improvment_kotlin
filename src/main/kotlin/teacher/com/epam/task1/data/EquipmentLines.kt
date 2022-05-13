package teacher.com.epam.task1.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.SendChannel
import teacher.com.epam.task1.PrepareEquipmentRequest

/*
TODO should return actor and contain log("work in equipmentLineName") for each equipmentLine it is important for test!!!
  it is recommended to use delay inside actor body
 */
// This function launches a new equipmentLineOne actor
fun CoroutineScope.createEquipmentLine(equipmentLineName: String): SendChannel<PrepareEquipmentRequest> {
    // should return actor and contain log("work in equipmentLineName") for each equipmentLine it is important for test!!!
    return TODO()
}
