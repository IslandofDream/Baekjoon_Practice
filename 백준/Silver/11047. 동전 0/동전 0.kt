import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, k) = readLine().split(" ").map { it.toInt() }
    val coins = IntArray(n)
    var count = 0

    for (i in 0 until n) {
        coins[i] = readLine().toInt()
    }
    for (coin in coins.reversed()) {
        if (k >= coin) {
            count += k / coin
            k -= (k/coin) * coin
        }
        if (k == 0) break
    }
    print(count)
}