package uz.xsoft.may

class Solution_6068 {
    fun maximumWhiteTiles(tiles: Array<IntArray>, carpetLen: Int): Int {
        tiles.sortBy { it[0] }

        var s = 0
        tiles.forEach {
            s += it[1] - it[0]
            println(it[1] - it[0] +1)
        }
        println("RESULT = $s")
        val interval = ArrayList<Int>()
        for (i in 0 until tiles.size - 1) {
            interval.add(tiles[i][1] - tiles[i][0] + 1)
            interval.add(tiles[i + 1][0] - tiles[i][1] - 1)
        }
        interval.add(tiles[tiles.size - 1][1] - tiles[tiles.size - 1][0] + 1)
        interval.add(0)

        var max = 0
        var sum = 0
        var allSum = 0

        for (k in 0 until interval.size step 2) {
            for (j in k until interval.size step 2) {
                sum += if (carpetLen - allSum > interval[j]) interval[j]
                else carpetLen - allSum
                allSum += interval[j] + interval[j + 1]

                println("sum = $sum and allSum = $allSum")
                if (allSum >= carpetLen) {
                    if (max < sum) max = sum
                    sum = 0
                    allSum = 0
                    break
                }
            }
            if (max < sum) max = sum
            sum = 0
            allSum = 0
        }
        return max
    }
}