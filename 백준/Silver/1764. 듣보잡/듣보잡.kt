import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,m) = readLine().split(" ").map { it.toInt() }
    val sb = StringBuilder()
    val deut = mutableSetOf<String>()
    val deutbo = mutableListOf<String>()

    for(i in 0 until n) deut.add(readLine())
    for(i in 0 until m){
        val bo = readLine()
        if(deut.contains(bo))
            deutbo.add(bo)
    }

    sb.append("${deutbo.size}\n")
    for(x in deutbo.sorted()) sb.append("$x\n")
    print(sb)
}