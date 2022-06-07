package uz.xsoft.may

class Solution2264 {
    fun largestGoodInteger(num: String): String {
        var count = 0
        for (i in 1 until num.length) {
            if (num[i-1] == num[i]) count ++
            if (count == 3) return "${num[i]}${num[i]}${num[i]}"
        }
        return ""
    }
}