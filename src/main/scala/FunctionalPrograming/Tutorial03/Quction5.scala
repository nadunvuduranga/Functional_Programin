package FunctionalPrograming.Tutorial03

object Quection05 extends App{

  //find easy run
  def easy(k:Int) = k*8;

  //find the Tempo..
  def Tempo(k:Int) = k*7;

  val totalT = easy(2) + Tempo(3) + easy(2);

  printf("Total time %d min",totalT);

}
