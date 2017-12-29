fun ArrayList<String>.swap(index1:Int,index2:Int){
    var temp:String=this.get(index1)
    this.set(index1,this.get(index2))
    this.set(index2,temp)

}


fun main(args:Array<String>){
    var arraylist=ArrayList<String>()
    println("Before swapping anything ") ; println()
    arraylist.add("Rahul")
    arraylist.add("john")
    arraylist.add("tarzan")
    println(arraylist)
    println()
    arraylist.swap(2,0)
    println("After swapping index 1 with index 3")
    println()
    println(arraylist)
    /*Output
     Before swapping anything

    [Rahul, john, tarzan]

    After swapping index 1 with index 3

    [tarzan, john, Rahul]

    Process finished with exit code 0
*/

}