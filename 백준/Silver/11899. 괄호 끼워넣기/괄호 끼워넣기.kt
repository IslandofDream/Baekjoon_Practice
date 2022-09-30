import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val stack = Stack<Char>()
    var count = 0
    readLine().forEach {
        if(stack.isEmpty() && it == ')') count++
        else if(it == '(')stack.push('(')
        else stack.pop()
    }
    print(count+stack.size)
}
