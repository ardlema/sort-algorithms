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
      val emptyList = BubbleSort.sort(List(1,2,3))
      emptyList shouldBe List(1,2,3)
    }
  }
}

