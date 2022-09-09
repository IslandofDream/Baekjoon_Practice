import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (b,n) = readLine().split(" ")
    val N = n.toInt()
    var result = 0
    b.forEachIndexed { index, c ->
        if(c in '0'..'9')
            result = result*N + (c-'0')
        else
            result = result*N + (c-'A'+10)
    }
    print(result)
}
