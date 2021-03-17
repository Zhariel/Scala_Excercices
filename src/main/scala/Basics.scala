class Basics {

  //Value, immutable
  val x = 1 + 1
  println(x) // 2

  //Variable, mutable
  var y = 1 + 1
  y = 3
  println(x * x) // 9


  //Hello World N times
  def f(n: Int){
    for(i <- 1 to n){println("Hello World")}
  }

}
