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

    def helloWorld(f: () => Unit) = ???

  }


  test("exercise 2") {

    def transformToString(f: Int => String, a: Int): String = ???

  }

  test("exercise 3") {

    def sumToNumbers(f: (Int, Int) => Int, a: Int, b: Int): Int = ???

  }

  test("exercise 4") {

    def printANumber(f: Int => (), a: Int) = ???

  }


  test("exercise 5") {

    def sumToNumbersAndRestForOther(f: (Int, Int) => Int, a: Int, b: Int, c: Int): Int = ???
    // not use a val.

  }

  test("exercise 6") {

    // composite functions
    // make this: printNumbers(sumNumbers(1,1))

  }

  test("exercise 7") {

    def function(a: Int): Int => String = ???

    val result: Int => String = function(5)

    def printResult(f: Int => String): Unit = ???

  }


}
