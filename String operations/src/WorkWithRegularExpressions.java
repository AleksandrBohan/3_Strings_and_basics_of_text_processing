import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkWithRegularExpressions {

    private void task2(int numberOfTeg){
        String str = "<notes>\n" + "<note id =\"1\">\n" + "<to>Вася</to>\n" +
                "<from>Света</from>\n" + "<heading>Напоминание</heading>\n" +
                "<body>Позвони мне завтра!</body>\n" + "</note>\n" +
                "<note id =\"2\">\n" + "<to>Петя</to>\n" + "<from>Маша</from>\n" +
                "<heading>Важное Напоминание</heading>\n" + "</body>\n" +
                "</note>\n" + " </notes>\n";
        Pattern[]patterns = new Pattern[10];
        Pattern pat1 = Pattern.compile("<[a-z]{5}>.+</[a-z]{5}>\\n");
        Pattern pat2 = Pattern.compile("<[a-z]{4}\\s[a-z]{2}\\s=\"\\d\">\\n.+" +
        "\\n.+\\n+.\\n+.\\n</[a-z]{4}>\\n");
        Pattern pat3 = Pattern.compile("<[a-z]{2}>.+</[a-z]{2}>");
        Pattern pat4 = Pattern.compile("<[a-z]{4}>[А-Я][а-я]{4}.?</[a-z]{4}>");
        Pattern pat5 = Pattern.compile("<[a-z]{7}>[А-Я][а-я]{10}</[a-z]{7}>");
        Pattern pat6 = Pattern.compile("<[a-z]{4}>.+\\s[а-я]{3}\\s.+!</[a-z]{4}>");
        Pattern pat7 = Pattern.compile("[a-z]{4}\\s[a-z]{2}\\s=\"\\d\">\\n<[a-z]>" +
                "[А-Я].+</[a-z]{2}>\\n<[a-z]{4}>[А-Я][а-я]{3}</[a-z]{4}>\\n" +
                "<[a-z]{7}>[А-Я].+\\s[А-Я].+</[a-z]{7}>\\n</[a-z]{4}>\\n" +
                "</[a-z]{4}>\\n");




        Matcher matcher = pat7.matcher(str);
       // Matcher matcher1 = pattern1.matcher(str);


      //  Matcher matcher2 = pattern2.matcher(stru);
        while (matcher.find()){
            System.out.println(matcher.group());

        }



     /*       count++;
            System.out.println(matcher.group());
            while (matcher2.find()){
                countSentences++;
                System.out.println(matcher2.group());
            }

            System.out.println(count + "st paragraph have " + countSentences + " sentences!");
            // System.out.println(str);
            countSentences = 0;
        }
        System.out.println(str);*/

    }

    private void task1(){
        int count = 0;
        int countSentences = 0;
        String stru = "habscbackj";
        String str = "\tHello world.\n" +
                "This is line 2.\n" +
                "Line 3 here.\n" +
                "Yet another line 4." + "\n" +
                "Few more lines 5!\n"
        +"\n\tHello world.\n" +
                "This is line 2.\n" +
                "Line 3 here.\n" +
                "Yet another line 4." + "\n" +
                "Few more lines 5.\n"
        +"\tHello world.\n" +
                "This is line 2.\n" +
                "Line 3 here.\n" +
                "Yet another line 4." + "\n" +
                "Few more lines 5.\n"
        +"\tHello world.\n" +
                "This is line 2.\n" +
                "Line 3 here.\n" +
                "Yet another line 4." + "\n" +
                "Few more lines 5.\n";

        Pattern pattern = Pattern.compile("^\t.\\n+");
        Pattern pattern1 = Pattern.compile("[.!?]+");
        Pattern pattern2 = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(str);
        Matcher matcher1 = pattern1.matcher(str);
        Matcher matcher2 = pattern2.matcher(stru);
        while (matcher.find()){

            count++;
            System.out.println(matcher.group());
            while (matcher2.find()){
                countSentences++;
                System.out.println(matcher2.group());
            }

            System.out.println(count + "st paragraph have " + countSentences + " sentences!");
           // System.out.println(str);
            countSentences = 0;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        WorkWithRegularExpressions workWithRegularExpressions = new WorkWithRegularExpressions();
        workWithRegularExpressions.task1();
        workWithRegularExpressions.task2(2);
    }

}
