import arithmetic.Minus;

public class Footing {

    public static void logic(String num1String, String arithmetic, String num2String) {
        int num1 = 0;
        int num2 = 0;
        int result =0;

        boolean flag = false;
        try {
            num1 = Integer.parseInt(num1String);
            num2 = Integer.parseInt(num2String);
        } catch (Exception e) {
            try {
                num1 = Library.toArabic(num1String);
                num2 = Library.toArabic(num2String);
                flag = true;
            } catch (Exception e1) {
                System.out.println("Вы ввели не верные данные");
            }
        }
        if (num1<1 || num1>10 || num2<1|| num2>10){
            System.out.println("Вы ввели не верные данные");
            System.exit(0);
        }
        arithmetic.Production product;
        if (arithmetic.equals("-")) {
            product = new Minus();
            result = product.roots(num1, num2);

        }
        if (arithmetic.equals("*")){
            product = new arithmetic.Asterisk();
            result = product.roots(num1, num2);
        }
        if (arithmetic.equals("/")){
            product = new arithmetic.Slash();
            result = product.roots(num1, num2);
        }
        if (arithmetic.equals("+")){
            product = new arithmetic.Plus();
            result = product.roots(num1, num2);
        }
        if (flag){
            String roman = Library.toRoman(result);
            System.out.println(roman);

        }
        else System.out.println(result);
    }

}
