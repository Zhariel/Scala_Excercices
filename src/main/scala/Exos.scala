class Exos {

  //Replicate List
  def f(num:Int,arr:List[Int]):List[Int] ={
    arr.flatMap(x => List.tabulate(num)(_ => x))
  }

  //Filter Array
  def f2(delim:Int,arr:List[Int]):List[Int] ={
    for(e <- arr if e < delim) yield e
  }

  //Remove elements at odd indices
  def f3(arr:List[Int]):List[Int] = {
    arr.indices.collect{case i if i % 2 == 1 => arr(i)}.toList
  }

  //Array of n elements
  var readInt: Int = scala.io.StdIn.readInt()
  def f4(num:Int) : List[Int] = {
    val list = List.fill(num)(1)
    return list
  }

  //Reverse List
  def f5(arr:List[Int]):List[Int] = arr.reverse

  //Sum of odd elements
  def f6(arr:List[Int]):Int ={
    arr.filter(_%2 != 0).sum
  }

  //Absolute values
  def f7(arr:List[Int]):List[Int] = {
    arr.map(Math.abs)
  }

  //Fibonacci
  def fibonacci(x:Int):Int = {
    if (x <= 0) 0
    else if(x == 1) 0
    else if(x == 2) 1
    else fibonacci(x - 1) + fibonacci(x - 2)
  }
}

