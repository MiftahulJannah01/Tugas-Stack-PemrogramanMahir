package PM;

import java.util.Scanner;

public class BalancedSymbolMifta{
    public static void main(String[] args) {
        StackGenericMifta<String> stack = new StackGenericMifta<>(15);
        String input = "f(x)=(x-3)(x+9)";
        Scanner scn = new Scanner(input);
        scn.useDelimiter("");

        for (int m = 0; m < 15; m++) {
            String karakter = scn.next();
            if (karakter.equals("(")){
                stack.push("(");
            } else if (karakter.equals(")")) {
                stack.pop();
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Tidak Valid");
        }

    }
}