fun main(){
    val n = readLine()!!.toInt()
    val arr = IntArray(n)
    var count1 = 0
    var count2 = 0
    fun fibo(n: Int): Int {
        if (n == 1 || n == 2){
            count1++
            return 1
        }
        return fibo(n - 1) + fibo(n - 2)
    }

    fun tail_fibo(n:Int): Int {
        count2++
        if (n ==1 || n == 2) return 1
        for(i in 3 until n){
            count2++
            arr[i] = arr[i-1] + arr[i-2]
        }
        return arr[n-1]
    }
    fibo(n)
    tail_fibo(n)
    println("${count1} ${count2}")
}