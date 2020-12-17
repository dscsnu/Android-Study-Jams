// factorial of the given number

fun main(){
    val n:Int = 10
    var factorial: Int = 1
    var i:Int=1
    while (i <= n) {
        factorial *= i
        i++
    }
    println("Factorial of $n is $factorial")
}