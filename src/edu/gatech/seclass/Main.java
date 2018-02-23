package edu.gatech.seclass;

public class Main {

    public static void main(String[] args) {
        if (args.length < 1) {
            throw new RuntimeException("Usage: Main <#iterations>");
        }
        int iterations = Integer.parseInt(args[0]);
        for (int i=0; i < iterations; i++) {
            System.out.println("Iteration #" + (i + 1));
        }
    }
}
