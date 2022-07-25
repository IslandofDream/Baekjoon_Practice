import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val str = nextLine()
    for (i in str){
        if (!i.isLowerCase()) (print(i.lowercaseChar()))
        else print(i.uppercaseChar())
    }
}