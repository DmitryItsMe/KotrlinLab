package pt10

fun main() {
    val r = 5
    var n = 0
    for (i in 1..r) {
        for (i in 1..r-i) {
            print("  ")
        }
        while (n != 2*i-1) {
            print("# ")
            n++
        }
        println()
        n = 0
    }
}