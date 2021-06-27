package NBD

object nbd2_zadanie3 {
    def main(args: Array[String]): Unit = {}
    print("\n########## ZADANIE 3 ##########\n")
    class Osoba(var Imie: String, var Nazwisko: String) {
        def przywitaj() {
            (Imie, Nazwisko) match {
                case ("Jan", _) => println("Cześć " + Imie + " " + Nazwisko)
                case (_, "Nowak") => println("Witaj " + Imie + " " + Nazwisko)
                case ("Kazimierz", "Pająk") => println("Dzien dobry " + Imie + " " + Nazwisko)
                case _ => println("Czołem " + Imie + " " + Nazwisko)
            }
        }

    }
    val osoba1 = new Osoba("Jan", "Kowalski")
    val osoba2 = new Osoba("Adam", "Nowak")
    val osoba3 = new Osoba("Kazimierz", "Pająk")
    val osoba4 = new Osoba("Pawel", "Rudzki")
    osoba1.przywitaj()
    osoba2.przywitaj()
    osoba3.przywitaj()
    osoba4.przywitaj()
}