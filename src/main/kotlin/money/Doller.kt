package money

class Doller() {

    var amount : Int = 0

    constructor(amount: Int) : this() {
        this.amount = amount
    }
    fun times(multiplier:Int) : Doller{
        return Doller(amount * multiplier)
    }

}