package uz.xsoft.january

class Solution1886 {
    fun findRotation(mat: Array<IntArray>, target: Array<IntArray>): Boolean {
        var count = 0
        val size = mat.size
        var arr = target
        while (count < 3) {
            if (check(mat,arr,mat.size)) return true
            arr = rotateMatrix(arr,size)
            count ++
        }
        return false
    }

    private fun rotateMatrix(target: Array<IntArray>, size: Int): Array<IntArray> {
        val arr = Array<IntArray>(size) { return@Array IntArray(size) }
        for (i in 0 until size) {
            for (j in 0 until size) {
                arr[i][j] = target[size - i][j]
            }
        }
        return arr
    }

    private fun check(mat: Array<IntArray>, target: Array<IntArray>, size: Int): Boolean {
        for (i in 0 until size) {
            for (j in 0 until size) {
                if (mat[i][j] != target[i][j]) return false
            }
        }
        return true
    }
}