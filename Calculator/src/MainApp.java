import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
public class MainApp {
    public static void main(String[] args) {
        final String inputExp = ReadInput.read();

        Queue<String> operations;
        Queue<String> numbers;

        String numbersArr[] = inputExp.split("[-+*/]");
        String openArr[] = inputExp.split("[0-9+]");

        numbers = new LinkedList<String>(Arrays.asList(numbersArr));
        operations = new LinkedList<String>(Arrays.asList(openArr));

        Double res = Double.parseDouble(numbers.poll());

        while (!numbers.isEmpty()){
            String opr = operations.poll();

            Operate operate;
            switch (opr) {
                case "+" -> operate = new Add();
                case "-" -> operate = new Subtract();
                case "*" -> operate = new Multiply();
                case "/" -> operate = new Divide();
                default -> {
                    continue;
                }
            }

            Double num = Double.parseDouble(numbers.poll());
            res = operate.getResult(res, num);
        }

        System.out.println(res);
    }
}
