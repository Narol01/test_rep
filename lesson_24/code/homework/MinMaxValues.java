package homework;

public class MinMaxValues {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {

            switch (args[i]) {
                case "int" -> {
                    System.out.println("Integer Max= " + Integer.MAX_VALUE);
                    System.out.println("Integer Min= " + Integer.MIN_VALUE);
                }
                case "double" -> {
                    System.out.println("Double Max= " + Double.MAX_VALUE);
                    System.out.println("Double Min= " + Double.MIN_VALUE);
                }
                case "char" -> {
                    System.out.println("Character Max= " + Character.MAX_VALUE);
                    System.out.println("Character Min= " + Character.MIN_VALUE);
                }
                case "byte" -> {
                    System.out.println("Byte Max= " + Byte.MAX_VALUE);
                    System.out.println("Byte Min= " + Byte.MIN_VALUE);
                }
                case "short" -> {
                    System.out.println("Short Max= " + Short.MAX_VALUE);
                    System.out.println("Short Min= " + Short.MIN_VALUE);
                }
                case "long" -> {
                    System.out.println("Long Max= " + Long.MAX_VALUE);
                    System.out.println("Long Min= " + Long.MIN_VALUE);
                }
                case "float" -> {
                    System.out.println("Float Max= " + Float.MAX_VALUE);
                    System.out.println("Float Min= " + Float.MIN_VALUE);
                }
                default -> System.out.println("Wrong input");
            }
        }
    }
}
