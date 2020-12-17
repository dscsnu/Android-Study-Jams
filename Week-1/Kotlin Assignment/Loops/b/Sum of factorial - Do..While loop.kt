// Sum of factorial of the given number

fun factorial(n:Int):Int{
    var fact: Int = 1
    var i:Int=1
    do{
        fact *= i
        i++
    }
    while (i <= n)
    return fact
}

fun main(){
    val n:Int = 10
    var sum:Int =0
    var j:Int=1
    do{
        sum+=factorial(j)
        j++
    }while(j<=n)
    

    println("Sum of Factorial of $n is $sum")
}