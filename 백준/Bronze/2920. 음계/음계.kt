import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val asc = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8)
    val des = mutableListOf(8, 7, 6, 5, 4, 3, 2, 1)
    val line = nextLine().split(" ")
    val temp = line.map { it.toInt() }
    if (temp == asc) {
        print("ascending")
    } else if (des == temp) {
        print("descending")
    } else {
        print("mixed")
    }
}
