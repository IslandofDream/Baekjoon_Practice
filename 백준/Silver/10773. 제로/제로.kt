import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val money = Stack<Int>()
    for(i in 0 until n){
        val temp = readLine()!!.toInt()
        if(temp == 0)
            money.pop()
        else
            money.push(temp)
    }
    print(money.sum())
}