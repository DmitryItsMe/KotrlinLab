package p6

fun main() {
    val m = arrayOf(1, 3, 5, 2, 0)
    var s = 0
    for(i in 0 until m.size){
        print("${m[i]} ")
        s += m[i]
    }
    println("\n$s")
}