import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val hei = nextInt()
    val wid = nextInt()
    val num = nextInt()
    print("${num/wid} ${num%wid}")
}
