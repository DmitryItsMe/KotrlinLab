package pt9

fun main(){
    println("Введите строку: ")
    val s = readln()
    println(rg(s))
}

fun rg(s: String): String{
    var res = ""
    for(i in 0 until s.length){
        if(s.get(i).isLowerCase()) res += s.get(i).toUpperCase()
        else res +=s.get(i).toLowerCase()
    }
    return res
}
