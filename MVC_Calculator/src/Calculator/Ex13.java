package Calculator;

/**
 *
 * @author Tomer Efraim 308254051.
 *
 */
public class Ex13 {

    /**
     * Find the index of the main operator
     *
     * @param expr
     * @return
     */
    public static int find(String expr) {
        int numOfOpenParen = 0;
        int index = -1;
        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '(') {
                numOfOpenParen++;
            }
            if (c == ')') {
                numOfOpenParen--;
            }
            if ((c == '+' || c == '-' || c == '*' || c == '%') && numOfOpenParen == 1) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Calculate two numbers num1 and num2 by given operator op.
     *
     * @param c1
     * @param c2
     * @param op
     * @return
     */
    public static int chrToInt(char c1, char c2, char op) {
        int num1 = c1 - '0';
        int num2 = c2 - '0';
        switch (op) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '%':
                return num1 % num2;
            default:
                break;
        }
        return num1 * num2;
    }

    /**
     * Calculate a given valid string expression.
     *
     * @param expr
     * @return
     */
    public static int evalExpr1(String expr) {
        int mainOpIndex = find(expr);
        if (mainOpIndex == -1) {// if string contains 1 char
            int n = expr.charAt(0) - '0';
            return n;
        }
        if (expr.length() == 5) {// if string expression is of form (x+y)
            // num1 = left number, num2 = right number, op = operator
            char num1 = expr.charAt(1);
            char num2 = expr.charAt(3);
            char op = expr.charAt(2);
            return chrToInt(num1, num2, op);
        }
        // else, we need to compute two main substrings expression each time
        // recursively
        String s1 = expr.substring(1, mainOpIndex);
        String s2 = expr.substring(mainOpIndex + 1, expr.length() - 1);
        char op = expr.charAt(mainOpIndex);
        if (op == '-') {
            return evalExpr1(s1) - evalExpr1(s2);
        }
        if (op == '%') {
            return evalExpr1(s1) % evalExpr1(s2);
        }
        if (op == '*') {
            return evalExpr1(s1) * evalExpr1(s2);
        }
        return evalExpr1(s1) + evalExpr1(s2);
    }

    /**
     * check if an expression is legal.
     *
     * @param expr
     * @return
     */
    public static boolean isLegalExp(String expr) {
        boolean isLegal = true;
        int mainOpIndex = find(expr);
        // if expression has no operators
        if (mainOpIndex == -1) {
            // if its only one char
            if (expr.length() == 1) {
                char c = expr.charAt(0);
                // check if it is a digit
                if (c <= '9' && c >= '0') {
                    return isLegal;
                } else {
                    return false;
                }
            } // else, its not a valid expression because needs to be one digit
            else {
                return false;
            }
        }
        // else, check the two main sub-expressions recursively
        String s1 = expr.substring(1, mainOpIndex);
        String s2 = expr.substring(mainOpIndex + 1, expr.length() - 1);
        return isLegalExp(s1) && isLegalExp(s2);
    }

    /**
     * Calculate a string expression. if its not valid, return "error".
     *
     * @param expr
     * @return
     */
    public static String evalExpr2(String expr) {
        if (isLegalExp(expr)) {
            int n = evalExpr1(expr);
            return String.valueOf(n);
        }
        return "error";
    }
}
