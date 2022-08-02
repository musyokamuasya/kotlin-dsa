package leetcode.math


/**
 * This solution throws an error, and I can't figure out why it is not working
 * */
class RotateNumber {
    fun rotate(matrix: Array<IntArray>): Unit {

//      Initialize both left and right pointers
        var left = 0
        var right = matrix.size -1

        while(left < right){
            for(i in 0..(right-left)){
                val top = left
                val bottom = right

//                 Save the top left element
                val topLeft = matrix[top][left + i]

                // move bottom left into top left
                matrix[top][left + i] = matrix[bottom - i][left]

                // move bottom right into bottom left
                matrix[bottom - i][left] = matrix[bottom][right - i]

                // move top right into bottom right
                matrix[bottom][right - i] = matrix[top + i][right]

                // move top left into top right
                matrix[top + i][right] = topLeft

            }

            right -=1
            left += 1
        }
    }
}