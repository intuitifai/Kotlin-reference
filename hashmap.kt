fun main(args:Array<String>){
    var map=HashMap<Int,String>()
    map.put(1,"rahul")
    map.put(2,"kumar")
    println(map.get(2))
    for(key in map.keys){
        println(map.get(key))
    }
}