import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dp = MutableList<Long>(117){0}
    val n = readLine().toInt()

    for(i in 1..n){
        if(i in 1..3) dp[i] = 1
        else {
            dp[i] = dp[i-1] + dp[i-3]
        }
    }
    print(dp[n])
}