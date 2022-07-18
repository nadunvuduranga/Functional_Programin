package FunctionalPrograming.Tutorial03

object Quection3 extends App{

  val pi:Double = math.Pi;

  //find the volume
  def Volume(r:Double):Double = 4/3*pi*r*r*r;

  printf("Volume of sphere = %.2f",Volume(5));

}
