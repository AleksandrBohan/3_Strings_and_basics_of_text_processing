public class ArrayOfSymbols {

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

    }

    public static void main(String[] args) {
        ArrayOfSymbols arrayOfSymbols = new ArrayOfSymbols();
        arrayOfSymbols.task1();
        arrayOfSymbols.task2();
    }
}
