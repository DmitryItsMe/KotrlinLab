package p2

fun main() {
    val x = true
    val y = true
    val z = false

    println(!x and y)
    println(x or !y)
    println(x or (y and z))
}