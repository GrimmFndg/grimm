import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double argument1 = readArgument("Введите первый аргумент");
        double argument2 = readArgument("Введите второй аргумент");
        String operation = readOperation( "Укажите операцию над числами");
        if (validationCalcData(operation)){
            calculate(operation, argument1, argument2);
        }

    }
    static double readArgument(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.println(userText);
        double argument = userInput.nextDouble();
        return argument;
    }
    static String readOperation(String userText){
        Scanner userInput = new Scanner(System.in);
        System.out.println(userText);
        String argument = userInput.nextLine();
        return argument;
    }

    static boolean validationCalcData(String operation){
        boolean result = true;
        if(!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")){
            System.err.println("Указана недопустимая операция");
            result = false;
        }
        return result;
    }

    static void calculate(String operation, double argument1, double argument2){
        switch (operation){
            case "+":
                System.out.println(argument1 + argument2);
                break;
            case "-":
                System.out.println(argument1 - argument2);
                break;
            case "*":
                System.out.println(argument1 * argument2);
                break;
            case "/":
                System.out.println(argument1 / argument2);
                break;
        }
    }
}
