import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

fun sum1(n1:Int, n2:Int):Int{
    println("Overloading ");
    return (n1+n2)
}
fun sum1(n1:Int,n2:Int,n3:Int):Int{
    return (n1+n2+n3)
}
fun callNow(str:String){
    println("String called $str")
}
fun callNow(int:Int){
    println("Integer called $int")
}
fun main(args:Array<String>){
    var res1=sum1(2,3)
    var res2 = sum1(1,2,3)
    callNow(1)
    callNow("hello world")
    println(res1)
    println(res2)
}