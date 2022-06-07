package uz.xsoft.november

class Solution2114 {
    fun mostWordsFound(sentences: Array<String>): Int {
        var max = 0
        var count = 0
        for (sentence in sentences) {
            count = 0
            for (i in sentence) {
                if (i == ' ') count ++
            }
            if (count > max) max = count
        }
        return max +1
    }
}