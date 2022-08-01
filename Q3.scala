import scala.io.StdIn.readLine;
object  Q3 {
    def toUpper(str:String) : String = str.toUpperCase();
    def toLower(str:String) : String = str.toLowerCase();

    def formatNames(name: String)(index: Int* )(func: String => String): String = {
        if(index.isEmpty){
            return func(name) ;
        }
        var res = "" ;
        var i = 0 ;

        while (i < name.length()){
            if(index.contains(i)) res = res + func(name.charAt(i).toString);
            else res = res + name.charAt(i).toString;
            i += 1 ;
        }
        return res;
    }

    def main(args: Array[String]): Unit = {        
        println(formatNames("Benny")()(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")()(toLower));
        println(formatNames("Kumara")(5)(toUpper));
    }
}