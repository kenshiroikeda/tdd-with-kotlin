package money

class Bank {

    private var rates : HashMap<Pair, Int> = hashMapOf()

    fun reduce(source : Expression, to : String): Money{
        return source.reduce(this, to)
    }

    fun addRate(from: String, to: String, rate: Int) {
        rates[Pair(from,to)] = rate
    }

    fun rate(from: String, to: String) :Int{
        return if(from == to) 1 else rates.get(Pair(from, to))!!
    }
}