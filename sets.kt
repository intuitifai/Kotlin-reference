fun main(args:Array<String>){
    var setElement= setOf(1,2,3,4,5,6,1,3,2)
    for(index in setElement){
        println(index);
    }

    var setElement2= mutableSetOf(1,2,3,4,5,6,"ge","re")
    setElement2.add("hellow")
    for(index in setElement2){
        println(index)
    }
}