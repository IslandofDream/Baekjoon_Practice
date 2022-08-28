import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dp = mutableListOf<Int>()
    val n = readLine().toInt()

    for (i in 0..n / 5) {
        if ((n - i * 5) % 3 == 0) dp.add(i ,i + (n - i * 5)/3)
        else dp.add(i ,-1)
    }
    if(dp.all { it == -1 }) print(-1)
    else print(dp.filterNot { it == -1  }.minOrNull())

}