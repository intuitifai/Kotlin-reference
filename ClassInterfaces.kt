 interface op{
    fun sum(n1:Int,n2:Int)
    fun div(n1:Int,n2:Int)
}
class UserOp:op{
    override fun sum(n1:Int,n2:Int){
        print(n1+n2)
    }
    override fun div(n1:Int,n2:Int){
        print(n1/n2)
    }
}
 class ManagerOp:op{
     override fun sum(n1:Int,n2:Int){
         println(n1+n2)
     }
     override fun div(n1:Int,n2:Int){
         println(n1/n2)
     }
     fun helloworld(string:String){
         println("String is $string")
     }
 }
 fun main(args:Array<String>){
     var man=ManagerOp()
     man.helloworld("hello world")
     man.div(4,2)
     man.sum(45,23)
 }