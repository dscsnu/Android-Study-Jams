// Armstrong number or not - 3 digits

//Armstrong number is a number which satisfies
//ab = a^2 + b^2
//abc = a^3 + b^3 + c^3

//To check this, there are multiple ways such as
//a) Dividing the number with 10 till the number becomes 0
//	Eg: var n=123
//	    var m = n%10 //gives last digit i.e. 3
//	    n = n/10     //gives all digits without last digit i.e. 12
//	and by iterating we can get each digit and by adding digit power number of digits
//	we get the same number that we started with i.e. n if its an armstrong
//	
//b) Converting number to string, spliting each character, converting each to int when
//   adding the digit power number of digits, We still get the final answer
//   
//Its just how you approch the problem

fun main(){
    val n:Int = 407
	var originalValue:Int=n
    var sum:Double=0.0
    var digitsArray =  originalValue.toString().chunked(1)
    	
    var i:Int=0
    do{
        //Math.pow(a,b) gives a double with value a^b
        //digitsArray[i] iterates through each item in the array which have each digit
        sum+=Math.pow(digitsArray[i].toDouble(),3.0)
        i++
    }while(i<3)
   
    var intSum:Int = sum.toInt()
    if(intSum==n)println("$intSum is a Armstrong Number")
    else println("$n is not an Armstrong Number")
}