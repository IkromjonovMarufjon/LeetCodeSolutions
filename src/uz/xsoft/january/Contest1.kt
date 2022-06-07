package uz.xsoft.january

class Contest1 {
    fun countElements(nums: IntArray): Int {
        var min = nums[0]
        var max = nums[0]
        for (i in nums.indices) {
            if (min > nums[i]) min = nums[i]
            if (max < nums[i]) max = nums[i]
        }

        var count = 0
        for (i in nums.indices) {
            if (nums[i] in (min + 1) until max) count ++
        }
        return count
    }
}

class Contest2 {
    fun rearrangeArray(nums: IntArray): IntArray {
        val list1 = ArrayList<Int>()
        val list2 = ArrayList<Int>()

        for (i in nums.indices) {
            if (nums[i] >= 0) list1.add(nums[i])
            else list2.add(nums[i])
        }

        val result = IntArray(nums.size)
        var pos1 = 0
        var pos2 = 0
        for (i in nums.indices) {
            if (pos1 < list1.size && i % 2 == 0) result[i] = list1[pos1++]
            else result[i] = list2[pos2++]
        }

        return result
    }

    fun findLonely(nums: IntArray): List<Int> {
        val list = ArrayList<Int>()
        nums.sort()
        for (i in nums.indices)
            list.add(nums[i])

        var pos = 0
        var marker = -1

        chop("bir", list)
        while (pos < list.size - 1) {
            if (list[pos + 1] - list[pos] <= 1) {
                list.removeAt(pos)
                marker = pos
                chop("ikki list[$pos] = ${list[pos]}", list)
            } else {
                if (marker >= 0) {
                    list.removeAt(marker)
                    marker = -1
                    chop("uch list[$pos] =${list[pos]}", list)
                } else {
                    chop("to'rt list[$pos] =${list[pos]}", list)
                    pos++
                }
            }
        }

        return list
    }

    fun chop(st: String, list: List<Int>) {
        println("$st   ---------- ")
        for (i in list.indices)
            print("${list[i]}, ")
        println()
    }
}