import java.util.*

fun main() = with(Scanner(System.`in`)){
    val cou = nextLine()
    val array = nextLine().split(" ")
    val con = nextInt()
    var count  = 0
    for(i in array)
        if(i.toInt() == con)
            count += 1
    print(count)
}