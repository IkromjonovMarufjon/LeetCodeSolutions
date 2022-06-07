package uz.xsoft.november

class Solution2133 {
    fun checkValid(matrix: Array<IntArray>): Boolean {
        return checkRow(matrix) && checkColumn(matrix)
    }

    private fun checkRow(matrix: Array<IntArray>): Boolean {
        val set = HashSet<Int>()
        for (row in matrix) {
            for (i in row) {
                if (set.contains(row[i])) return false
                set.add(row[i])
            }
            set.clear()
        }
        return true
    }

    private fun checkColumn(matrix: Array<IntArray>): Boolean {
        val set = HashSet<Int>()
        for (i in matrix.indices) {
            for (j in matrix[i].indices) {
                if (set.contains(matrix[j][i])) return false
                set.add(matrix[j][i])
            }
            set.clear()
        }
        return true
    }
}