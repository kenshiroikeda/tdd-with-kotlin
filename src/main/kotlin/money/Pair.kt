package money

class Pair {

    private var from :String
    private var to :String

    constructor(from:String, to:String){
        this.from = from
        this.to = to
    }

    override fun equals(other: Any?): Boolean {
        var pair = other as Pair
        return from == pair.from && to == pair.to
    }

    override fun hashCode(): Int {
        return 0
    }

}