object Basics extends App {
   val meaningOfLife: Int = 12

   //void return type in scala = Unit. These are called side effects.
   //println returns Unit
   def myUnitFunction()={
     println("my function")
   }
   //Loops/Iterations are heavily discouraged in scala. Use functions and recursion!!!

   //Recursive factorial function
   def factorial(x:Int): Int = {
     if(x <=1) 1
     else x*factorial(x-1)
   }

   // define a function
   def mufunction(x:Int, y:Int): Int = {
     x+y
   }
   //last express is the return value
   val codeBlock = {
     //definitions
     val alocalValue = 63
     alocalValue + 5
   }
   //chained expression
   val chainedIfExpression = if  (meaningOfLife>43) 56
    else if(meaningOfLife<43) 43
    else 42
  //if expression
   val ifExpression = if (meaningOfLife>43) 56 else 9
   //expressions are structures that can be reduced to a value
   val anExpression=2+3
   //string and string operations
   val interpolatedString = s"Meaning of life :$meaningOfLife"
   val aComposedString = "This"+"is"+"a"+"string"
   val aString = "This is a string"
   // Type is optional
   val isBoolean = true
   //meaningOfLife = 42
   println("Hello world")
   println(factorial(4))
}
