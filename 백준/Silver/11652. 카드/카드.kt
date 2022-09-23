import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cards = HashMap<Long,Int>()

    repeat(readLine().toInt()){
        val key = readLine().toLong()
        if(cards[key] == null) cards[key] = 1
        else cards[key] = cards[key]!!+1
    }
    val max = cards.maxOf { it.value }
    val keys = cards.filterValues { it == max }.keys
    print(keys.minOrNull())
}
