object Basics {

  def main(args: Array[String]): Unit = {

    //Value, immutable
    val x = 1 + 1
    println(x) // 2

    //Variable, mutable
    var y = 1 + 1
    y = 3
    println(x * x) // 9

    //Function
    def func(fun: (String, String) => String) = {
      fun("Apple", "Orange")
    }

    //Anonymous function
    var f = (str1: String, str2: String) => str1 + str2

    var f2 = (_: String) + (_: String) //Same effect as f

    val f3 = () => 42

    println(f("Thé", "vert"))

    //Looping
    var i = 0
    for (i <- 1 to 10) {}
    for (i <- 1 until 10) {}

    while (i < 10) {}

    args.foreach((arg: String) => println(arg))
    for (arg <- args) //Same as above
      println(arg)


    //Conditions
    if (x > y) x
    else y

    val a: Int = if (i == 1) x else y

    //Data structures
    val fish = Array("Salmon", "Bass", "Tuna") //Mutable
    val fish2 = List("Salmon", "Bass", "Tuna") //Immutable
    val fishSpecs = ("Salmon", 100, 50) //Tuples

    val fish3 = List("Catfish")
    val fish4 = 1 :: List(2, 3) //Append
    val fish5 = fish2 ::: fish3 //Concatenation
    val fish6 = "Salmon" :: "Bass" :: "Tuna" :: Nil

    fish6.count(fi => fi == "Salmon")
    fish6.foreach(fi => print(fi))

    val numeral = Map(1 -> "I", 5 -> "V", 10 -> "X", 50 -> "L", 100 -> "C")

    //Misc
    println(f"${math.Pi}%.5f")

    val f4 = "Thé vert"
    f4.toLowerCase()
    f4 toLowerCase() //Operator mode

    //Classes
    class Exemple(w: Int, q: Int){
      println("Class created")
    }

  }
}
