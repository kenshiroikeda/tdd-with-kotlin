package money

class Sum : Expression{
    var augend : Expression
    var addend : Expression

    constructor(augend:Expression, addend:Expression) {
        this.augend = augend
        this.addend = addend
    }

    override fun reduce(bank: Bank, to: String): Money {
        var amount = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount
        return Money(amount, to)
    }

    override fun plus(addend: Expression): Expression {
        TODO("Not yet implemented")
    }

}