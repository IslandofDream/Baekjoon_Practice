import java.lang.StringBuilder

fun main() {
    val count = IntArray(20000002) {0}
    val result = StringBuilder()
    readLine()!!.toInt()
    readLine()!!.split(" ").forEach{ count[it.toInt()+10000000]++ }
    readLine()!!.toInt()
    readLine()!!.split(" ").map{result.append("${count[it.toInt()+10000000]} ")}
    print(result)
}