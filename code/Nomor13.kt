fun main() {
    print("Masukkan angka: ")
    val angka: Long = readLine()!!.toLong()
   divideAndSort(angka)
}

fun divideAndSort(angka: Long) {
//    ubah ke array dengan pemisah 0
    val divide = angka.toString().split("0")
    println(divide)

//    variabel penampung untuk hasil sort
        var sort = ""


//    looping untuk memproses setiap index array untuk di sort
    for (i in 0.. divide.size - 1) {
        sort += divide[i].map { it }.sorted().joinToString("")
    }
        println(sort)
}
//5956560159466056