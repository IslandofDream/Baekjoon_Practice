import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    val N = readLine().split(" ").map { it.toInt() }.sorted().reversed()
    val S = readLine().split(" ").map { it.toInt() }.sorted()
    var count = 0
    for(i in 0 until n){
        count += N[i] * S[i]
    }
    print(count)
}