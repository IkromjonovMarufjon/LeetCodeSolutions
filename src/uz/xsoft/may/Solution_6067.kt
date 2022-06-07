package uz.xsoft.may

class Solution_6067  {
    fun waysToSplitArray(nums: IntArray): Int {
        var sum = 0L
        for (i in nums.indices) sum += nums[i]

        var s = 0L
        var count = 0
        for (i in 0 until nums.size -1) {
            s += nums[i]
            sum -= nums[i]
            if (s >= sum) count ++
        }
        return count
    }
}