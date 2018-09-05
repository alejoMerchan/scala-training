package co.com.training.collections

import org.scalatest.FunSuite

class Collections extends  FunSuite{

  test("smoke test"){
    println("hello world")
  }

  test("generic types"){

    val function1:Int => Int = x => x + x
    val function2:String => String = x => x + x

    def functionPrint[A](f:A => A, arg:A) = println(f(arg))

    functionPrint(function1,5)
    functionPrint(function2,"hello")

  }

  val listTest = List(1,2,3,4,5)
  val listTest2 = List("a","b","c","d")

  test("filter"){

    val listTest2 = listTest.filter(x => x%2 == 0)

    println(listTest2)

  }

  test("map"){

    val listTest2 = listTest.map(x => x + 1)
    println(listTest2)

  }


  test("reduce"){

    val result = listTest.reduce((x,y) => x + y)
    println(result)

  }

  test("fold"){
    val result = listTest.foldLeft(5)((x,y) => x + y)
    println(result)
  }

  test("fold left"){


    val result = listTest2.foldLeft(""){
      (a,b) =>
        println(a)
        println(b)
        println("--------")
        a + b
    }

    println(result)
  }

  test("fold right"){
    val result = listTest2.foldRight(""){
      (a,b) =>
        println(a)
        println(b)
        println("--------")
        a + b
    }
    println(result)
  }


  val numbers  =  List(1,2,3,4,5,6,7,8,9,10)


  test("sort a list"){
    val numbers = List(1,3,5,9,6,4)
  }

  test("Find the last element of a list"){

  }

  test("Find the Kth element of a list"){

    val k = 11


  }

  test("convert all the numbers to even"){

  }

  test("sum the even numbers"){

  }

  test("convert the even numbers to string"){

  }

  test("combining two lists"){

  }



  //are you ready ?

  test("Eliminate consecutive duplicates of list elements."){

    /**
      * If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
        Example:

        scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
        res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
      */

  }


}
