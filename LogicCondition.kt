fun main(args:Array<String>){
   println("Enter the x value here: ");
    var x:Int= readLine()!!.toInt();
    when(x){
        1-> print("value is $x")
        in 2..40->print("value is $x");
        else->{
            print("out of range");
        }
    }
    for(item in 1..10){
        print("hi")
    }
    var i:Int?
}