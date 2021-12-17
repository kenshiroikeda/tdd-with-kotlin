package money

class Sum : Expression{
    var augend : Money
    var addend : Money

    constructor(augend:Money, addend:Money) {
        this.augend = augend
        this.addend = addend
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount = augend.amount + addend.amount
        return Money(amount, to)
    }

}