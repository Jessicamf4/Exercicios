import java.util.Scanner;

//Faça um programa que preencha dois vetores de dez elementos númericos
//cada um e mostre o vetor resultante da interação deles.

public class App {
    public static void main(String[] args) throws Exception {
        final Scanner sc= new Scanner(System.in);
        int contX = 0;
        int contY = 0;
        int [ ] Y, X;
        int[] Z = new int [100];
        X = new int[10];
        Y = new int[10];

        System.out.println("Digite 10 números: ");

        for(int i=0; i<10; i++){
            X[i] = sc.nextInt();
        }
       
        System.out.println("Digite 10 números novamente");

        for(int i=0; i<10; i++){
            Y[i] = sc.nextInt();
        }
        sc.close();

        for(int i=0; i<20; i+=2){
            Z[i]=X[contX];
            contX++;}
        
        for(int j=1; j<20; j+=2){
            Z[j]=Y[contY];
            contY++;
        }
        
        
            for(int i=0; i<20; i++){
                System.out.print(Z[i]);
            }
       

    }
}
