/**
 *
 */
package antsColony

import scala.collection.mutable.HashMap

/**
 * @author mayas
 *
 */
object main {
	val dim = 10
	val field = Array.ofDim[Int](dim,dim) 
	val filler = new fieldFiller
	val fieldFilled = filler.fillField(field, 0, 0, dim)
	
	def main(args: Array[String]) {
    for(i <- 0 to dim - 1){
      for(j <- 0 to dim - 1){ 
    	  print(fieldFilled(i)(j)) 
      }
      print("\n")
    }
  }
}