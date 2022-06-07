package uz.xsoft.may

fun main() {
    val solution = Solution2248()
    val nums = arrayOf(
        intArrayOf(3,1,2,4,5),
        intArrayOf(1,2,3,4),
        intArrayOf(3,4,5,6)
    )
    println(solution.intersection(nums).size)
//    solution.intersection(nums).forEach {
//        println(it)
//    }
}

class Solution2248 {
    fun intersection(nums: Array<IntArray>): List<Int> {
        val worker = ArrayList<Int>()
        var bool = true
        nums.first().forEach {
            bool = true
            for (i in 1 until nums.size) {
                if (bool && !nums[i].contains(it))
                    bool = false
            }
            if (bool) worker.add(it)
        }
        return worker.sorted()
    }
}