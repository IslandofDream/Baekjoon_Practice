import java.util.*

fun main() = with(Scanner(System.`in`)) {
    for(i in 1..nextInt()){
        val temp = next()
        println("${temp.first()}${temp.last()}")
    }
}