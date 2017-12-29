fun main(args:Array<String>){
    var arrInt=Array<Int>(50){56}
    arrInt[3]=55;
    var item:Int?
    println("Printing all the elements of the array");
    for(item in arrInt){

        println(item)

}
    println("All elements by index")
    for(item in 0..56){
        println("item id $item "+arrInt[item])
    }
}