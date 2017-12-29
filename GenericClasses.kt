import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS

class UserAdmins<T>(credit:Any ){
    init {
        println("Generic class prints $credit")
    }
}
fun <T>display(data:Any){
        println("You entered $data")
}
fun main(args:Array<String>){
    var User=UserAdmins<String>("hello world")
    var User2=UserAdmins<Int>(23)
    var User3=UserAdmins<Double>(23.5)
    var User4=UserAdmins<Float>(234.34)
    display<Int>(23)
    display<String>("Hello world again")
    display<Double>(23.342223)
    



    }