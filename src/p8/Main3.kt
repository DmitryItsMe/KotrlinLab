package p8

fun main(){
    val list1 = arrayListOf(1, 4, 5, 2, 3, 7, 2)
    val list2 = arrayListOf(17, 1, 53, 13, 77, 0)
    println(lv(list1, list2))
}

fun lv(list1: ArrayList<Int>, list2: ArrayList<Int>):List<Int>{
    return list1 + list2
}
