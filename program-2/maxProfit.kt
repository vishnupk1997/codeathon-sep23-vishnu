import java.util.Arrays

fun main() {
    print(
        maxProfit(intArrayOf(100, 180, 260, 310, 40, 535, 695))
    )
}

// Program 2: Maximum Stock Profit wherer input is [100,180,260,310,40,535,695]	 and output is [100,180,260,310,40,535,695]
fun maxProfit(price: IntArray): Int {
    var profit = 0
    for (i in 1 until price.size) {
        if (price[i] > price[i - 1]) profit += price[i] - price[i - 1]
    }
    return profit
}