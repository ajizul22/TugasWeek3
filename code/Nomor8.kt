fun main() {
    println("= Menghitung Rata-rata Un dan Grade =")
    print("masukan nilai mtk: ")
    val mtk = readLine()!!.toDouble()
    print("masukan nilai bahasa indonesia: ")
    val bhsIndo = readLine()!!.toDouble()
    print("masukan nilai bahasa inggris: ")
    val bhsIng = readLine()!!.toDouble()
    print("masukan nilai ipa: ")
    val ipa = readLine()!!.toDouble()

    val rataRata = average(mtk, bhsIndo, bhsIng, ipa)

    val grade = gradeFun(rataRata)
    println("Rata-rata = $rataRata")
    println("Grade = $grade")
}

fun average(mtk: Double, bhsIndo: Double, bhsIng: Double, ipa: Double): Double {
    return (mtk + bhsIndo + bhsIng + ipa) / 4

}

fun gradeFun(rataRata: Double): String {
    return when {
        rataRata >= 90 -> "A"
        rataRata >= 80 -> "B"
        rataRata >= 70 -> "C"
        rataRata >= 60 -> "D"
        rataRata <= 59 -> "E"
        else -> "masukan ulang nilai"
    }
}