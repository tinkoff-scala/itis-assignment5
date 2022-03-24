# Type classes

Есть два независимых типа: бесконечного списка `RepeatList` и зарплаты `Salary`:
```scala
trait RepeatList[+T] extends Iterable[T]
case class Salary(employee: String, amount: Double)

class RepeatListFromIterable[+T](iterable: Iterable[T]) extends RepeatList[T] {
  // should repeat iterable indefinitely
  override def iterator: Iterator[T] = ???
}

object RepeatList {
  def apply[T](iterable: Iterable[T]): RepeatList[T] = new RepeatListFromIterable[T](iterable)
}
```
Реализовать для них тайпкласс `Multiply` с алгеброй целочисленного умножения.
(Для `RepeatList` умножение означает последовательный повтор элемента заданное количество раз. Например: `1 1 2 2 3 3 1 1 ...` из `1 2 3 1`). При этом при выполнении это действия не должно происходить StackOverflow и вычисление всего листа.
```scala
trait Multiply[M] {
  def twice(m: M): M // умножение в 2 раза
  def thrice(m: M): M // умножение в 3 раза
  def fourTimes(m: M): M // умножение в 4 раза
}
```
Синтаксис исходных типов должен быть так же расширен методами алгебры тайпкласса

Написать тесты на использование тайпкласса через синтаксис для каждого из них