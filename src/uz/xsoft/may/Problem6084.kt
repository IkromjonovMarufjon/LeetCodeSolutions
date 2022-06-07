package uz.xsoft.may

fun main() {

}

class Problem6084 {
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val map = HashMap<String, Int>()
        for (i in senders.indices) {
            if (map.containsKey(senders[i])) {
                map[senders[i]] = map[senders[i]]!! + messages[i].split(" ").size
            } else map[senders[i]] = messages[i].split(" ").size
        }

        var max = 0
        map.forEach { (key, value) ->
            if (max < value) {
                max = value
            }
        }
        val list = ArrayList<String>()
        map.forEach { (key, value) ->
            if (max == value)  list.add(key)
            println("[$key] = $value")
        }
        if (list.size == 1) return list[0]

        var maxL = 0
        var sum = 0
        var result = ""
        println(list.size)
        for (i in list.indices) {
            sum  = 0
            for (j in messages.indices) {
                if (list[i] == senders[j])  sum += messages[j].length
            }
            println("${list[i]} --> $sum")
            if (maxL < sum) {
                maxL = sum
                result = list[i]
            }
        }
        return result
    }

    /*
    fun largestWordCount(messages: Array<String>, senders: Array<String>): String {
        val map = HashMap<String, Int>()
        for (i in senders.indices) {
            if (map.containsKey(senders[i])) {
                map[senders[i]] = map[senders[i]]!! + 1
            } else map[senders[i]] = 1
        }

        var max = 0
        map.forEach { (_, value) ->
            if (max < value) {
                max = value
            }
        }
        val list = ArrayList<String>()
        map.forEach { (key, value) ->
            if (max == value)  list.add(key)
            println("[$key] = $value")
        }
        if (list.size == 1) return list[0]

        var maxL = 0
        var sum = 0
        var result = ""
        println(list.size)
        for (i in list.indices) {
            sum  = 0
            println(list[i])
            for (j in messages.indices) {
                if (list[i] == senders[j])  sum += messages[j].length
            }
            if (maxL < sum) {
                maxL = sum
                result = list[i]
            }
        }
        return result
    }
    * */
}