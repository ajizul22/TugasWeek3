fun main() {

    println("= menghitung luas lingkaran =")
    print("masukan jari-jari: ")
    val r = readLine()!!.toInt()

    val hasil = luasLingkaran(r)
    println(hasil)

}

fun luasLingkaran(r: Int): Double {
    return 3.14 * r * r
}
