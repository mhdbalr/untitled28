fun main(){
    //tugas kolab kalku sederhana
    print("Masukkan Angka Pertama : ")
    val angkaPertama = readLine()!!.toDouble()

    print("Masukkan Angka Kedua : ")
    val angkaKedua = readLine()!!.toDouble()

    print("Masukkan operator (+, -, *, /): ")
    val operasi = readLine()

    val Hasil: Double?

    when (operasi) {
        "+" -> Hasil = angkaPertama + angkaKedua
        "-" -> Hasil = angkaPertama - angkaKedua
        "*" -> Hasil = angkaPertama * angkaKedua
        "/" -> Hasil = angkaPertama / angkaKedua
        else -> {
            println("Operator yang dimasukkan tidak valid")
            return
        }
    }

    println("Hasil $angkaPertama $operasi $angkaKedua = $Hasil")
}