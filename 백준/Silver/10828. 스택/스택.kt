fun main() {
    val n = readLine()!!.toInt()
    val stack = mutableListOf<Int>()
    for (i in 1..n) {
        val command = readLine()!!.split(" ")
        when (command[0]) {
            "push" -> stack.add(command[1].toInt())
            "pop" -> if (stack.isEmpty()) println("-1") else {
                println(stack.last())
                stack.removeLast()
            }
            "size" -> println(stack.size)
            "empty" -> if (stack.isEmpty()) println("1") else println("0")
            "top" -> if (stack.isEmpty()) println("-1") else println(stack.last())
        }
    }
}