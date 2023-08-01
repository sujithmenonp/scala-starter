import ObjectOrientation.Dog

object ObjectOrientation extends App{
 println("hello")

  //class and instance creation
  class Animal{
    //define fields
    val age:Int=0
    def eat(): Unit ={
      println("Im eating")
    }
  }
  val anAnimal = new Animal

  //inheritence
  class Dog(val name: String) extends  Animal { //constructor definition

  }


  val aDeclaredAnimal:Animal = new Dog("tommy")
  aDeclaredAnimal.eat()//The most derived method will be called at run time.

  //abstract class
  abstract class walkingAnimal {
    protected val hasLegs = true //By default  public, can restrict them by using private or protected
    def walk():Unit
  }

  //"interface" = ultimate abstract type
  trait Carnivore{
    def eat(animal: Animal): Unit
  }
  trait Someothertrait{
    def eat(animal: Animal): Unit
  }
  trait Philosopher{
    def ?!(thoughts: String): Unit // ?! is the function name

  }
  //Offers single class inheritence and multi trait inheritence (mixing)
  class Crocodile extends Animal with Carnivore with Someothertrait {
    override def eat(animal: Animal): Unit = {
      println("I'm eating")
    }
  }
  val aDog = new Dog("tommy")
  val crocodile = new Crocodile()
  crocodile eat aDog //infix notation of calling method

  //operators as methods
   val sum = 1+2
   val sumOperator = 1.+(2)

  //ananymous methods
  val dinosaur = new Crocodile {
    override def eat(animal: Animal): Unit = {
      println("I can eat anything")
    }
  }
  //Singleton object
  object MySingletonObject {
    val myvalue = 10
    def myMethod = {
      println("My method")
    }
    def apply(x: Int) = x+1
  }
  MySingletonObject(30) //equivalent to MysingletonObject.apply(30)
  MySingletonObject.myvalue
  MySingletonObject.apply(50)

  object Animal {//companion object
    val canLiveForever = false
  }
  Animal.canLiveForever //similar to static fields

   /*
   case classes - lightweight data structures with boilerplate
   1. Sensible equals and hashcode
   2. serialization
   3. companion with apply
   4. Pattern matching
    */
  case class Person(name: String, age: Int)

  val bob = Person("Bob", 50)

  //exceptions
}
