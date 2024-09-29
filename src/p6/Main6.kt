package p6

fun main() {
    var list = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var listCh = arrayListOf<Int>()
    var listNc = arrayListOf<Int>()
    for(i in 0 until list.size) {
        if (list[i] % 2 == 0) listCh.add(list[i])
        else listNc.add(list[i])
    }
    println(listCh)
    println(listNc)
}

