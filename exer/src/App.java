import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        int [] vetor, dobro;
        vetor = new int [5]; //número de variáveis que cabem dentro do vetor
        dobro = new int [5];
       
        System.out.println("Digite 5 valores");
       
        for (int i=0; i<5; i++){
            vetor [i] = entrada.nextInt();
        }
       
        for (int i=0; i<5; i++){
            dobro [i] = vetor [i]*2;
        }
       
        System.out.println("Vetor: \n");
        for (int i=0; i<5; i++){
            System.out.println(vetor[i] + "\t"); 
            //para printar um vetor é necessário fazer um for, assim cada ídice é exibido por vez
        }
       
        System.out.println("\n\nDobro: \n");
        for (int i=0; i<5; i++){
            System.out.println(dobro[i] + "\t");
        }
    }
   
}
