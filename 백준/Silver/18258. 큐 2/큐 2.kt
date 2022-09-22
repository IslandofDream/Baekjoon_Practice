import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
        val sb = StringBuilder()
        val n = readLine().toInt()
        val queue = LinkedList<Int>()

        for (i in 1..n) {
            val command = readLine().split(" ")
            when (command[0]) {
                "push" -> queue.add(command[1].toInt())
                "pop" -> if (queue.isEmpty()) sb.append("-1\n") else {
                    sb.append("${queue.first()}\n")
                    queue.removeFirst()
                }
                "size" -> sb.append("${queue.size}\n")
                "empty" -> if (queue.isEmpty()) sb.append("1\n") else sb.append("0\n")
                "front" -> if (queue.isEmpty()) sb.append("-1\n") else sb.append("${queue.first()}\n")
                "back" -> if (queue.isEmpty()) sb.append("-1\n") else sb.append("${queue.last()}\n")
            }
        }
    print(sb)
}