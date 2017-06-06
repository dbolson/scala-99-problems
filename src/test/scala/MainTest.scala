import org.scalatest._

import Scala99Problems.Main._

class MainTest extends FlatSpec {
  "p01" should "find the last element of a list" in {
    val result = foo(1)
    val expected = 2

    assert(result == expected)
  }
}
