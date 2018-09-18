

fun main(args: Array<String>){

    println("--*-- Mathematics Calculator --*--")

    println("Enter Number: ")
    var n1:Float= readLine()!!.toFloat()

    println("Enter Number Again: ")
    var n2:Float= readLine()!!.toFloat()

    var sum:Float?
    sum = n1 * n2

    println("Your Answer is: "+ sum)
    println("Thank You!")



}