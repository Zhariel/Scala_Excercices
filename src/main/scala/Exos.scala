class Exos {

  //Replicate List
  def f(num:Int,arr:List[Int]):List[Int] ={
    arr.flatMap(x => List.tabulate(num)(_ => x))
  }

  //Filter Array
  def f2(delim:Int,arr:List[Int]):List[Int] ={
    for(e <- arr if e < delim) yield e
  }
}
