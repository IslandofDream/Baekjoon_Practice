import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val array = ArrayList<Pair<Int, Int>>()
    val rank = mutableListOf<Int>()
    repeat(readLine().toInt()) {
        val (first, second) = readLine().split(" ").map { it.toInt() }
        array.add(Pair(first, second))
        rank.add(0)
    }
    array.forEachIndexed{ index, pair ->
        val temp = pair
        array.forEach { pair ->
            if(temp.first < pair.first && temp.second < pair.second) rank[index]++
        }
    }
    rank.forEach{
        print("${it+1} ")
    }

}