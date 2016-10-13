import MergeSortSpec._
import org.scalacheck.Gen

trait BoundedList {

  val integers = Gen.oneOf(Integer.MIN_VALUE, Integer.MAX_VALUE)

  def genBoundedList(minSize: Int, maxSize: Int, g: Gen[Int]): Gen[List[Int]] = {
    Gen.choose(minSize, maxSize) flatMap { sz => Gen.listOfN(sz, g) }
  }

  val boundedList = genBoundedList(200, 5000, integers)
}
