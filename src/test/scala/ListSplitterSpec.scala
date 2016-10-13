import org.scalatest.FunSpec
import org.scalatest.Matchers._

class ListSplitterSpec extends FunSpec {

  describe("The list splitter") {

    it("should split an odd list properly") {
      val list = List(1, 2, 3, 4, 5)
      ListSplitter.getLeft(list) shouldBe List(1, 2)
      ListSplitter.getRight(list) shouldBe List(3, 4, 5)
    }

    it("should split an even list properly") {
      val list = List(1, 2, 3, 4)
      ListSplitter.getLeft(list) shouldBe List(1, 2)
      ListSplitter.getRight(list) shouldBe List(3, 4)
    }
  }
}

object ListSplitter {

  def getLeft(list: List[Int]): List[Int] = {
    val middle = list.size / 2
    list.take(middle)
  }

  def getRight(list: List[Int]): List[Int] = {
    val middle = list.size / 2
    list.drop(middle)
  }
}





