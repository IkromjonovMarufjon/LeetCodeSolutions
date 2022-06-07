package uz.xsoft.november

class Solution520 {
    fun detectCapitalUse(word: String): Boolean {
        if (word.length == 1) return true
        return if (word.first() >= 'a') {
            if (word[1] < 'a') {
                checkUpper(word)
            } else {
                checkLower(word)
            }
        } else {
            checkUpper(word)
        }
    }

    private fun checkUpper(word: String) : Boolean {
        for (i in 1 until word.length) {
            if (word[i] >= 'a') return false
        }
        return true
    }

    private fun checkLower(word: String) : Boolean {
        for (i in 1 until word.length) {
            if (word[i] < 'a') return false
        }
        return true
    }
}