// Sum of Even numbers till n

fun main(){
    val n:Int = 10
    var sum:Int =0
    var i:Int =1
    while(i<=n){
        if(i%2 == 0) sum+=i
        i++
    }
    println("Sum of even numbers till $n is $sum")
}