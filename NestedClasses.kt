

class Outer{
    private val name:String?="hi there";
      class Nested{
        fun show(){
            println("Dont change to inner ! As it cannot be accesed from the main function")
        }
    }
}
fun main(args:Array<String>){
    var outer=Outer()
        var nested= Outer.Nested()
    nested.show()
}