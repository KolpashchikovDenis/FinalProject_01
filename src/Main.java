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
            scanner.nextLine();
            switch (code) {
                case 1:
                    System.out.print("Введите выражение: ");
                    expression = scanner.nextLine();
                    lastResult = String.valueOf(parseExpression(expression));
                    System.out.printf("Результат: %s\n", lastResult);
                    code = 0;
                    continue;

                case 2:
                    showSubMenu();
                    subCode = scanner.nextInt();
                    if( lastResult.length()==0){
                        System.out.println("Недоступно!");
                    } else {
                        System.out.print("Введите число: ");
                        int a = scanner.nextInt();
                        String e = "";
                        switch(subCode){
                            case 1:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 2:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 3:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 4:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 5:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 6:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 7:
                                e = String.format("%s + %d", lastResult, a);
                                lastResult = String.valueOf(sum(e));
                                System.out.printf("результат: %s\n\n");
                                showMainMenu();
                                continue;

                            case 0:
                                showMainMenu();
                                continue;
                        }
                    }

                case 3: return;
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

    public static double parseExpression(String expression){
        if(expression.contains("+")){
            return sum(expression);
        } else if (expression.contains("-")){
            return diff(expression);
        } else if (expression.contains("/")){
            return div(expression);
        } else if (expression.contains("*")){
            return mul(expression);
        } else if (expression.contains("^")){
            return power(expression);
        } else if (expression.contains("!")){
            return factorial(expression);
        } else if (expression.contains("?")){
            return equal(expression);
        } else {
            return 0;
        }
    }

    public static int sum(String e){
        String[] st = e.replaceAll("\\s+", "").split("\\+");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return a + b;
    }

    public static int diff(String e){
        String[] st = e.replaceAll("\\s+", "").split("-");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return a - b;
    }

    public static int mul(String e){
        String[] st = e.replaceAll("\\s+", "").split("\\*");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return a * b;
    }

    public static double div(String e){
        String[] st = e.replaceAll("\\s+", "").split("/");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return (double)(a / b);
    }

    public static double power(String e){
        String[] st = e.replaceAll("\\s+", "").split("\\^");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return Math.pow(a, b);
    }

    public static double equal(String e){
        String[] st = e.replaceAll("\\s+", "").split("\\?");
        int a = Integer.parseInt(st[0]);
        int b = Integer.parseInt(st[1]);
        return a == b ? 1.0 : 0.0;
    }

    public static int factorial(String e){
        String[] st = e.replaceAll("\\s+", "").split("!");
        int a = Integer.parseInt(st[0]);
        return fctrl(a);
    }

    public static int fctrl(int a){
        if((a == 0) || (a == 1)){
            return 1;
        }

        return a * fctrl(--a);
    }

}