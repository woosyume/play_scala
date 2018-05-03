object execute {
  def main(args: Array[String]): Unit = {
    val richUser = new PaidUser("kim", 20, 'M'. 1000)
//    richUser.sayName
 //   richUser.showMoney
  }
}

class User(name: String, age: Int, sex: Char) {
  val sayName = println("my name is " + name)  
}

class PaidUser(name: String, age: Int, sex: Char, money: Int) 
  extends User(name, age, sex) {
  val showMoney = println(money + " : you have.")
}