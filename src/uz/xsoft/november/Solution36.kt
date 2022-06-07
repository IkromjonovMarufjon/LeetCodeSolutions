package uz.xsoft.november

class Solution36 {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        return checkColumnAndRow(board) && checkSudoku(board)
    }

    private fun checkColumnAndRow(board: Array<CharArray>): Boolean {
        val resultColumn = HashSet<Char>()
        val resultRow = HashSet<Char>()
        for (i in board.indices) {
            for (j in board[i].indices) {
                if (resultColumn.contains(board[j][i]) && resultRow.contains(board[i][j])) return false
                else if (board[j][i].isDigit()) resultColumn.add(board[j][i])
                else if (board[i][j].isDigit())resultRow.add(board[i][j])
            }
            resultColumn.clear()
        }
        return true
    }

    private fun checkSudoku(board: Array<CharArray>): Boolean {
        val result = HashSet<Char>()
        for (row in 0 until 9 step 3) {
            for (column in 0 until 9 step 3) {
                for (i in row until row + 3) {
                    for (j in column until column + 3) {
                        if (result.contains(board[i][j])) return false
                        else if (board[i][j].isDigit()) result.add(board[i][j])
                    }
                }
                result.clear()
            }
        }
        return true
    }
}