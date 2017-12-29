open class operations(){
    var f:Int?=123
    fun sum(n1:Int,n2:Int):Int{
        return (n1+n2)
    }
    fun div(n1:Int,n2:Int):Int{
        return (n1/n2)
    }

}
class multipleOperations():operations(){
    fun mul(n1:Int,n2:Int):Int{
        return (n1*n2)
    }
    var n:Int= super.f!!
}
fun main(args:Array<String>){
    var op=multipleOperations()
    var res1=op.sum(1,2)
    var res2=op.div(4,2)
    var res3:Int=op.mul(2,3)
    println("sum is $res1")
    println("div is $res2")
    println("mul is $res3")
    println(op.n)
}