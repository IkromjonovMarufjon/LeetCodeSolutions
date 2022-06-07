package uz.xsoft.may

class Problem6085 {
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
        val map = HashMap<Int, Long>()
        for (i in roads.indices) {
            if (map.containsKey(roads[i][0])) {
                map[roads[i][0]] = map[roads[i][0]]!! + 1L
            } else map[roads[i][0]] = 1L

            if (map.containsKey(roads[i][1])) {
                map[roads[i][1]] = map[roads[i][1]]!! + 1L
            } else map[roads[i][1]] = 1L
        }

        val list = ArrayList<Long>(map.values)

        list.sort()
        var sum= 0L
        var add = n
        for (i in list.size -1 downTo 0) {
            sum += add * list[i]
            add --
        }
        /*for (i in list.indices) {
            sum += (i + 1) * list[i]
        }*/
        return sum
    }
}