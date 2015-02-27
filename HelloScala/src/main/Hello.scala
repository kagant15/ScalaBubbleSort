package main

//import java.util.List;
import scala.collection.immutable.List;

object Hello {
  
    var listOfNumbers = new Array[Int](6)
    
  
    def main(args: Array[String]) {
      println("Hello, world Thomas!")
      
      listOfNumbers(0) = 1
      listOfNumbers(1) = 9
      listOfNumbers(2) = 5
      listOfNumbers(3) = 2
      listOfNumbers(4) = 50
      listOfNumbers(5) = 60
      
      val myList = List("Thomas", "Michael", "Kagan");
      bubbleSort(listOfNumbers);
    }
    
    
    
    def bubbleSort (unsortedArray:Array[Int]) {
      var endOfNumbers = unsortedArray.length
      
      for(i <- 0 until endOfNumbers){
        for(j <- 1 until endOfNumbers-1){
          if(unsortedArray(j-1) > unsortedArray(j)){
            swap(j-1, j, unsortedArray)
          }
        }
      }
      
      for(i <- 0 until unsortedArray.length){
        print(unsortedArray(i)+",")
      }
      
      def swap (I : Int, J : Int, numbers : Array[Int]){
        var temp = 0
        temp = numbers(I)
        numbers(I) = numbers(J)
        numbers(J) = temp
      }
      
    }
    
  }