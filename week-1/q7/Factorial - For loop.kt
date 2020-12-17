// factorial of the given number

fun main(){
    val n:Int = 10
    var factorial: Int = 1
    for (i in 1..n) {
        factorial *= i
    }
    println("Factorial of $n is $factorial")
}