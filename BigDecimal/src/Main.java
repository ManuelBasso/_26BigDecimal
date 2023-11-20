import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal num1 = BigDecimal.valueOf(6.10999);
        BigDecimal num2 = BigDecimal.valueOf(4.44);
        Operation toDo = Operation.MULTIPLICATION;

        System.out.println("1st num: " + num1 + ". 2nd num: " + num2 + ". Mathematic operation: " + toDo);
        System.out.println("Result: " + calculate(num1, num2, toDo));
    }

    public static BigDecimal calculate(BigDecimal num1, BigDecimal num2, Operation toDo) {

        BigDecimal result;

        switch (toDo) {
            case ADD:
                result = num1.add(num2);
                break;
            case SUB:
                result = num1.subtract(num2);
                break;
            case MULTIPLICATION:
                result = num1.multiply(num2);
                break;
            case DIVISION:
                result = num1.divide(num2,2); //RoundingMode.blabla non funziona
                break;
            case MIN:
                result = num1.min(num2);
                break;
            case MAX:
                result = num1.max(num2);
                break;
            default:
                result = null;
        }
        return result;
    }
}