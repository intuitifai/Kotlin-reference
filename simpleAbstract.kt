abstract class credit(){
    fun creditID():String{
        return "4353-6424-6553-2234"
    }
    abstract fun info():Unit

}
class inheritedCredit():credit(){
    override fun info(){
        println("Hello this is your card number")
    }
}
fun main(args:Array<String>){
    var c=inheritedCredit()
    println(c.creditID())
    c.info()
}