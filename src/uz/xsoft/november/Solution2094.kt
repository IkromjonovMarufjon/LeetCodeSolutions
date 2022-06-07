package uz.xsoft.november

class Solution2094 {
    fun findEvenNumbers(digits: IntArray): IntArray {
        val result = IntArray(0)
        if (!unComfortable(digits)) return result
        val couple = getIndexFromCouple(digits)
        val set = HashSet<Int>()

        for (index in couple.indices) {
            for (i in digits.indices) {
                for (j in digits.indices) {
                    if (digits[i] != 0 && i != j && i != couple.elementAt(index) && j != couple.elementAt(index)) {
                        set.add(digits[i] * 100 + digits[j] * 10 + digits[couple.elementAt(index)])
                    }
                }
            }
        }

        val list = set.toIntArray()
        list.sort()
        return list
    }

    private fun unComfortable(digits: IntArray) : Boolean {
        var count = 0
        for (i in digits) if (i == 0) count ++
        if (count == digits.size) return false

        count = 0
        for (i in digits) if (i % 2 == 1) count ++
        if (count == digits.size) return false
        return true
    }

    private fun getIndexFromCouple(digits: IntArray) : HashSet<Int> {
        val result = HashSet<Int>()
        for (i in digits.indices) if (digits[i] % 2 == 0) result.add(i)
        return result
    }
}