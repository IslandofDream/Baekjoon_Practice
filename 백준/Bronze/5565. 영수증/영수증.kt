import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var price = readLine().toInt()
    repeat(9){
        price -= readLine().toInt()
    }
    print(price)
}