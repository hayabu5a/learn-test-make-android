import java.util.*

fun main(args:Array<String>){

    //input

    print("Enter Your Birth Year: ")
    var YOB:Int= readLine()!!.toInt()

    //process
    var year= Calendar.getInstance().get(Calendar.YEAR)
    var age:Int= 2017 - YOB
    var rage:Int= year - YOB

    //output
    println("Your Age is $age Years")
    println("Your Real Age is $rage Years")
}