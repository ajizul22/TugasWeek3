fun main() {
    print("Masukkan angka: ")
    val angka: Long = readLine()!!.toLong()
   divideAndSort(angka)
}

fun divideAndSort(angka: Long) {
    val divide = angka.toString().split("0")

        var sort = ""

    for (i in 0.. divide.size - 1) {
        sort += divide[i].map { it }.sorted().joinToString("")
    }
        println(sort)
}