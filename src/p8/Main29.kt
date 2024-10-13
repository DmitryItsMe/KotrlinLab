package p8

fun main() {
    val list = arrayListOf(1, 4, 2, 5, 6, 0)
    s29(list)
}

fun s29(list: List<Int>){
    val mx = list.maxOrNull() ?: 0
    val mn = list.minOrNull() ?: 0
    println("max: $mx\nmin: $mn")
}