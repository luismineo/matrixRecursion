package com.rgls;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int row = 13;
        int col = 18;

        Matrix mt = new Matrix(row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mt.insertMatrix(new Random().nextInt(45) - 15);
            }
        }

        mt.print(0, 0);
    }
}