fun main(args:Array<String>){

    var t1 = thread("thread1")
    t1.start()
    var t2 = thread("thread2")
    t2.start()
    var t3 = thread("thread3")
    t3.start()
    t3.join()
    println("Thread is run")
}
class thread:Thread{

    var ThreadName:String?=null
    constructor(ThreadName: String):super(){
        this.ThreadName=ThreadName
        println("${this.ThreadName} started")
    }
    override fun run() {
        //write thread
        var count=0;
        while (count<10)
        {
            println("$ThreadName count is $count")
            count++;
            try {
                Thread.sleep(1000)
            }
            catch (ex:Exception){
                print(ex.message)
            }
        }
    }
}