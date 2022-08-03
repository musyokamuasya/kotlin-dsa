package leetcode.neetcode.easy

class BuySell {
    fun maxProfit(prices: IntArray): Int {
        var min = Int.MAX_VALUE
        var ans = Int.MIN_VALUE
        for (value in prices) {
            min = min.coerceAtMost(value)
            ans = ans.coerceAtLeast(value - min)
        }
        return ans
    }
}