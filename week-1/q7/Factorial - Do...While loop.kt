// factorial of the given number

fun main(){
    val n:Int = 10
    var factorial: Int = 1
    var i:Int=1
    do{
        factorial *= i
        i++
    }
    while (i <= n)
    println("Factorial of $n is $factorial")
}