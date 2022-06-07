package uz.xsoft.november

class Solution2108 {
    fun firstPalindrome(words: Array<String>): String {
        for (i in words)
            if (isPalindromic(i)) return i
        return ""
    }

    private fun isPalindromic(st: String): Boolean {
        for (i in 0 until st.length / 2)
            if (st[i] != st[st.length - i - 1]) return false
        return true
    }
}