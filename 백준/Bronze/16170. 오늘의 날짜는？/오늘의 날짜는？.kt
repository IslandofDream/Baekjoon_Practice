import java.time.LocalDate

fun main() {
    val date = LocalDate.now()
    println(date.year)
    println(date.monthValue)
    println(date.dayOfMonth)
}
