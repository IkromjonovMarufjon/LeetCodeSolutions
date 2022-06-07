package uz.xsoft.november

class Solution2103 {
    fun countPoints(rings: String): Int {
        val setArr = Array(10) { return@Array HashSet<Char>() }

        for (index in rings.indices step 2) {
            setArr[rings[index+1] - '0'].add(rings[index])
        }

        var count = 0
        for (element in setArr) {
            if (element.size == 3) count ++
        }
        return count
    }
}