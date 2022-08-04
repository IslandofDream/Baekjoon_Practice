fun main(){
    val n = readLine()!!.toInt()
    val line = BooleanArray(n+1) {false}
    val diagonal1 = BooleanArray(2*n) {false}
    val diagonal2 = BooleanArray(2*n) {false}
    var total = 0

    fun bt(par : Int){
        if(n==par) {
            total++
            return
        }

        for(i in 0 until n){
            if(!line[i] && !diagonal1[i+par] && !diagonal2[par-i+n-1]){
                line[i]= true
                diagonal1[i+par] = true
                diagonal2[par-i+n-1] = true
                bt(par+1)
                line[i]= false
                diagonal1[i+par] = false
                diagonal2[par-i+n-1] = false
            }
        }
    }
    bt(0)
    println(total)
}