import java.io.BufferedReader
import java.io.InputStreamReader
import java.math.BigDecimal

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dp = MutableList(4799){ BigDecimal(0)}
    val n = readLine().toInt()

    for(i in 0..n){
        if(i == 0) dp[i] = BigDecimal(0)
        else if(i == 1) dp[i] = BigDecimal(1)
        else {
            dp[i] = dp[i-1] + dp[i-2]
        }
    }
    print(dp[n])
}