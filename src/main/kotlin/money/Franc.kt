package money

class Franc() : Money() {

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Franc{
        return Franc(amount * multiplier)
    }

}