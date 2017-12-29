open class operations1(){
    var f:Int?=123
   open fun sum(n1:Int,n2:Int):Int{
        return (n1+n2)
    }
    fun div(n1:Int,n2:Int):Int{
        return (n1/n2)
    }

}
class multipleOperations1():operations1(){
    override  fun sum(n1:Int,n2:Int):Int{
        return (n1+n2*2)
    }
    fun mul(n1:Int,n2:Int):Int{
        return (n1*n2)
    }
    var n:Int= super.f!!
}
fun main(args:Array<String>){
    var op=multipleOperations1()
    var op2=operations1()
    var res1=op.sum(1,2)
    var res2=op.div(4,2)
    var res3:Int=op.mul(2,3)
    println("sum is $res1")
    println("div is $res2")
    println("mul is $res3")
    var res4=op2.sum(4,6)
    println("sum without overriding $res4")
    println(op.n)
    var op45=multipleOperations1() as operations1
    var res45=op45.div(56,4)
    println("res by casting $res45")
}