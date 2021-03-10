package sol

import src.Food

class Currying {
  def minTastiness(n: Int)(foodlist : List[Food]) = {
    foodlist.filter(x => x.tastiness >= n)
  }
  def tastinessOver20(foodlist : List[Food]) = {
    minTastiness(20)(foodlist)
  }
  def sumTastiness(n: Int)(foodlist: List[Food]) = {
    var sum = 0
    for (x <- foodlist) {
      sum += x.tastiness
    }
    sum match {
      case sum >= n => foodlist
      case _ => List[Food]()
    }
  }
  def sumTastinessOver50(foodlist: List[Food]) = {
    sumTastiness(50)(foodlist)
  }
}
