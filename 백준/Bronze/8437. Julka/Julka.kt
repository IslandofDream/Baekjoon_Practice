import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val total = nextBigInteger()
    val diff = nextBigInteger()
    val div = 2
    println((total + diff)/ div.toBigInteger())
    println((total - diff)/div.toBigInteger())
}