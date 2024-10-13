package pt9

fun main(){
    println("Введите строку из разных символов")
    val s = readln()
    println(lg(s))
}

fun lg(s: String): String{
    var str = ""
    var max = 0
    var i = 0
    while(i < s.length){
        if(s.get(i).isLetter()){
            var st = ""
            var mT = 0
            while((s.get(i).isLetter()) and (i < s.length-1)){
                mT++
                st+=s.get(i)
                i++
            }
            if(mT > max) max = mT
            if(st.length > str.length) str = st
        }
        i++
    }
    return str
}