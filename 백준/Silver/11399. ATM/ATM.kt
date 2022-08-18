import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val num = readLine().split(" ").map { it.toInt() }.sorted()
    val result = IntArray(n)

    for(i in num.indices){
        if(i == 0) result[0] = num[0]
        else result[i] = num[i] + result[i-1]
    }
    print(result.sum())
}