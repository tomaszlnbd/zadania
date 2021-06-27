package NBD

object nbd2_zadanie1 {
    def main(args: Array[String]): Unit = {}

    print("\n########## ZADANIE 1 ##########\n")

    def zadanie1(dzien: String) {
        dzien match {
            case "PONIEDZIAŁEK" => println("Praca")
            case "WTOREK" => println("Praca")
            case "ŚRODA" => println("Praca")
            case "CZWARTEK" => println("Praca")
            case "PIĄTEK" => println("Praca")
            case "SOBOTA" => println("Weekend")
            case "NIEDZIELA" => println("Weekend")
            case _ => println("Nie ma takiego dnia")
        }
    }

    zadanie1("PONIEDZIAŁEK")
    zadanie1("SOBOTA")
    zadanie1("XY")
}