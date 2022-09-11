import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dice = readLine().split(" ").map{it.toInt()}
    val die = dice.toMutableSet()
     if(die.size == 1)print((10000 + die.first()*1000)) 
     else if(die.size == 2){
        if(dice[0] == dice[1]) print(1000 + dice[0]*100)
        else if(dice[0] == dice[2]) print(1000 + dice[0]*100)
        else print(1000 + dice[1]*100)
    }
     else print(dice.maxOrNull()!!*100)
}