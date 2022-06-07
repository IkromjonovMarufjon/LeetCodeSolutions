package uz.xsoft.november

class Solution299 {
    fun getHint(secret: String, guess: String): String {
        val arr = IntArray(10)
        var bull = 0
        var cow = 0

        var x = 0
        var y = 0
        for (i in secret.indices) {
            x = secret[i] - '0'
            y = guess[i] - '0'
            if (x == y) {
                bull ++
            } else {
                if (arr[x] < 0) cow ++
                if (arr[y] > 0) cow ++

                arr[x] ++
                arr[y] --
            }
        }
        return "${bull}A${cow}B"
    }
}