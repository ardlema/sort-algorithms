import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

object SelectionSortSpec extends Properties("String") {

  property("startsWith") = forAll { (l1: List[Int]) =>
    SelectionSort.sort(l1) == l1.sorted
  }
}