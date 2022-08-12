import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine()!!.toInt()
    val deque = LinkedList<Int>()
    val sb = StringBuilder()
    for (i in 1..n) {
        val command = readLine()!!.split(" ")
        when (command[0]) {
            "push_front" -> deque.add(0, command[1].toInt())
            "push_back" -> deque.add(deque.lastIndex+1, command[1].toInt())
            "pop_front" -> if (deque.isEmpty()) sb.append("-1\n") else {
                sb.append("${deque.first()}\n")
                deque.removeFirst()
            }
            "pop_back" -> if (deque.isEmpty()) sb.append("-1\n") else {
                sb.append("${deque.last()}\n")
                deque.removeLast()
            }
            "size" -> sb.append("${deque.size}\n")
            "empty" -> if (deque.isEmpty()) sb.append("1\n") else sb.append("0\n")
            "front" -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.first()}\n")
            "back" -> if (deque.isEmpty()) sb.append("-1\n") else sb.append("${deque.last()}\n")
        }
    }
    print(sb)
}