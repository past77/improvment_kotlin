package teacher.com.epam.task2

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.ExperimentalCoroutinesApi
import teacher.com.epam.task2.api.SearchApi
import teacher.com.epam.task2.engine.SearchEngine
import teacher.com.epam.task2.repository.SearchRepository

/**
 * This is a simple realization of Service Locator pattern.
 * It uses 'fabric' pattern to provide all classes
 * you need in one place.
 * More to read : [link](https://ru.wikipedia.org/wiki/%D0%9B%D0%BE%D0%BA%D0%B0%D1%82%D0%BE%D1%80_%D1%81%D0%BB%D1%83%D0%B6%D0%B1)
 */
//TODO: add your realization of each contract in this task
@ExperimentalCoroutinesApi
object DependencyProvider {

    fun provideEngine(dispatcher: CoroutineDispatcher): SearchEngine = TODO()

    private fun provideRepository(): SearchRepository = TODO()

    private fun provideApi(): SearchApi = TODO()
}