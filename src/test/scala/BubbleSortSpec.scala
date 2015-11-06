import org.scalatest.FunSpec
import org.scalatest.Matchers._

class BubbleSortSpec extends FunSpec {

  describe("The bubble-sort algorithm") {

    it("should return an empty list when the list is empty") {
      val emptyList = BubbleSort.sort(List())
      emptyList shouldBe empty
    }

    it("should return a one-element list when the list contains one element") {
      val emptyList = BubbleSort.sort(List(1))
      emptyList shouldBe List(1)
    }

    it("should return the same list when the list is ordered") {
      val emptyList = BubbleSort.sort(List(1, 2, 3))
      emptyList shouldBe List(1, 2, 3)
    }

    it("should order a 2 element list") {
      val emptyList = BubbleSort.sort(List(5, 1))
      emptyList shouldBe List(1, 5)
    }

    it("should order a list with more than 2 elements") {
      val emptyList = BubbleSort.sort(List(5, 1, 7, 3))
      emptyList shouldBe List(1, 3, 5, 7)
    }

    it("should order a list when just the last element is unordered") {
      val emptyList = BubbleSort.sort(List(9, 9, 1))
      emptyList shouldBe List(1, 9, 9)
    }
  }
}

