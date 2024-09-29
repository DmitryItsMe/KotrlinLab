package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 2, 10, 8, 21)
    var list2 = arrayListOf(53, 35, 35, 23, 90, 4, 100)
    list.sort()
    list2.sort()
    var list3 = list + list2
    var list4 = arrayListOf<Int>()
    for(i in 0 until list3.size){
        list4.add(list3[i])
    }
    list4.sort()
    println(list4)
}