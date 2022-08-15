import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    val t = readLine().toInt()
    val apart = Array(15){IntArray(15){0}}

    for(i in 0 until 15){
        for(j in 0 until 15){
            if(i == 0 || j == 0) apart[i][j] = j+1
            else apart[i][j] = apart[i-1][j] + apart[i][j-1]
        }
    }

    for(i in 1..t){
        println(apart[readLine().toInt()][readLine().toInt()-1])
    }

}