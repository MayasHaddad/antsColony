/**
 *
 */
package tools

import scala.util.Random

/**
 * @author mayas
 *
 */
class fieldFiller {

	def fillField(a : Array[Array[Int]], i : Int, j: Int, dim : Int): Array[Array[Int]] = {
		a(i)(j) = Random.nextInt(3)  

		if(i >= dim - 1 && j >= dim - 1){
			return a;
		}
		
		if(j >= dim - 1){
			return fillField(a, i + 1, 0, dim)
		}
		
		return fillField(a, i, j + 1, dim)
	}
}