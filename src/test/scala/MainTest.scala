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
}
