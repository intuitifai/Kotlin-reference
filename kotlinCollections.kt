fun main(args:Array<String>){
    var map= hashMapOf(1 to "rahul",2 to "kumar",3 to "programmer")
    println(map[3])
    println(map.get(3))
    var ar= arrayOf(1,10,22,12)
    println(ar[3])
    var l= mutableListOf(1,10,22,12)
    l.add(1)
    l.add(12213)
    for(index in l){
        println(index)  
    }

}