public class ArrayOfSymbols {
    private void task1(){
        String po = "[A-Z]";
        String phrase = "camelCase".replaceAll(po, po);

        System.out.println(phrase);

    }

    public static void main(String[] args) {
        ArrayOfSymbols arrayOfSymbols = new ArrayOfSymbols();
        arrayOfSymbols.task1();
    }
}
