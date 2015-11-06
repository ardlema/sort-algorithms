import org.scalatest.FunSpec
import org.scalatest.Matchers._

class ListElementSwapperSpec extends FunSpec {

  describe("The list element swapper") {
    it("should return the same list when the list size is less than the pivot") {
      val emptyList = ListElementSwapper.swap(List(), 2)
      emptyList shouldBe empty
    }

    it("should return the same list when the first element is the last") {
      val swappedList = ListElementSwapper.swap(List(1, 2, 3), 3)
      swappedList shouldBe List(1, 2, 3)
    }

    it("should return the same list for a one-element list") {
      val swappedList = ListElementSwapper.swap(List(1), 1)
      swappedList shouldBe List(1)
    }

    it("should swap elements for a two-elements list") {
      val swappedList = ListElementSwapper.swap(List(1, 2), 1)
      swappedList shouldBe List(2, 1)
    }

    it("should swap elements for a more than two-elements list") {
      val swappedList = ListElementSwapper.swap(List(1, 2, 3, 4, 5), 2)
      swappedList shouldBe List(1, 3, 2, 4, 5)
    }
  }
}

