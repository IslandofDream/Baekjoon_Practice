import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var fac: Long = 1
    for (i in 1..nextLong()) {
        fac *= i
    }
    print(fac)
}
