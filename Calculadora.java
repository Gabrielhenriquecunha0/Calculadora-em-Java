import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double num1, num2, res;
        String opr;
        res = 0;
        System.out.println("Digite o 1° número:");
        num1 = leia.nextDouble();
        System.out.println("Digite o 2° número:");
        num2 = leia.nextDouble();
        System.out.println("Escolha o operador:(+ - * /)");
        opr = leia.next();
        
        switch(opr){
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida, tente novamente!");
        }
        System.out.println("Resultado: " + res);
    }
}
