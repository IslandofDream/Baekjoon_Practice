import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var ans = 0
    val s: String = scan.next()
    val b: Int = scan.nextInt()
    for (i in 0 until s.length) {
        ans = if ('0' <= s[i] && '9' >= s[i]) ans * b + (s[i] - '0') else ans * b + (s[i] - 'A' + 10)
    }
    println(ans)
}

