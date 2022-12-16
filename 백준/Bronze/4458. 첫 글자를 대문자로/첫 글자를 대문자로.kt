import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val array = ArrayList<String>()
    repeat(readLine().toInt()) {
        val temp = readLine()
        if(temp[0].code in 97..122){
            array.add((temp[0].code - 32).toChar() + temp.substring(1,temp.length))
        }
        else array.add(temp)
    }
    array.forEach {
        println(it)
    }
}