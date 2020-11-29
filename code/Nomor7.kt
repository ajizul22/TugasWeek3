fun main() {

    println("= cek tahun kabisat =")
    print("masukan tahun: ")
    val tahun = readLine()!!.toInt()

    val hasil = checkKabisat(tahun)

    println(hasil)
}

fun checkKabisat(tahun: Int) {
    if (tahun % 4 == 0) {
        if (tahun % 100 == 0) {
            println("$tahun bukan tahun kabisat")
        } else {
            println("$tahun tahun kabisat")
        }
    } else {
        println("$tahun bukan tahun kabisat")
    }
}