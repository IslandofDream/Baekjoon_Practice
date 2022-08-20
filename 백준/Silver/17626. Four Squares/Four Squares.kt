import java.io.BufferedReader
import java.io.InputStreamReader
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dp = MutableList<Int>(50001){0}
    val n = readLine().toInt()

    dp[1] = 1
    for (i in 1..n) {
        dp[i] = 1 + dp[i - 1]
        var j = 1
        while (j * j <= i) {
            dp[i] = min(dp[i], dp[i - j * j] + 1)
            j++
        }
    }
    print(dp[n])
}