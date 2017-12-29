fun main(args:Array<String>){
    var arrayList=ArrayList<String>();
    arrayList.add("rahul")
    arrayList.add("is")
    arrayList.add("a")
    arrayList.add("good")
    arrayList.add("boy")

    for(index in arrayList){
        println(index)
    }
    arrayList.set(4,"programmer")
    for(index:String in arrayList){
        println(index)
    }
    println("who is programmer ? answer is "+ arrayList.get(0) );
    println("printing all the ids of the arrays also");
    for(index in 0..arrayList.size)
        println("index id: "+ index)
}