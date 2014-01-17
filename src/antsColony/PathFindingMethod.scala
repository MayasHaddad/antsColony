package antsColony

trait PathFindingMethod {
	def getPath(field : Array[Array[Int]], goalI : Int, goalJ : Int) : Array[Int]
}