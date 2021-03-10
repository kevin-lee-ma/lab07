package sol

/**
 * Names is a class that contains and modifies a val Array.
 *
 * @author cs18tas
 * @param nameList - an Array of Strings that is a private val
 */
class Names (nameList: Array[String]) {

  def clear(name: String) {
    for (i <- nameList.indices) {
      if (nameList(i).equals(name)) {
        nameList(i) = "CLEARED"
      }
    }
  }
}

/**
 * Names2 is a class that contains and modifies a list as a var.
 *
 * @author cs18tas
 * @param nameList - a private var list of Strings
 */
class Names2 (private var nameList: List[String]) {

  def clear(name: String) {
    def clearhelper(word: String): String = {
      word match {
        case `name` => "CLEARED"
        case _ => word
      }
    }
    nameList = nameList.map(x => clearhelper(x))
  }
}


/**
 * Names3 is a class that contains a list of suspects as a val.
 *
 * @author cs18tas
 * @param nameList - a private val list of Strings
 */
<<<<<<< Updated upstream

class Names3 (private var nameList: List[String]) {

  class clear(nameList: List[String]) {
    //TODO: For this part, we want you to come up with the clear method signature yourself!

  }
=======
class Names3 (nameList: List[String]) {
>>>>>>> Stashed changes

  def clear(name: String): Names3 = {
    def clearhelper(word: String): String = {
      word match {
        case `name` => "CLEARED"
        case _ => word
      }
    }
    new Names3(nameList.map(x => clearhelper(x)))
  }
}
