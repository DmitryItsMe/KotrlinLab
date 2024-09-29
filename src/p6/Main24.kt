package p6

fun main(){
    val x = arrayOf(
        arrayOf(4, 5, 2),
        arrayOf(9, 1, 3),
        arrayOf(3, 8, 6)
    )

    val t = arrayOf(
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0),
        arrayOf(0, 0, 0)
    )
    for(i in 0 until x.size){
        for(j in 0 until x.size){
            t[i][j] = x[j][i]
        }
    }

    for(i in 0 until x.size){
        for(j in 0 until x.size){
            print( t[i][j])
        }
        println()
    }
}