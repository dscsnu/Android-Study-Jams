// check whether the triangle is equilateral, isosceles or scalene triangle

fun main(){
    val side1:Int = 7
    val side2:Int = 7
    val side3:Int = 7
    
    if(side1==side2 && side2==side3) println("Its a Equilateral triangle")
    else if(side1==side2 || side1==side3 || side2==side3) println("Isosceles triangle")
    else println("scalene triangle")
    
}