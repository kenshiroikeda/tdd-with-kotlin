package money

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MoneyTest {
    @Test
    fun testMultiplication() {
        var five = Money.dollar(5) as Money
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertTrue(Franc(5).equals(Franc(5)));
        assertFalse(Franc(5).equals(Franc(6)));
        assertFalse(Franc(5).equals(Money.dollar(5)));
    }

    @Test
    fun testFlancMultiplication() {
        var five = Money.franc(5) as Money
        assertEquals(Money.franc(10), five.times(2))
        assertEquals(Money.franc(15), five.times(3))
    }

}