import scala.io.StdIn.readInt;
object Q1 extends App {
    def interest(dep:Int) : Double = dep match {
        case x if x<=20000 => x*0.02
        case x if x<=200000 => x*0.04
        case x if x<=2000000 => x*0.035
        case x if x>2000000 => x*0.065
    }

    printf("Enter the Deposit: ");
    var amount = readInt();
    println(interest(amount));
}