class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            int result = 0;
            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    throw new IllegalOperationException(String.format("Operation \'%s\' does not exist", operation));
            }
            return Integer.toString(operand1) + " " + operation + " " + Integer.toString(operand2) + " = " + Integer.toString(result);
        } catch (NullPointerException e) {
            throw new IllegalArgumentException("Operation cannot be null");
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
