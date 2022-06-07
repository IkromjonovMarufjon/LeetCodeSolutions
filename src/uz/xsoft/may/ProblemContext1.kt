package uz.xsoft.may

fun main() {
    val context = ProblemContext1()
    println(context.digitCount("1210"))
}

class ProblemContext1 {
    fun digitCount(num: String): Boolean {
        val map = HashMap<Int, Int>()
        num.forEach {
            val key = it - '0'
            if (map.containsKey(key)) {
                map[key] = map[key]!! + 1
            } else map[key] = 1
        }

        for (i in num.indices) {
            if (num[i] == '0' && !map.containsKey(i)) continue
            if (!(map.containsKey(i) && map[i] == num[i] - '0'))
                return  false
        }

        return true;
    }
}