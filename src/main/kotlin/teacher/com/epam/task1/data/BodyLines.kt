package teacher.com.epam.task1.data

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.channels.SendChannel
import teacher.com.epam.task1.PrepareBodyRequest

/*
TODO should return actor and contain log("work in bodyLineName") for each bodyLine it is important for test!!!
  it is recommended to use delay inside actor body
 */
// This function launches a new bodyLineOne actor
fun CoroutineScope.createBodyLine(bodyLineName: String): SendChannel<PrepareBodyRequest> {
    return TODO()
}
