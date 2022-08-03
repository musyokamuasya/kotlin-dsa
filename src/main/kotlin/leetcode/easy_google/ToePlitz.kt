package leetcode.easy_google
class ToePlitz {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        var i = 0
        while (i + 1 < matrix.size) {
            var j = 0
            while (j + 1 < matrix[0].size) {
                if (matrix[i][j] != matrix[i + 1][j + 1]) return false
                ++j
            }
            ++i
        }
        return true
    }
}