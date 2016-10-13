import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

import scala.collection.mutable.ListBuffer

object MergeSortSpec extends Properties("Selection Sort") with BoundedList {

  property("Sort properly without tailrec") = forAll(boundedList) { bL =>
      MergeSort.mergeSort(bL) == bL.sorted
    }
}

object MergeSort {

  def mergeSort(list: List[Int]): List[Int] = {
    if (list.size < 2) {
      list
    }
    else {
      val leftList = ListSplitter.getLeft(list)
      val rightList = ListSplitter.getRight(list)

      val sortedLeft = mergeSort(leftList)
      val sortedRight = mergeSort(rightList)

      merge(sortedLeft, sortedRight)
    }
  }

  def merge(leftList: List[Int], rightList: List[Int]): List[Int] = {
    val newList = ListBuffer[Int]()
    var leftPointer = 0
    var rightPointer = 0

    while (leftPointer < leftList.size && rightPointer < rightList.size) {
      if (leftList(leftPointer) < rightList(rightPointer)) {
        newList += leftList(leftPointer)
        leftPointer += 1
      } else {
        newList += rightList(rightPointer)
        rightPointer += 1
      }
    }

    while (leftPointer < leftList.size) {
      newList += leftList(leftPointer)
      leftPointer += 1
    }

    while (rightPointer < rightList.size) {
      newList += rightList(rightPointer)
      rightPointer += 1
    }

    newList.toList
  }
}