import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val n = readLine()
    val num = n.toInt() - n.length * 9
    var temp = 0
    for(i in num..n.toInt()){
        i.toString().forEach {
            temp += it.code - 48
        }

        if(n.toInt() == temp + i){
            temp = i
            break
        }
        temp = 0
    }
    print(temp)
}