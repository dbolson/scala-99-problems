package Scala99Problems

object Main {
  def last[A](l: List[A]): A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def penultimate[A](l: List[A]): A = l match {
    case p :: t :: Nil => p
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def nth[A](elem: A, l: List[A]): A = ???
}
