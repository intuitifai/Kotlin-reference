import java.util.*

fun main(args:Array<String>){
    //input
    print("Enter your date of birth");
    var DOB:Int= readLine()!!.toInt();


    //process
    var year:Int=Calendar.getInstance().get(Calendar.YEAR);
    var age:Int=year-DOB;

    //output
    println("your age is $age yrs");
}