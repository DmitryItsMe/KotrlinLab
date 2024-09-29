package p6

fun main() {
    var list = arrayListOf(3, 5, 6, 2, 10, 8, 21, 5, 6, 9, 10, 1, 2)
    println(list)
    var s = 0;

    var listMax = arrayListOf<Int>()
    listMax.add(list[0])
    var list2 = arrayListOf<Int>()
    list2.add(list[0])
    for(i in 1 until list.size){
        if(list2.last() <= list[i]) list2.add(list[i])
        else{
            if(listMax.size < list2.size) {
                listMax.clear()
                listMax = list2
            }
            else{
                list2.clear()
                list2.add(list[i])
            }
        }
    }

    println(listMax)

}