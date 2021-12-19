package money

class Sum : Expression{
    var augend : Expression
    var addend : Expression

    constructor(augend:Expression, addend:Expression) {
        this.augend = augend
        this.addend = addend
    }

    override fun times(multiplier: Int): Expression {
        return Sum(augend.times(multiplier), addend.times(multiplier))
    }

    override fun plus(addend: Expression): Expression {
        return this
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }




}