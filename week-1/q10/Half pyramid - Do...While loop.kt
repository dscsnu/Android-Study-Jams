// Print half pyramid  

fun main(){
    val n:Int = 4

    var i: Int=1
    var j: Int=1
    do{
        do{
            print("#")
            j++
        }while(j<=i)
        j=1  
        i++
        println()
    }while(i<=n)
}