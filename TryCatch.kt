fun main(args:Array<String>){
    try {
        println("Enter the number")
        var n2: Int = readLine()!!.toInt()
        var Div = 100 / n2
        println("DIV => $Div")
    }
    catch (ex:Exception){
        print(ex.message)
    }
}