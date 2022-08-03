import java.io.BufferedReader
import java.io.InputStreamReader

fun main() =with(BufferedReader(InputStreamReader(System.`in`))){
    val (n,m)= readLine().split(" ").map { it.toInt() }
    val num = IntArray(m){ 0 }
    val used = BooleanArray(n + 1) { false }


    fun dfs(par: Int){
        if(par == m){
            println(num.joinToString(" "))
            return
        }
        for(i in 1..n){
            if(!used[i]){
                num[par] = i
                used[i] = true
                dfs(par+1)
                used[i] = false
            }
        }
    }
    dfs(0)

}
