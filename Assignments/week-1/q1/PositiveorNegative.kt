// check if the given number is Positive or negative

fun main() {
    val n:Int = 0
    if(n<0)println("$n is a negative number")
    else if(n>0)println("$n is a positive number")
    else println("$n is neither positive nor negative")
}
// ".kt": "cd $dir && kotlinc $fileName -include-runtime -d $fileNameWithoutExt.jar && java -jar $fileNameWithoutExt.jar",