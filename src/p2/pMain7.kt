package p2

fun main() {
    val a = true
    val b = false
    val c = false

    println(a or !(a and b) or c)
    println(!a or a and (b or c))
    println((a or b and !c) and c)
}