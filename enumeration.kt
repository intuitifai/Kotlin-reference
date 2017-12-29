enum class  Direction{
    North,South,East,West
}
fun main(args:Array<String>){
    var userDirection=Direction.South
    println(userDirection)
    println("Lets check something ")
            if(userDirection==Direction.North){
                println("NO he went north buddy")
    }
        else{
                println("Yikes ! he went south ")
            }
}