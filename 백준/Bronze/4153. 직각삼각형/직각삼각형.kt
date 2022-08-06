import kotlin.math.pow

fun main() {
    while (true){
        val list = readLine()!!.split(" ").map { it.toInt() }
        if(list.all { it == 0 }) break
        if(list.maxOrNull()!!.toFloat().pow(2) == list.filter { it != list.maxOrNull()!! }.sumOf { it*it }.toFloat() ) println("right") else println("wrong")
    }
}
