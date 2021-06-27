package NBD

import scala.annotation.tailrec

object nbd1 {
    val dniTygodnia = List[String]("PONIEDZIAŁEK", "WTOREK", "ŚRODA", "CZWARTEK", "PIĄTEK", "SOBOTA", "NIEDZIELA")
    val person1 = Map("name" -> "Tomasz",
        "surname" -> "Latala")
    val zad8: List[Int] = List(1,2,0,3,4,5,6,0,0,0,7,0)
    val zad9 = List(1,2,3,4,5)
    val zad10 = List(-6,-5,-1,0,1,12,13)

    def main(args: Array[String]) {}

    def zadanie1a(): String ={
        var zad1a: String = ""
        for (x <- this.dniTygodnia) {
            zad1a += x + ", "
        }
        return zad1a
    }
    def zadanie1b(): String ={
        var zad1b: String = ""
        for (x <- dniTygodnia if x.startsWith("P")) {
            zad1b += x + ", "
        }
        return zad1b
    }
    def zadanie1c(): String ={
        var index = 0
        var zad1c: String= ""
        while (index < dniTygodnia.length) {
            zad1c+=(dniTygodnia(index))+", "
            index+=1
        }
        return zad1c
    }
    def zadanie2a(dniTygodnia: List[String]): String ={
        if (dniTygodnia.tail.isEmpty){
            return dniTygodnia.head
        }
        return dniTygodnia.head + ", " + zadanie2a(dniTygodnia.tail)
    }
    def zadanie2b(dniTygodnia: List[String]): String ={
        if (dniTygodnia.tail.isEmpty){
            return dniTygodnia.head
        }
        return zadanie2b(dniTygodnia.tail) + ", " + dniTygodnia.head
    }

    @tailrec
    def zadanie3(dniTygodnia: List[String], dniDoWypisania: String): String = {
        if (dniTygodnia.tail.nonEmpty) {
            zadanie3(dniTygodnia.tail, dniDoWypisania + dniTygodnia.head + ", ")
        } else {
            return dniDoWypisania + dniTygodnia.head
        }
    }

    def zadanie4a(): String = {
        return dniTygodnia.foldLeft("") ((x, y) => x+y+", ")
    }
    def zadanie4b(): String = {
        return dniTygodnia.foldRight("") ((x, y) => x+", "+y)
    }

    def zadanie4c(): String = {
        return dniTygodnia.foldLeft("")((x, y) => if(y.startsWith("P")) x+y+", " else x )
    }

    def zadanie5(){
        var A:Map[String,Double] = Map()
        A += ("Jablka" -> 5.2)
        A += ("Samochod" -> 8000)
        A += ("Mundur" -> 60)
        val discount = A.map{ case (x, y) => (x, y*0.9) }
        print(discount)
    }

    def zadanie6(x:Double, y:String, z:Boolean) = println(x,y,z)

    def zadanie7(z: Option[String]) = z match {
            case Some(s) => (s)
            case None => ("Not found")
    }
    def zadanie8(elements: List[Int], index : Int): List[Int] = {
        if(index > elements.length-1){
            return elements
        }else if(elements(index).equals(0)) {
            zadanie8(elements.patch(index, Nil, 1), index)
        }else {
            zadanie8(elements, index + 1)
        }
    }
    def zadanie9(elements: List[Int]): List[Int] = {
        return elements.map(element => element+1)
    }
    def zadanie10(elements: List[Int]): List[Int] = {
        return elements.filter(_ <= 12).filter(_ >= -5).map(element => element.abs)
    }
    print("\n########## ZADANIE 1A ##########\n")
    print(zadanie1a())
    print("\n########## ZADANIE 1B ##########\n")
    print(zadanie1b())
    print("\n########## ZADANIE 1C ##########\n")
    print(zadanie1c())
    print("\n########## ZADANIE 2A ##########\n")
    print(zadanie2a(dniTygodnia))
    print("\n########## ZADANIE 2B ##########\n")
    print(zadanie2b(dniTygodnia))
    print("\n########## ZADANIE 3 ##########\n")
    print(zadanie3(dniTygodnia,""))
    print("\n########## ZADANIE 4A ##########\n")
    print(zadanie4a())
    print("\n########## ZADANIE 4B ##########\n")
    print(zadanie4b())
    print("\n########## ZADANIE 4C ##########\n")
    print(zadanie4c())
    print("\n########## ZADANIE 5 ##########\n")
    print(zadanie5())
    print("\n########## ZADANIE 6 ##########\n")
    zadanie6(33.3, "Car",true)
    print("\n########## ZADANIE 7 ##########\n")
    print(zadanie7(person1.get("name")))
    print("\n########## ZADANIE 8 ##########\n")
    print(zadanie8(zad8,0))
    print("\n########## ZADANIE 9 ##########\n")
    print(zadanie9(zad9))
    print("\n########## ZADANIE 10 ##########\n")
    print(zadanie10(zad10))
}  