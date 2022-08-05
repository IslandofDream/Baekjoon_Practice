import java.util.*

fun main() {
    val n = readLine()!!.uppercase(Locale.getDefault())
    val ascii = IntArray(26)
    var count = 0
    n.forEach {
        ascii[it.code -65] += 1
    }
    val max = ascii.maxOrNull()
    ascii.forEach {
        if(it == max)
            count++
    }
    if(count >= 2)
        println("?")
    else
        println((ascii.indexOf(max!!)+65).toChar())
}
