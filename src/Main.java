import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int code = 0;
        int subCode = -1;
        String lastResult = ""; // легче контролировать, был ли последний результат
        String expression = "";
        Scanner scanner = new Scanner(System.in);

        showMainMenu();
        while(code != 3) {
            code = scanner.nextInt();
            switch (code) {
                case 1:
                    System.out.print("Введите выражение: ");
                    expression = scanner.nextLine();
                    parseExpression(expression);
                    code = 0;
                    continue;

                case 2:
                    showSubMenu();
                    subCode = scanner.nextInt();
                    if( lastResult.length()==0){
                        System.out.println("Недоступно!");
                    } else {
                        switch(subCode){
                            case 1:
                                break;

                            case 2:
                                break;

                            case 3:
                                break;

                            case 4:
                                break;

                            case 5:
                                break;

                            case 6:
                                break;

                            case 7:
                                break;

                            case 0:
                        }
                    }
                    subCode = -1;
                    continue;

                case 3:
            }
        }

    }

    public static void showMainMenu(){
        System.out.println("1. Ввести пример");
        System.out.println("2. Продолжить работу с предыдущим ответом");
        System.out.println("3. Выход");
    }

    public static void showSubMenu(){
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        System.out.println("5. Факториал");
        System.out.println("6. Возведение в степень");
        System.out.println("7. Сравнение");
        System.out.println("0. Назад");
    }

    public static void parseExpression(String expr){

    }

    public static int sum(String a, String b){

        return 0;
    }

    public static int diff(String a, String b){

        return 0;
    }

    public static int mul(String a, String b){

        return 0;
    }

    public static int div(String a, String b){

        return 0;
    }

    public static int power(String a, String b){

        return 0;
    }

    public static int equal(String a, String b){

        return 0;
    }
}