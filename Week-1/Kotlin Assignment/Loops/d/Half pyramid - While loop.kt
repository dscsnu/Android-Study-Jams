// Print half pyramid  

fun main(){
    val n:Int = 4

    var i: Int=1
    var j: Int=1
    while(i<=n){
        while(j<=i){
            print("#")
            j++
        }
        j=1  //Resetting value of j so it won't be same
        i++
        println()
    }
}