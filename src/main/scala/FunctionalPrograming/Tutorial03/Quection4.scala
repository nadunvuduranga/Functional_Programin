package FunctionalPrograming.Tutorial03

object Quetion04 extends App{

  //Find the cover  price
  def CoverPrice(amount:Int):Double = amount*24.95;

  //find the discount
  def Discount(amount:Int):Double = CoverPrice(amount)*.4;

  //find the shipping cost
  //  def ShippingCost(amount:Int) :Double = amount*3 + (amount - 50)*.75;

  def ShippingCost(amount:Int):Double = amount match {
    case x if x>50 => 50*3 + (x-50)*.75;
    case x if x<=5 => 50*3;
  }

  def Totalcost(amount:Int):Double = CoverPrice(amount) - Discount(amount) + ShippingCost(amount);

  printf("Total wholesale cost is Rs. %.2f",Totalcost(60));


}
