package Scala99Problems

object Main {
  def last[A](l: List[A]): A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def penultimate[A](l: List[A]): A = l match {
    case h :: _ :: Nil => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def nth[A](pos: Int, l: List[A]): A = (pos, l) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nth(pos - 1, tail)
    case (_, Nil) => throw new NoSuchElementException
  }

  def length[A](l: List[A]): Int = ???
}
