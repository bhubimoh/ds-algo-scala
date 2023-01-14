package com.bhubimoh.dsalgoscala.recursion

object NthFibonacciNumber {
  def main(args: Array[String]): Unit = {
    val n = 6
    println(getNthFibonacciNumber(n))
  }

  def getNthFibonacciNumber(n: Int): Int = {
    if(n==0 || n==1)
      n
    else
      getNthFibonacciNumber(n-1) + getNthFibonacciNumber(n-2)
  }
}
