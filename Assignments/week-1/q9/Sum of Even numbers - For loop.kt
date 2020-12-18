// Sum of Even numbers till n

fun main(){
    val n:Int = 10
    var sum:Int =0
    for (i in 0..n){
        if(i%2 == 0) sum+=i
    }
    println("Sum of even numbers till $n is $sum")
}