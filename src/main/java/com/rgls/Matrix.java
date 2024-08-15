package com.rgls;

@SuppressWarnings("unused")
public class Matrix {
    private final Integer[][] matrix;
    private final int row;
    private final int col;

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        this.matrix = new Integer[row][col];
    }

    public void insertMatrix(int value){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == null) {
                    matrix[i][j] = value;
                    return;
                }
            }
        }
        System.out.println("Matriz cheia");
    }

    // Apenas para manter os valores em um grid,
    // deixando melhor a visualização
    private void lineUp(int row, int col){
        if(matrix[row][col] == null){
            System.out.print(" ");
        } else if (matrix[row][col] > 9) {
            System.out.print("   ");
        } else if (matrix[row][col] < 0){
            if(matrix[row][col] > -10){
                System.out.print("   ");
            } else {
                System.out.print("  ");
            }
        } else {
            System.out.print("    ");
        }
    }

    public void print(int row, int col){
        if(row == this.row){ // Condição de parada - se o índice da linha for igual
            return;          // a quantidade de linhas inseridas, significa que passamos por um
        }

        System.out.print(matrix[row][col] + "  "); // Printa o valor atual

        lineUp(row, col); // Alinha elementos

        // Se o índice da coluna é igual à quantidade de colunas menos um (já que índice começa e 0),
        // chegamos à última coluna, então incrementamos a linha em 1 e retornamos a coluna para zero
        if(col == this.col - 1){
            System.out.println(); // Pula linha
            print(row + 1, 0);
            return;
        }

        // Enquanto o índice da coluna for menor que a quantidade de colunas
        // chamamos a função novamente incrementando as colunas em 1
        if(col < this.col){
            print(row, col + 1);
        }
    }
}