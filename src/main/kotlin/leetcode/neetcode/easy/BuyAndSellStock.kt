package leetcode.neetcode.easy

class BuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var amount = 0

        var left = 0

        for(right in prices){
            if(prices[right] < prices[left]){
                left = right
            }
            val diff = prices[left] - prices[right]
            amount = maxOf(amount, diff)
        }

        return amount
    }
}