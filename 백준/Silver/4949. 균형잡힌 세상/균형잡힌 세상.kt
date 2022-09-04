import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val bracket = Stack<Char>()
    var FLAG = true
    while (true) {
        bracket.clear()
        FLAG = true
        val sen = readLine()
        if (sen == ".") {
            break
        }

        loop@ for (c in sen) {
            when (c) {
                '(' -> bracket.push(c)
                '[' -> bracket.push(c)
                ')' -> {
                    if (bracket.isEmpty()) {
                        FLAG = false
                        break@loop
                    } else (
                            if (bracket.pop() != '(') {
                                FLAG = false
                                break@loop
                            }
                            )
                }
                ']' -> {
                    if (bracket.isEmpty()) {
                        FLAG = false
                        break@loop
                    } else (
                            if (bracket.pop() != '[') {
                                FLAG = false
                                break@loop
                            }
                            )
                }
            }
        }
        if (FLAG && bracket.isEmpty()) println("yes")
        else println("no")
    }
}