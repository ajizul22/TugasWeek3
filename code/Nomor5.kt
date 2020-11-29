fun main() {

    println("= menghitung luas segitiga =")
    print("masukan luas: ")
    val alas = readLine()!!.toInt()
    print("masukan tinggi: ")
    val tinggi = readLine()!!.toInt()

    val hasil = luasSegitiga(alas, tinggi)

    println(hasil)
}

fun luasSegitiga(alas: Int, tinggi: Int) : Int {
     val luas = alas * tinggi / 2
    return luas
}