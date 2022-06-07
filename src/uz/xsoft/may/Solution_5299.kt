package uz.xsoft.may

fun main() {
    val s = Solution_5299()
    println(s.divisorSubstrings(240, 2))
}
class Solution_5299 {
    fun divisorSubstrings(num: Int, k: Int): Int {
        var _num = num
        val degree = getAmount(k)
//        println(degree)
        var div = _num % degree
//        println(div)
        _num /= degree
//        println(_num)
        var count = 0

        while (_num > 0) {
            println(div)
            if (div != 0 && num % div == 0) count ++
            div = (_num % 10) * degree/10 + div / 10
            _num /= 10
        }
            println("div  = $div")
        if (div != 0 && num % div == 0) count ++
        return count
    }

    private fun getAmount(k  : Int) : Int {
        var amount = 1
        for (i in 0 until k) {
            amount *= 10
        }
        return amount
    }

}