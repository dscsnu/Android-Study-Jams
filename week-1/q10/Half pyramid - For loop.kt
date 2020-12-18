// Print half pyramid  

fun main(){
    val n:Int = 4
    
    for (i in 1..n) {
        for (j in 1..i) {
            print("#")
        }
        println() //Used to add newline char else o/p will be ########## for n=4
    }
}