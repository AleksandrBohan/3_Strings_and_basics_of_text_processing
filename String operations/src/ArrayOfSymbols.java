import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayOfSymbols {

    private void task3(){
        int count = 0;
        String lineWithNumbers = "jnsivn 245 3ridokdsj 96bk dmklkd";
        String template = "[0-9]";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(lineWithNumbers);
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }

    private void task2(){
        String worldLine = "Java is a perfect world language in the world.";
        String afterChange = worldLine.replaceAll("world", "letter");

        System.out.println(worldLine);
        System.out.println(afterChange);

    }

    private void task1(){
        String po = "[A-Z]";
        String phrase = "camelCase".replaceAll(po, po);

        System.out.println(phrase);
//TODO
    }

    public static void main(String[] args) {
        ArrayOfSymbols arrayOfSymbols = new ArrayOfSymbols();
        arrayOfSymbols.task1();
        arrayOfSymbols.task2();
        arrayOfSymbols.task3();
    }
}
