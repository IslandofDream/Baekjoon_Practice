import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.StringBuilder
import kotlin.collections.ArrayList

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var S = ArrayList<Int>(20)
    val sb = StringBuilder()
    for(i in 1..readLine().toInt()){
        val com = readLine().split(" ")
        when(com[0]){
            "add" -> if(!S.contains(com[1].toInt())) S.add(com[1].toInt())
            "remove" -> if(S.contains(com[1].toInt())) S.remove(com[1].toInt())
            "check" -> if(S.contains(com[1].toInt())) sb.append("1\n") else sb.append("0\n")
            "toggle" -> if(S.contains(com[1].toInt())) S.remove(com[1].toInt()) else S.add(com[1].toInt())
            "all" -> S = arrayListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
            "empty" -> S.clear()
        }
    }
    print(sb)
}