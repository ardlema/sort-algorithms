// Copyright (C) 2011-2012 the original author or authors.
// See the LICENCE.txt file distributed with this work for additional
// information regarding copyright ownership.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
import scala.annotation.tailrec

object BubbleSort {

  def sort(list: List[Int]): List[Int] = {

    @tailrec
    def internalSort(list: List[Int], pivot: Int, lastElement: Int): List[Int] = {
      if (lastElement <= 0) {
        list
      }
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

