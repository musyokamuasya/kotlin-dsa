package leetcode
/**
 * Check valid anagram
 * Code does not work because of line 11 & 12
 * You can correct
 * */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val store = IntArray(26)
        for (i in 0 until s.length) {
            store[s[i].code - 'a'.code]++
            store[t[i].code - 'a'.code]--
        }
        for (n in store) if (n != 0) return false
        return true
    }
}