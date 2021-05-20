import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayOfSymbols {

    private void task5(){
        int count = 0;
        String lineWithNumbers = "           " +
                "jns798988ivn      2796868          87657645  " +
                " 3ridokdsj 96bk             dmklkd              ";
        String delete = lineWithNumbers.trim();
        String template = "\\s+";
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(lineWithNumbers);
        String replaceWrongSpaces = delete.replaceAll("\\s+", " ");

        System.out.println("Line before: " + lineWithNumbers);
        System.out.println("Line after: " + replaceWrongSpaces);
        //TODO строку как массив использовать
    }

    private void task4(){
        int count = 0;
        String lineWithNumbers = "jns798988ivn 2796868 87657645 3ridokdsj 96bk dmklkd";
        String template = "\\s[0-9]+\\s";
        Pattern pattern = Pattern.compile("\\s?[0-9]+\\s?");
        Matcher matcher = pattern.matcher(lineWithNumbers);
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
        //TODO строку как массив использовать
    }

    private void task3(){
        int count = 0;
        String lineWithNumbers = "jnsivn 2 8  3 ridokdsj 96bk dmklkd";
        String template = "[0-9]";
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(lineWithNumbers);
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
        //TODO строку как массив использовать
    }

    private void task2(){
        String wordWorld = "world";
        String wordLetter = "letter";
        int differentSize = 0;
        String worldLine = "world is a perfect world language in the world.";
        char [] arrayForReplace = worldLine.toCharArray();
        for (int i = 0; i < arrayForReplace.length-6 ; i++){
            if (arrayForReplace[i] == Character.valueOf(' ') &
                    arrayForReplace[i+1] == Character.valueOf('w') &
            arrayForReplace[i+2] == Character.valueOf('o') &
            arrayForReplace[i+3] == Character.valueOf('r') &
            arrayForReplace[i+4] == Character.valueOf('l') &
            arrayForReplace[i+5] == Character.valueOf('d') &
            arrayForReplace[i+6] == Character.valueOf(' ')){
                char [] secondArrayForReplace = wordLetter.toCharArray();
                if (wordLetter.length() > wordWorld.length() & differentSize == 0){

                    differentSize = Integer.valueOf(wordLetter.length()) -
                            Integer.valueOf(wordWorld.length());
                    for (int j = 0; j<=differentSize; j++){
                        secondArrayForReplace[0] += secondArrayForReplace[j];

                    }
                }
for (int k = 0; k < wordWorld.length(); k++){
               arrayForReplace[i] = secondArrayForReplace[k];
                System.out.println();
            }

        }

    }
        String afterChange = String.valueOf(arrayForReplace);
        // String afterChange = worldLine.replaceAll("world", "letter");

        System.out.println(worldLine);
        System.out.println(afterChange);

//TODO
    }

    private void task1(){
        String text = " ";
        String oneSymbol;
        String phrase = "camelCaseOop";
        char [] arrayForReplace = phrase.toCharArray();
        for (int i = 0; i < arrayForReplace.length; i++){
            if (arrayForReplace[i] == Character.toUpperCase(arrayForReplace[i])){
                arrayForReplace[i] = Character.toLowerCase(arrayForReplace[i]);
                oneSymbol = "_" + arrayForReplace[i];
                text += oneSymbol;
            } else {
                oneSymbol = String.valueOf(arrayForReplace[i]);
                text += oneSymbol;
            }

        }

        System.out.println(text.trim());

    }

    public static void main(String[] args) {
        ArrayOfSymbols arrayOfSymbols = new ArrayOfSymbols();
        arrayOfSymbols.task1();
        arrayOfSymbols.task2();
        arrayOfSymbols.task3();
        arrayOfSymbols.task4();
        arrayOfSymbols.task5();
    }
}
