package uz.xsoft.may

fun main() {
    val solution = Solution2243()
    println(solution.digitSum("11111222223", 3))
    println(solution.digitSum("1234", 2))
    println(solution.digitSum("00000000", 3))
    println(solution.digitSum("000000010", 3))
}

class Solution2243 {
    fun digitSum(s: String, k: Int): String {
        if (s.length <= k) return s
        val sb = StringBuilder()
        var sum = 0
        var count = 0

        for (i in 0 .. s.length - k step k) {
            sum = 0
            s.substring(i, i+ k).forEach {
                sum += (it - '0')
            }
            sb.append(sum.toString())
            count ++
        }

        if (count * k != s.length) {
            sum = 0
            s.substring(count*k, s.length).forEach {
                sum += (it - '0')
            }
            sb.append(sum.toString())
        }
        return digitSum(sb.toString(), k)
    }
}

