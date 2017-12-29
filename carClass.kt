import java.security.acl.Owner

class car(){
       var Owner:String?=null
        var Price:  Double?=null
    constructor(Type:String, Model:Int, Price:Double, MilesDrive:Int, Owner:String):this(){
            println("Type  :$Type")
            println("Model  :$Model")
            println("Price  :$Price")
            println("MilesDrive  :$MilesDrive")
            println("Owner  :$Owner")
            this.Owner=Owner;
            this.Price=Price
        }
    constructor(type:String):this(){
        print("String is $type")
    }
    fun getowner(): String? {
        return this.Owner
    }
    fun getprice(): Double? {
        return  this.Price
    }
}
fun main(args:Array<String>){
    var newCar1= car("4 seater",2,1230000.00,123,"RAHUL");
    var newCar2= car("2 seater",3,1234000.00,122,"KUMAR");
    var newCar3= car("2 seater",4,1235000.00,143,"RAHUL");
    var newCar4= car("3 seater",5,1236000.00,113," ");
    var Owner:String?=newCar1.getowner();
    println(Owner)
    var own=car("hello world")
}