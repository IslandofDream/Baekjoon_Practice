import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val CHESS = listOf<Int>(1,1,2,2,2,8)
    val chess = nextLine().split(" ")
    var count = 0
    for(i in chess)
    {
        print(CHESS[count]- i.toInt())
        print(" ")
        count += 1
    }
}