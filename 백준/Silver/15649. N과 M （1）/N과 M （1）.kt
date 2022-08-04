fun main(){
    val (n,m) = readLine()!!.split(" ").map{it.toInt()}
    val num = IntArray(m) {0}
    val used = BooleanArray(n+1) {false}


    fun bt(par : Int){
        if(m==par) {
            println(num.joinToString(" "))
            return
        }
        
        for(i in 1..n){
            if(!used[i]){
                num[par] =  i
                used[i]= true
                bt(par+1)
                used[i]=false
            }
        }
    }
    bt(0)
}
