import java.util.*

fun main() { 10845
    val n = readLine()!!.toInt()
    val queue = LinkedList<Int>()
    for (i in 1..n) {
        val command = readLine()!!.split(" ")
        when (command[0]) {
            "push" -> queue.add(command[1].toInt())
            "pop" -> if (queue.isEmpty()) println("-1") else {
                println(queue.first())
                queue.removeFirst()
            }
            "size" -> println(queue.size)
            "empty" -> if (queue.isEmpty()) println("1") else println("0")
            "front" -> if (queue.isEmpty()) println("-1") else println(queue.first())
            "back" -> if (queue.isEmpty()) println("-1") else println(queue.last())
        }
    }
}