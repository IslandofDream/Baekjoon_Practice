import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.math.min

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var two = 0
    var five = 0
    var temp = 0
    val n = readLine().toInt()

    for(i in n downTo 1) {
        temp = i
        while (temp % 2 == 0) {
            two++
            temp /= 2
        }
        temp = i
        while (temp % 5 == 0) {
            five++
            temp /= 5
        }
    }
    print(min(two,five))
}