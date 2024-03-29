package leetcode

class RomanToNumber {
    fun romanToInt(s: String): Int {

//         Store hashtable of symbol and value
//          Check if the number on the left is larger than the number on the right
        val romanMap: MutableMap<Char, Int> = HashMap()
        romanMap['I'] = 1
        romanMap['V'] = 5
        romanMap['X'] = 10
        romanMap['L'] = 50
        romanMap['C'] = 100
        romanMap['D'] = 500
        romanMap['M'] = 1000

        val n = s.length

        var number = romanMap[s[n-1]]!!
        for(i in n - 2 downTo 0){
//             Check if the number on the left is larger than the number on the right
            if(romanMap[s[i]]!! >= romanMap[s[i+1]]!!){
//             In that case, add the two numbers
                number += romanMap[s[i]]!!
            }

            else{
                number -= romanMap[s[i]]!!
            }
        }
        return number

    }
}