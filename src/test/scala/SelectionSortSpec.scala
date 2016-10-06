import org.scalacheck.{Gen, Properties}
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{oneOf}

object SelectionSortSpec extends Properties("Selection Sort") {

  //val listOfInteger = Gen.listOf(Int)
  val integers = Gen.oneOf(Integer.MIN_VALUE, Integer.MAX_VALUE)

  def genBoundedList(minSize: Int, maxSize: Int, g: Gen[Int]): Gen[List[Int]] = {
    Gen.choose(minSize, maxSize) flatMap { sz => Gen.listOfN(sz, g) }
  }

  val boundedList = genBoundedList(200, 5000, integers)

  property("Sort properly without tailrec") = forAll(boundedList) { bL =>
    SelectionSort.sort(bL) == bL.sorted
  }

  property("Sort properly with tailrec") = forAll { (l1: List[Int]) =>
    SelectionSort.tailRecursiveSort(l1) == l1.sorted
  }
}