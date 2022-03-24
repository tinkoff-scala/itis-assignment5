package typeclasses

trait RepeatList[+T] extends Iterable[T]

class RepeatListFromIterable[+T](iterable: Iterable[T]) extends RepeatList[T] {
  // should repeat iterable indefinitely
  override def iterator: Iterator[T] = ???
}

object RepeatList {
  def apply[T](iterable: Iterable[T]): RepeatList[T] = new RepeatListFromIterable[T](iterable)
}
