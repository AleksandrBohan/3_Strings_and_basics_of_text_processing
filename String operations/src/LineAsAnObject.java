import java.lang.ref.PhantomReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineAsAnObject {

    private void task2(){

    }

private void task1(){
    int count = 0;
    String lineWithSpaces = "  dffg   sfg     gf      ghghfhfhgfh";
    String template = "\\s";
    Pattern pattern = Pattern.compile("\\s");
    Pattern pattern1 = Pattern.compile("\\S");
    Matcher matcher = pattern.matcher(lineWithSpaces);
    Matcher matcher1 = pattern.matcher(lineWithSpaces);
    String formatString = "We are printing double variable (%f), string ('%s') and integer variable (%d).";
    System.out.println(String.format(formatString, 2.3, "[0-9]", 10));
   // System.out.println("Max count of spaces = " + count);
    count = 0;
//TODO
}

    public static void main(String[] args) {
        LineAsAnObject lineAsAnObject = new LineAsAnObject();
        lineAsAnObject.task1();
    }
}
