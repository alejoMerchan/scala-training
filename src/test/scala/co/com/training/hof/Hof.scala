package co.com.training.hof

import org.scalatest.FunSuite

class Hof extends FunSuite {


  test("smoke test") {
    println("hello world !")
  }


  test("is valid int") {

    val isValidInt: Int => Boolean = (i: Int) => i % 2 == 0

    assert(isValidInt(8) == true)
    assert(isValidInt(13) == false)
  }


  test("exercise 1") {

    val anyName : () => Unit = () => println("Hello World")
    def helloWorld(f: () => Unit) = f
    helloWorld(anyName)

  }


  test("exercise 2") {

    val test : Int => String = number => number.toString
    def transformToString(f: Int => String, a: Int): String = f(a)
    assert(transformToString(test, 6)=="6")

  }


  test("exercise 3") {
    val sumFunction : (Int,Int) => Int = (num1, num2) => num1 + num2
    def sumToNumbers(f: (Int, Int) => Int, a: Int, b: Int): Int = f(a,b)

    assert(sumToNumbers(sumFunction, 1, 2) == 3)
  }
/**
  test("exercise 4") {

    def printANumber(f: Int => (), a: Int) = ???

  }
  */


  test("exercise 5") {

    def sumToNumbersAndRestForOther(f: (Int, Int) => Int, a: Int, b: Int, c: Int): Int = f(a,b) - c
    // not use a val.
    assert(sumToNumbersAndRestForOther((a,b)=>a+b,2,3,1)==4)

  }

  /**
  test("exercise 6") {

    // composite functions
    // make this: printNumbers(sumNumbers(1,1))

  }

  test("exercise 7") {

    def function(a: Int): Int => String = ???

    val result: Int => String = function(5)

    def printResult(f: Int => String): Unit = ???

  }

*/
}
