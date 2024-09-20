package main;

public class LogicalOperations {

    public static void main(String[] args) {
        // Basic boolean variables
        boolean t = true;
        boolean f = false;

        System.out.println("1. Basic Logical Operations:");

        // The basic logical AND gives the result "TRUE" when both the conditions are "True"// in rest all other cases it gives "False"
        // The basic logical OR gives the result "TRUE" when even any one of the condition is "True" ohterwise "false"
        // The basic negation or NOT operator gives the complement of each result
        
        System.out.println("   AND: true && true = " + (t && t));
        System.out.println("   AND: true && false = " + (t && f));
        System.out.println("   AND: false && true = " + (f && t));
        System.out.println("   AND: false && false = " + (f && f));
        System.out.println("   OR: true || true = " + (t || t));
        System.out.println("   OR: true || false = " + (t || f));
        System.out.println("   OR: false || true = " + (f || t));
        System.out.println("   OR: false || false = " + (f || f));
        System.out.println("   NOT: !true = " + (!t));
        System.out.println("   NOT: !false = " + (!f));
        System.out.println("=============================================================================================");

        System.out.println("2. Short-circuit Evaluation:");
        System.out.println("   false && (1/0 > 0) = " + (f && (1/0 > 0))); // No ArithmeticException as in this case for AND only the first value that is False matters and it gives the Result False
        // but if the order of the expression (f && (1/0 > 0)) is reversed that is ((1/0 > 0) && f) then it will give arithmatic error as 1/0 is not possible logically

        System.out.println("   true || (1/0 > 0) = " + (t || (1/0 > 0))); // No ArithmeticException
        System.out.println("=============================================================================================");

        System.out.println("\n3. Operator Precedence:");
        System.out.println("   true || false && false = " + (t || f && f)); // && has higher precedence
        System.out.println("   (true || false) && false = " + ((t || f) && f)); // Parentheses change precedence
        System.out.println("=============================================================================================");

        System.out.println("\n4. Logical and Comparison Operators:");
        // >, <, ==, >=, <= are all compariosion operators
        int x = 5, y = 10;
        System.out.println("   (x < y) && (y > 0) = " + ((x < y) && (y > 0)));
        System.out.println("   (x > y) || (y < 20) = " + ((x > y) || (y < 20)));
        System.out.println("   (x > y) || (y < 20) = " + ((x >= y) || (y < 20)));
        System.out.println("   (x > y) || (y < 20) = " + ((x > y) || (y <= 20)));
        System.out.println("   (x > y) && (y < 20) = " + ((x >= y) && (y < 10)));
        System.out.println("   (x > y) && (y < 20) = " + ((x > y) && (y >= 10)));
        System.out.println("=============================================================================================");

        System.out.println("\n5. Complex Conditions:");
        boolean a = true, b = false, c = true;
        System.out.println("   (a && b) || (a && c) = " + ((a && b) || (a && c)));
        System.out.println("   a && (b || c) = " + (a && (b || c)));
        System.out.println("   !a || (b && !c) = " + (!a || (b && !c)));
        System.out.println("=============================================================================================");

        System.out.println("\n6. Bitwise Operators");
        System.out.println("   true & false = " + (t & f)); // Bitwise AND
        System.out.println("   !true & false = " + (!t & f)); // Bitwise AND
        System.out.println("   true | false = " + (t | f)); // Bitwise OR
        System.out.println("   !true | false = " + (!t | f)); // Bitwise OR
        System.out.println("   true ^ false = " + (t ^ f)); // Bitwise XOR
        System.out.println("   !true ^ false = " + (!t ^ f)); // Bitwise XOR
        System.out.println("=============================================================================================");

        System.out.println("\n7. Short-circuit vs. Non-short-circuit:");
        int i = 0;
        boolean result1 = (f && (++i > 0)); // i is not incremented
        System.out.println("   Short-circuit AND result: " + result1 + ", i = " + i);
        boolean result2 = (f & (++i > 0));  // i is incremented
        System.out.println("   Non-short-circuit AND result: " + result2 + ", i = " + i);
        boolean result3 = (t & (++i > 0));  // i is incremented
        System.out.println("   Non-short-circuit AND result: " + result3 + ", i = " + i);

        
        System.out.println("=============================================================================================");

        System.out.println("\n8. Logical Operators with Non-boolean Operands:");
        System.out.println("   (1 < 2) && (3 < 4) = " + ((1 < 2) && (3 < 4)));
        System.out.println("   ('a' < 'b') || ('c' > 'd') = " + (('a' < 'b') || ('c' > 'd')));
        System.out.println("=============================================================================================");

        System.out.println("\n9. Logical Operators in Control Structures:");
        if (t && !f) {
            System.out.println("   This will be printed.");
        }
        
        int j = 0;
        while (j < 3 && t) {
            System.out.println("   j = " + j);
            j++;
        }
        System.out.println("=============================================================================================");

        System.out.println("\n10. Logical Operators with Method Calls:");
        System.out.println("   isPositive(5) && isEven(4) = " + (isPositive(5) && isEven(4)));
        System.out.println("   isPositive(-3) || isEven(7) = " + (isPositive(-3) || isEven(7)));
        System.out.println("=============================================================================================");

        System.out.println("\n11. Logical Operators with Null Checks:");
        String str = null;
        System.out.println("   (str != null) && (str.length() > 0) = " + ((str != null) && (str.length() > 0))); // Safe null check
        // System.out.println("   (str.length() > 0) && (str != null) = " + ((str.length() > 0) && (str != null))); // This would throw NullPointerException
        System.out.println("=============================================================================================");

        System.out.println("\n12. Using Logical Operators for Conditional Assignment or Ternanry Operators:");
        int value = t ? 1 : 0;
        int value1 = f ? 1 : 0;
        System.out.println("   t ? 1 : 0 value: " + value);
        System.out.println("   f ? 1 : 0 value: " + value1);
        System.out.println("=============================================================================================");

        System.out.println("\n13. Logical Operators in Lambda Expressions:");
        java.util.function.Predicate<Integer> isPositiveAndEven = n -> n > 0 && n % 2 == 0;
        System.out.println("   Is 6 positive and even? " + isPositiveAndEven.test(6));
        System.out.println("   Is 5 positive and even? " + isPositiveAndEven.test(5));
    }

    private static boolean isPositive(int n) {
        return n > 0;
    }

    private static boolean isEven(int n) {
        return n % 2 == 0;
    }

    }
    

