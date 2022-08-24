import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val hashMap = HashMap<String, Int>()
    repeat(readLine().toInt()){
        var count = 1
        hashMap.clear()
        repeat(readLine().toInt()){
            val list = readLine().split(" ")
            if(hashMap[list[1]] != null)
                hashMap.put(list[1], hashMap[list[1]]!!+1)
            else
                hashMap.put(list[1], 1)
        }
        hashMap.values.forEach {
            count *= it+1
        }
        println(count-1)
    }
}