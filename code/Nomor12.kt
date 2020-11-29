fun main() {

    println("= reverse words =")
    print("masukkan kalimat: ")
    val teks: Array<String> = readLine()!!.split(" ").toTypedArray()
    var hasil = ""

    for (i in teks.size - 1 downTo 0) {
        hasil += teks[i] + " "
    }


    println(hasil)


}