import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object SelectionSortSpec extends Properties("Selection Sort") {

  property("Sort properly") = forAll { (l1: List[Int]) =>
    SelectionSort.sort(l1) == l1.sorted
  }
}