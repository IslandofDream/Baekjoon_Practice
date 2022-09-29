import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val list = HashMap<String, Boolean>()
    val sb= StringBuilder()
    repeat(readLine().toInt()){
        val (name,enter) = readLine().split(" ")
        list[name] = enter == "enter"
    }
    list.filterValues { it }.keys.sortedDescending().forEach {
        sb.append("$it\n")
    }
    print(sb)
}
