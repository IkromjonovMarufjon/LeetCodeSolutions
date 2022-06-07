package uz.xsoft.january

import java.lang.StringBuilder
import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val solution = Solution2129()
    println(solution.capitalizeTitle(sc.nextLine()))
}

class Solution2129 {
    fun capitalizeTitle(title: String): String {
        val sb = StringBuilder(title.length)
        var separatedPos = 0
        for (i in title.indices) {
            if (title[i] == ' ') {
                println("$i , $separatedPos")
                println("${i - separatedPos > 2} , ${sb[separatedPos] > 'Z'}")
                if (i - separatedPos > 2 && sb[separatedPos] > 'Z') {
                    println("----------")
                    sb[separatedPos] = sb[separatedPos] -32
                }
                separatedPos = i+1
                sb.append(title[i])
            } else {
                if (title[i] <= 'Z') sb.append(title[i] +32)
                else sb.append(title[i])
            }
        }

        if (title.length - separatedPos > 2 && sb[separatedPos] > 'Z') {
            sb[separatedPos] = sb[separatedPos] -32
        }

        return sb.toString()
    }
}
/**
capiTalIze tHe titLe
 * */