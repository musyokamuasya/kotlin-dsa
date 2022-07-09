package leetcode

class Palindrome {
/**
 * @FirstSolution
 * The first solution involves reversing the number, and checking whether the reversed number is same with the original number
 *
 * If they are the same, the number is palindrome, else it is not
 *
 * @SecondSolution
 * Work with the numbers as string
 * Compare the first number with the last number. If the numbers match, the number is palindrome. Otherwise, it is not
 *
 * @ThirdSolution -> Utilised in this assignment
 * Divide the number by ten. Compare the reminder for each time with number at each index
 * For example Working with 1234321
 * Divide with 10, reminder will be 1, compare with 1 and move on
 * */

    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false // negative numbers are never palindromes because of the "-" at the beginning
//    Create a copy of the code number
        var y = x
//    Array to store the numbers
        val array = mutableListOf<Int>() // array of digits in x
//Add reminder to the array each time
        while (y!=0){
            array.add(y%10) // add a digit into array
            y = y/10
        }

        var leftDigit = array.size-1
        var rightDigit = 0

        while (leftDigit-rightDigit > 0) {

            if (array[leftDigit] != array[rightDigit]) return false

            leftDigit--
            rightDigit++
        }

        return true
    }
}