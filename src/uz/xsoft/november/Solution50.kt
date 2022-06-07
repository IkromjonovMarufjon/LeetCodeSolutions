package uz.xsoft.november

class Solution50 {
    fun myPow(x: Double, n: Int): Double {
        if (n < 0) return myPow(1 / x, -n)
        if (n == 0) return 1.0
        if (n == 1) return x
        return if (n % 2 == 0) myPow(myPow(x, n / 2), 2)
        else myPow(myPow(x, n / 2), 2) * x
    }
}