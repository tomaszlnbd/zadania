package NBD

object nbd2_zadanie5 {
    def main(args: Array[String]): Unit = {}
    print("\n########## ZADANIE 5 ##########\n")
    class Osoba_zad5(val Imie: String, val Nazwisko: String, val Podatek: Double) {}

    trait Student extends Osoba_zad5 {
        override val Podatek: Double = 0
    }
    trait Pracownik extends Osoba_zad5 {
        var Pensja: Double = 10000
        override val Podatek: Double = 0.2 * Pensja: Double
    }
    trait Nauczyciel extends Pracownik{
        override val Podatek: Double = 0.1 * Pensja: Double
    }
    val student = new Osoba_zad5("Pawel","Malysz", 1) with Student
    val pracownik = new Osoba_zad5("Kamil","Klich", 2) with Pracownik
    val nauczyciel = new Osoba_zad5("Wojciech","Rak", 3) with Nauczyciel
    val studentPracownik = new Osoba_zad5("Adam","Malczak", 4) with Student with Pracownik
    val pracownikStudent = new Osoba_zad5("Tomasz","Rogucki", 5) with Pracownik with Student

    println("Podatek dla student: "+student.Podatek)
    println("Podatek dla pracownik: "+pracownik.Podatek)
    println("Podatek dla nauczyciel: "+nauczyciel.Podatek)
    println("Podatek dla student/pracownik: "+studentPracownik.Podatek)
    println("Podatek dla pracownik/student: "+pracownikStudent.Podatek)
}