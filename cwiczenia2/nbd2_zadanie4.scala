package NBD

object nbd2_zadanie4 {
    def main(args: Array[String]): Unit = {}
    print("\n########## ZADANIE 4 ##########\n")
    zadanie4(2,fx)
    def fx(wartosc: Int): Int = {
        wartosc*2
    }
    def zadanie4(wartosc: Int, fx : (Int) => Int ){
        print(fx(fx(fx(wartosc))))
    }
 }