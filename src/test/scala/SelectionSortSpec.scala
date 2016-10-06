import org.scalacheck.{Gen, Properties}
import org.scalacheck.Prop.forAll

object SelectionSortSpec extends Properties("Selection Sort") {

  val listOfInteger = Gen.listOf(Int)

  property("Sort properly without tailrec") = forAll { (l: List[Int]) =>
    SelectionSort.sort(l) == l.sorted
  }

  property("Sort properly with tailrec") = forAll { (l1: List[Int]) =>
    SelectionSort.tailRecursiveSort(l1) == l1.sorted
  }
}