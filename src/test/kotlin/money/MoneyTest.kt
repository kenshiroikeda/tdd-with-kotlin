package money

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class MoneyTest {
    @Test
    fun testMultiplication() {
        var five = Money.dollar(5)
        assertEquals(Money.dollar(10), five.times(2))
        assertEquals(Money.dollar(15), five.times(3))
    }

    @Test
    fun testEquality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    fun testCurreny() {
        assertEquals("USD", Money.dollar(1).currency())
        assertEquals("CHF", Money.franc(1).currency())
    }

    @Test
    fun testSimpleAddition(){
        var five = Money.dollar(5)
        var sum = five.plus(five) as Sum
        var bank = Bank()
        var reduced = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(10), reduced)
    }

    @Test
    fun testPlusReturnSum(){
        var five = Money.dollar(5)
        var result = five.plus(five)
        var sum = result as Sum
        assertEquals(five, sum.augend)
        assertEquals(five, sum.addend)
    }

    @Test
    fun testReduceSum(){
        var sum = Sum(Money.dollar(3),Money.dollar(4)) as Expression
        var bank = Bank()
        var result = bank.reduce(sum, "USD")
        assertEquals(Money.dollar(7), result)
    }

    @Test
    fun testReduceMoney(){
        var bank = Bank()
        var result = bank.reduce(Money.dollar(1), "USD")
        assertEquals(Money.dollar(1), result)
    }

    @Test
    fun testReduceMoneyDifferentCountry(){
        var bank = Bank()
        bank.addRate("CHF","USD",2)
        var result =bank.reduce(Money.franc(2), "USD")
        assertEquals(Money.dollar(1),result)
    }

    @Test
    fun testMixedAddition(){
        var fivebucks = Money.dollar(5) as Expression
        var tenFrancs = Money.franc(10) as Expression
        var bank = Bank()
        bank.addRate("CHF", "USD", 2)
        var result = bank.reduce(fivebucks.plus(tenFrancs),"USD")
        assertEquals(Money.dollar(10), result)

    }
    @Test
    fun testSumPlusMoney(){
        var fiveBucks = Money.dollar(5) as Expression
        var tenFrancs = Money.dollar(10) as Expression
        var bank = Bank()
        bank.addRate("CHF", "USD", 2)
        var sum = Sum(fiveBucks,tenFrancs).plus(fiveBucks)
        var result = bank.reduce(sum,"USD")
        assertEquals(Money.dollar(15), result)
    }

    @Test
    fun testSumTimes(){
        var fiveBucks = Money.dollar(5) as Expression
        var tenFrancs = Money.dollar(10) as Expression
        var bank = Bank()
        bank.addRate("CHF", "USD", 2)
        var sum = Sum(fiveBucks,tenFrancs).times(2)
        var result = bank.reduce(sum,"USD")
        assertEquals(Money.dollar(20), result)
    }

}