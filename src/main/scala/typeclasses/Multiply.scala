package typeclasses

trait Multiply[M] {
  def twice(m: M): M // умножение в 2 раза
  def thrice(m: M): M // умножение в 3 раза
  def fourTimes(m: M): M // умножение в 4 раза
}
