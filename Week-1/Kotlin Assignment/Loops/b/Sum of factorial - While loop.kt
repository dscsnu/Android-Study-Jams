// Sum of factorial of the given number

fun factorial(n:Int):Int{
    var fact: Int = 1
    var i:Int=1
    while (i <= n){
        fact *= i
        i++
    }
    
    return fact
}

fun main(){
    val n:Int = 10
    var sum:Int =0
    var j:Int=1
    while(j<=n){
        sum+=factorial(j)
        j++
    }
    

    println("Sum of Factorial of $n is $sum")
}