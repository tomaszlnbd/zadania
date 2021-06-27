package NBD

object nbd2_zadanie2 {
    def main(args: Array[String]): Unit = {}
    print("\n########## ZADANIE 2 ##########\n")
    class KontoBankowe(var stanKonta: Double = 0) {
        def KontoBankowe {}
        def KontoBankowe(stan: Double) {
            stanKonta = stan;
        }

        def wplata(kwota: Double) {
            this.stanKonta += kwota
        }

        def wyplata(kwota: Double) {
            this.stanKonta -= kwota
        }
    }

    val konto1 = new KontoBankowe(1000)
    println("Stan konta 1 - z wykorzystaniem konstruktora(1000): "+ konto1.stanKonta)
    konto1.wplata(500)
    println("Stan konta 1 - po wplacie 500: "+ konto1.stanKonta)
    konto1.wyplata(300)
    println("Stan konta 1 - po wyplacie 300: "+ konto1.stanKonta)
    val konto2 = new KontoBankowe
    println("Stan konta 2 - konstruktor domyslny: "+konto2.stanKonta)
    konto2.wplata(100)
    println("Stan konta 2 - po wplacie 100: "+konto2.stanKonta)
    konto2.wyplata(200)
    println("Stan konta 2 - po wyplacie 200: "+konto2.stanKonta)
}