import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    readLine()
    val result = mutableListOf<Int>()
    readLine().split(" ").map{ it.toInt() }.forEachIndexed { index, i ->
        result.add(index - i, index +1 )
    }
    print(result.joinToString(" "))
}
