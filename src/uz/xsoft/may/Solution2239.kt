package uz.xsoft.may

class Solution2239 {
    fun findClosestNumber(nums: IntArray): Int {
        var min = Integer.MAX_VALUE
        var value = Int.MIN_VALUE
        for (i in nums.indices) {
            if (min > Math.abs(nums[i])) {
                min = Math.abs(nums[i])
                if (value < nums[i])
                    value = nums[i]
            }
        }
        return value
    }
}