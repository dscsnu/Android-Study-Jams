// Sum of factorial of the given number

fun factorial(n:Int):Int{
    var fact: Int = 1
    for (i in 1..n){
        fact *= i
    }
    return fact
}

fun main(){
    val n:Int = 10
    var sum:Int =0
    for (j in 1..n){
        sum+=factorial(j)
    }
    println("Sum of Factorial of $n is $sum")
}