import java.util.Scanner;

//Faça um programa que preencha um vetor com 8 números inteiros, calcule
//e mostre2 vetores resultantes. O primeiro vetor resultante deve conter os 
//numeros positivos e o segundo os números negativos
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] inicial = new int[8];
        int[] positivos = new int[8];
        int[] negativos = new int[8];
        int contP = 0;
        int contN = 0;

        System.out.println("Digite 8 números");

        for(int i=0; i<inicial.length; i++){
            inicial[i] = sc.nextInt();
        }
         
        for(int i=0; i<inicial.length; i++){
            System.out.println(inicial[i] + ' ');
        } 

        for(int i=0; i<inicial.length; i++){
            if(inicial[i]>0){
                inicial[i]=positivos[contP];
                System.out.print("positivos cont p" + positivos[contP]);
                contP++;
                System.out.println(contP);
            }
            else {
                inicial[i]=negativos[contN];
                contN++;
                System.out.print("negat cont p" + negativos[contP]);
            }
        }
        
        System.out.println("Números positivos: ");
        for(int i=0; i<inicial.length; i++){
            System.out.print(positivos[i] + ' ');
        } 

        System.out.println("Números negativos: ");
        for(int i=0; i<inicial.length; i++){
            System.out.print(negativos[i] + ' ');
        } 
        sc.close();
    
}
}
