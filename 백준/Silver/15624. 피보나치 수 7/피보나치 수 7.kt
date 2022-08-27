import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dp = MutableList<Long>(1000001){0}
    val n = readLine().toInt()

    for(i in 0..n){
        if(i == 0) dp[i] = 0
        else if(i == 1) dp[i] = 1
        else {
            dp[i] = ((dp[i-1] + dp[i-2])%1000000007)
        }
    }
    print(dp[n])
}