import org.scalatest._

import Scala99Problems.Main._

class MainTest extends FlatSpec {
  "p01" should "find the last element of a list" in {
    val result = last(List(1, 1, 2, 3, 5, 8))
    val expected = 8

    assert(result == expected)
  }

  "p02" should "find the last but one element of a list" in {
    val result = penultimate(List(1, 1, 2, 3, 5, 8))
    val expected = 5

    assert(result == expected)
  }

  "p03" should "find the Kth element of a list" in {
    val result = nth(2, List(1, 1, 2, 3, 5, 8))
    val expected = 2

    assert(result == expected)
  }

  "p04" should "find the number of elements of a list" in {
    val result = length(List(1, 1, 2, 3, 5, 8))
    val expected = 6

    assert(result == expected)
  }

  "p05" should "reverse a list" in {
    val result = reverse(List(1, 1, 2, 3, 5, 8))
    val expected = List(8, 5, 3, 2, 1, 1)

    assert(result == expected)
  }

  "p06" should "flatten a nested list structure" in {
    val result = flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    val expected = List(1, 1, 2, 3, 5, 8)

    assert(result == expected)
  }
}
