package uz.xsoft.may

class Problem2287 {
    fun rearrangeCharacters(s: String, target: String): Int {
        val mass = IntArray(26) { return@IntArray 0 }
        s.forEach {
            mass[it - 'a']++
        }

        var count = 0
        while (true) {
            for (i in target.indices) {
                if (mass[target[i] - 'a'] != 0) mass[target[i] - 'a']--
                else return count
            }
            count++
        }
    }
}


