

object ListElementSwapper {

  def swap(list: List[Int], firstElement: Int) = {
    if (firstElement >= list.size) list
    else {
      val firstIndex = firstElement - 1
      val firstElementValue = list(firstIndex)
      list.updated(firstIndex, list(firstIndex + 1)).updated(firstIndex + 1, firstElementValue)
    }
  }
}
