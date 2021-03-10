package sol

class Lunch(ingredients: List[String]) {
  def makeSandwich = ingredients
}

trait PeanutButter extends Lunch {
  override def makeSandwich: List[String] = "Peanut Butter" :: super.makeSandwich
}
trait Bread extends Lunch {
  override def makeSandwich: List[String] = {
    val oneloaf = "Bread" :: super.makeSandwich
    oneloaf ::: List("Bread")
  }
}

trait HoldTheAnchovies extends Lunch {
  override def makeSandwich: List[String] = {
    def removeAnchovies(x: String): Boolean = {
      !x.equals("Anchovies")
    }
    super.makeSandwich.filter(removeAnchovies)
  }
}

trait DoubleIngredients extends Lunch {
  override def makeSandwich: List[String] = {
    var newList = List[String]()
    for (x <- super.makeSandwich) {
      newList = newList ::: List(x, x)
    }
    newList
  }
}

object Lunch {
  val ingredients = List("Anchovies", "Cream Cheese", "Pickles")
  val monday = new Lunch(ingredients) with Bread
  val tuesday = new Lunch(ingredients) with DoubleIngredients with Bread
  val wednesday = new Lunch(ingredients) with HoldTheAnchovies with Bread with DoubleIngredients
  val thursday = new Lunch(ingredients) with HoldTheAnchovies with PeanutButter
  val friday = new Lunch(ingredients) with HoldTheAnchovies with PeanutButter with DoubleIngredients with Bread
}