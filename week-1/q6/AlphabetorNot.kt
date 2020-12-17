// check whether a character is alphabet or not

fun main(){
    val char:String = "a"
	if (char in "a".."z" || char in "A".."Z")
        println("$char is an alphabet.")
    else
        println("$char is not an alphabet.")
}