package uz.xsoft.november

class Solution2124 {
    fun checkString(s: String): Boolean {
        var count = 0
        for (i in 1 until s.length) {
            if (s[i-1] != s[i]) count ++
        }

        return if (s.startsWith('a')) count < 2
        else count == 0
    }
}