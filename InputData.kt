

fun main(args:Array<String>){

    print("Enter Your Name: ")
    var name= readLine()

    print("Enter Your Age: ")
    var age= readLine()!!.toInt()

    print("Enter Your Department: ")
    var dep= readLine()

    print("Enter Pi Value: ")
    val pi:Double= readLine()!!.toDouble()

    println("*** Output ***")
    println("Name: "+ name)
    println("Age: "+ age)
    println("Department: "+ dep)
    println("Pi: "+ pi)

}