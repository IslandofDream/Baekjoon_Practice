import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val list = MutableList<Int>(30, {i->0})
    for(i in 1..28){
        val temp = nextInt()
        list[temp-1] = temp
    }
    for(i in 0..29)
    {
        if(list[i] == 0){
            println(i+1)
        }
    }
}