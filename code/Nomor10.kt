fun main() {

    print("masukan kata: ")
    val words = readLine()!!.toLowerCase()
    printWords(words)

}

fun printWords(words: String) {
    // variabel penampung vocal dan consonant
    var vocal = ""
    //    print(vocal)
    var consonant = ""
    // print(consonant)

    // looping untuk mengambil huruf vocal dan consonant
    for (i in 0..words.length - 1) {
        if (words[i] == 'a' || words[i] == 'e' || words[i] == 'i' || words[i] == 'o' || words[i] == 'u') {
          vocal += words[i]
        } else consonant += words[i]
    }


    // sort huruf vokal
    val vocalSort = vocal.toCharArray().sorted()
//    println(vocalSort)

    // output
    for (i in 0..vocalSort.size - 1) {
        println(vocalSort[i].toUpperCase())
    }
    for (i in 0..consonant.length-1) {
        println(consonant[i].toUpperCase())
    }

}