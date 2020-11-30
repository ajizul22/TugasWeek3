fun main() {

    println("= cek palindrom =")
    print("masukan kata: ")
    var kata = readLine()!!
    var temp = ""

    kata = kata.toLowerCase()
    for (i in kata.length - 1 downTo 0 ) {
        temp += kata[i]
    }

    if (temp == kata) {
        println("$kata adalah palindrom")
    } else println("$kata bukan palindrom")

}