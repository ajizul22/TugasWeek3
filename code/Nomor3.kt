fun main() {
    print("masukan angka: ")
    val angka = readLine()!!.toInt()
    
    val hasil = checkBilangan(angka)
    println(hasil)
}

fun checkBilangan(angka: Int) {
    if  (angka % 2 == 0) {
        println("$angka adalah angka genap")
    } else {
        println("$angka adalah angka ganjil")
    }
}