package uz.xsoft.may

class Solution2255 {
    fun countPrefixes(words: Array<String>, s: String): Int {
        var count = 0
        words.forEach {
            if (s.startsWith(it)) count ++
        }
        return count
    }
}