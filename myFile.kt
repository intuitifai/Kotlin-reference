import java.io.FileReader
import java.io.FileWriter

fun main(args:Array<String>){
    var choice:Int?
    println("1->Write\n2->Read")
    println("Enter the choice here")
    choice= readLine()!!.toInt()
    if(choice==1) {
        println("Enter the text here")
        var str = readLine()!!.toString()
        WriteToFile(str)
    }

else {

        println("The total text will be")
        ReadFromFile()
    }
}
fun WriteToFile(str:String){
    try {
        var fout = FileWriter("test.txt",true)
        fout.write(str+"\n")
        fout.close()
        println("Data is saved")
    }catch (ex:Exception){
        println(ex.message)
    }
}
fun ReadFromFile(){
    try{
        var fin=FileReader( "test.txt")
        var c:Int?
        do{
            c=fin.read()
            print(c.toChar())

        }while (c!=-1)
    }
    catch (ex:Exception){
        println(ex.message)
    }
}