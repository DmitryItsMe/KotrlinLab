package p2

fun main() {
    val x = false
    val y = false
    val z = true

    println((x or y) and !z)
    println(x and !(y or z))
    println(!x and !y)
    println(x and (!y or z))
    println(!(x and z) or y)
    println(x or !(y or z))
}