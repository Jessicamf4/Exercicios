import java.util.Scanner;

//Matriz 12 X 4 com valores de vendas de uma loja
//Linha: mês 4
//Coluna Semana 12
//Total vendido em cada mês
//Total vendido em cada semana
//Total no ano

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] vendas = new int[4][12];

        System.out.println("Digite os valores das vendas por semana");

        for(int i=0; i<4; i++){
            for(int j=0; j<12; j++){
                vendas[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }
}
