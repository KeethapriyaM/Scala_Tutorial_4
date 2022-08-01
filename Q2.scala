import scala.io.StdIn.readInt;
object Q2 extends App {
    def matching(x : Int) : String = x match {
        case x if x <= 0 => "Negative number is input";
        case x if x == 0 => "Zero is input";
        case x if x%2 == 0 => "Even number is given";
        case x if x%2 != 0 => "Odd number is given";     
    }
    printf("Enter the Number: ");
    var num = readInt();
    println(matching(num));
}