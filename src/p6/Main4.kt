package p6

fun main() {
    val m = arrayOf(1, 3, 5, 2, 0, 8, 9, 10, 14, 6)
    m.sort()
    for(i in 0 until m.size){
        print("${m[i]} ")
    }
}