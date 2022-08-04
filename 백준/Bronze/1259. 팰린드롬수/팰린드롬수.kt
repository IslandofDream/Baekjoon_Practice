fun main() {
    while (true) {
        val temp = readLine()!!
        if (temp == "0") break
        var palindrome = true

        for (i in 0 until (temp.length) / 2) {
            if (temp[i] != temp[temp.length -1 - i]) {
                palindrome = false
                break
            }
        }
        if(palindrome) println("yes") else println("no")
    }
}