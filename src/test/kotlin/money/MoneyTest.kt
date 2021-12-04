package money

import kotlin.test.Test
import kotlin.test.assertEquals

class MoneyTest {
    @Test
    fun testMultiplication() {
        val five = Doller(5)
        five.times(2)
        assertEquals(10, five.amount)
    }
}