fun main() {

    println("menghitung usia")
    println("masukan tahun sekarang: ")
    val year = readLine()!!.toInt()
    println("masukan tahun kelahiran: ")
    val age = readLine()!!.toInt()

    val hasil = checkAge(age, year)

    println("umur anda $hasil tahun")

}

fun checkAge(age: Int, year: Int) : Int {
    return year - age
}