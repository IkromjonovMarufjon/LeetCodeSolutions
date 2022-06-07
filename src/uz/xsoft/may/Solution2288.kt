package uz.xsoft.may

class Solution2288 {
    fun discountPrices(sentence: String, discount: Int): String {
        val sb = StringBuilder()
        val sentenceList = sentence.split(" ")
        sentenceList.forEach {
            if (it[0] == '$') {
                val amount = getAmount(it.substring(1))
                if (amount > 0) {
                    sb.append("${(amount / discount * 100.0).toInt() / 100.0}")
                } else sb.append(it)
            } else sb.append(it)
            sb.append(" ")
        }
        return sb.toString().trim()
    }

    private fun getAmount(st : String) : Int {
        var amount = 0
        st.forEach {
            if (!it.isDigit()) return -1
            amount = amount * 10 + (it - '0')
        }
        return amount
    }
}