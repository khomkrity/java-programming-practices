package com.khomkrit.hackerrank;

import java.util.BitSet;
import java.util.Scanner;

// This class implements a vector of bits that grows as needed.
// Each component of the bit set has a boolean value.
// The bits of a BitSet are indexed by non-negative integers.
// One BitSet may be used to modify the contents of another BitSet through logical operations.
// By default, all bits in the set initially have the value false (all zeros).
public class BitSetExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int size = Integer.parseInt(input.split(" ")[0]);
        int numberOfOperations = Integer.parseInt(input.split(" ")[1]);
        String[] operations = new String[numberOfOperations];
        BitSet bitSetA = new BitSet(size);
        BitSet bitSetB = new BitSet(size);
        for (int i = 0; i < numberOfOperations; i++) {
            operations[i] = scanner.nextLine();
        }
        for (int i = 0; i < numberOfOperations; i++) {
            String operation = operations[i].split(" ")[0];
            int firstIndex = Integer.parseInt(operations[i].split(" ")[1]);
            int secondIndex = Integer.parseInt(operations[i].split(" ")[2]);
            // AND <bitset> <bitset>
            // OR <bitset> <bitset>
            // XOR <bitset> <bitset>
            if (operation.equals("AND") || operation.equals("OR") || operation.equals("XOR")) {
                if (firstIndex == 1) {
                    if (operation.equals("AND")) {
                        bitSetA.and(bitSetB);
                    } else if (operation.equals("OR")) {
                        bitSetA.or(bitSetB);
                    } else {
                        bitSetA.xor(bitSetB);
                    }
                } else {
                    if (operation.equals("AND")) {
                        bitSetB.and(bitSetA);
                    } else if (operation.equals("OR")) {
                        bitSetB.or(bitSetA);
                    } else {
                        bitSetB.xor(bitSetA);
                    }
                }
                System.out.println(bitSetA.cardinality() + " " + bitSetB.cardinality());
            }
            // FLIP <bitset> <index>
            // SET <bitset> <index>
            if (operation.equals("FLIP") || operation.equals("SET")) {
                if (firstIndex == 1) {
                    if (operation.equals("FLIP")) {
                        bitSetA.flip(secondIndex);
                    } else {
                        bitSetA.set(secondIndex);
                    }
                } else {
                    if (operation.equals("FLIP")) {
                        bitSetB.flip(secondIndex);
                    } else {
                        bitSetB.set(secondIndex);
                    }
                }
                System.out.println(bitSetA.cardinality() + " " + bitSetB.cardinality());
            }
        }
    }
}
