import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val(n,m) = readLine().split(" ").map { it.toInt() }
    val nums = readLine().split(" ").map { it.toInt() }
    val dp = MutableList(n+1){0}
    nums.forEachIndexed { index, it ->
        dp[index+1] += dp[index] + nums[index]
    }
    for(i in 1..m){
        val (f,l) = readLine().split(" ").map { it.toInt() }
        println(dp[l] - dp[f-1])
    }
}