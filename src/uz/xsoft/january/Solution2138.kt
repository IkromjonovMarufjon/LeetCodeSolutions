package uz.xsoft.january

import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    val solution = Solution2138()
    val arr = solution.divideString(sc.next(), sc.nextInt(), sc.next()[0])
    for (i in arr)
        print("$i , ")
}

class Solution2138 {
    fun divideString(s: String, k: Int, fill: Char): Array<String> {
        val arr = Array<String>(if (s.length / k == 0) s.length / k else s.length / k + 1) { return@Array "" }
        for (i in 0 until s.length / k) {
            arr[i] = s.substring(i * k, i * k + k)
        }

        if (s.length % k != 0) {
            val sb = StringBuilder()
            sb.append(s.substring((s.length / k) * k))
            for (i in sb.length until k)
                sb.append(fill)
            arr[s.length / k] = sb.toString()
        }
        return arr
    }
}