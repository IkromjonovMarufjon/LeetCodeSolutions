package uz.xsoft.november

class Solution2119 {
    fun isSameAfterReversals(num: Int): Boolean {
        return !(num % 10 == 0 && num != 0)
    }
}