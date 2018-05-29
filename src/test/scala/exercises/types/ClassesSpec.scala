package exercises.types

import exercises.types.classes.Person
import org.scalatest._

class ClassesSpec extends FlatSpec with Matchers{
  "Person" should "provide proper summary" in {
    val rafa = new Person(name = "Rafa", age = 35)
    rafa.summary shouldEqual "Rafa is 35 years old"
  }
}
