import java.lang.ref.PhantomReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LineAsAnObject {

    private void task6(String str){
        String strNew = new String();

        for (int i = 0; i < str.length(); i++){
            strNew  += String.valueOf(str.charAt(i)) + String.valueOf(str.charAt(i));

    }

        System.out.println(strNew);
    }

    private void task5(String str){
        int count = 0;
        String strForEquals = "a";

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == strForEquals.charAt(0)){
                count++;
            }
        }
        System.out.println("Letter a repeats in this str " + count + " times!!");

    }

    private void task4(){
        String str = "информатика";
        String strForEquals = "торт";
        String concatStr = " ";

        for (int i = 0; i < strForEquals.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == strForEquals.charAt(i)){
                    concatStr += str.charAt(j);
                }
            }
        }
        System.out.println(concatStr.trim());

    }

private void task3(String word){
    int count = 0;
    int endNumber = word.length()-1;
    char [] splitWord = word.toCharArray();
    for (int i = 0; i < word.length(); i++){
        if (splitWord[i] == splitWord[endNumber]){
            count++;
            endNumber--;
        }
    }
    if (count == word.length()){
        System.out.println(word + " is word-palindrome!!");
    }
}


    private void task2(){
        int count = 0;
        String lineWithSpaces = "  dffg  a sfg     gf   aa   ghghfhfhgfh";
        int s = lineWithSpaces.compareTo("a");
        char [] arrayForConcat = lineWithSpaces.toCharArray();
        String template = new String("ab");
        char symbol = template.charAt(0);
        String template3 = " ";
        char symbol3 = template.charAt(0);
        String templateSecond = "ab";
        char symbolForChange = templateSecond.charAt(0);
        for (int i = 0; i < arrayForConcat.length; i++){
            if (arrayForConcat[i] == symbol){
                for (int j = 0; j < template.length(); j++){
                    arrayForConcat[i] += templateSecond.charAt(0);
                    arrayForConcat[i] += templateSecond.charAt(1);

                }

            }
        }

        String afterChange = String.valueOf(arrayForConcat);
        System.out.println(afterChange);

        //TODO
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
        lineAsAnObject.task2();
        lineAsAnObject.task3("505");
        lineAsAnObject.task4();
        lineAsAnObject.task5("aaabjkkjjkaakkjkaa");
        lineAsAnObject.task6("abcdefjkl;");
    }
}
