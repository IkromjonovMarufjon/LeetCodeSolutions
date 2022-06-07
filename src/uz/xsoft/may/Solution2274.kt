package uz.xsoft.may

class Solution2274 {
    fun maxConsecutive(bottom: Int, top: Int, special: IntArray): Int {
        if (special.isEmpty()) return top - bottom
        special.sort()
        var max = (special[0] - bottom).coerceAtLeast(top - special[special.size - 1])
        for (i in 1 until special.size) {
            max = (special[i] - special[i-1]).coerceAtLeast(max)
        }
        return max
    }
}