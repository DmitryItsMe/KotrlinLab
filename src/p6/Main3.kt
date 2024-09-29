package p6

fun main() {
    val m = arrayOf(1, 3, 5, 2, 0, 8, 9, 10, 14, 6)
    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for(i in 0 until m.size){
        if(m[i] < min) min = m[i]
        if(m[i] > max) max = m[i]
    }
    println("Max: $max")
    println("Min: $min")
}