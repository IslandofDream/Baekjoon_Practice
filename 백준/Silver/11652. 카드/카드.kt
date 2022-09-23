import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val cards = HashMap<Long,Int>()

    repeat(readLine().toInt()){
        val key = readLine().toLong()
        if(cards[key] == null) cards[key] = 1
        else cards[key] = cards[key]!!+1
    }
    var max = 0
    cards.values.forEach{
        if(max<it) max = it
    }
    val keys = cards.filterValues { it == max }.keys
    print(keys.minOrNull())
}