import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var pattern = ""
    repeat(readLine().toInt()) {
        val temp = readLine()
        if (it == 0) pattern = temp
        else {
            temp.forEachIndexed { index, c ->
                if (pattern[index] != '?' && pattern[index] != temp[index]) pattern =
                    pattern.substring(0, index) + '?' + pattern.substring(index+1)
            }
        }
    }
    print(pattern)
}