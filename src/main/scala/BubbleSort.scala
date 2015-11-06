import scala.annotation.tailrec

object BubbleSort {

  def sort(list: List[Int]): List[Int] = {

    @tailrec
    def internalSort(list: List[Int], pivot: Int, lastElement: Int): List[Int] = {
      if (lastElement <= 0) list
      else {
        if (pivot == lastElement) {
          internalSort(list, 0, lastElement - 1)
        }
        else {
          val elementToBeSwapped = pivot + 1
          if (list(pivot) > list(elementToBeSwapped)) {
            internalSort(ListElementSwapper.swap(list, elementToBeSwapped), elementToBeSwapped, lastElement)
          } else {
            internalSort(list, elementToBeSwapped, lastElement)
          }
        }
      }
    }

    internalSort(list, 0, list.size - 1)
  }
}

