import java.util.Scanner;

//Prencha um vetor com 9 números e mostre os números primos e suas posições

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] vetor;
        int[] primos;
        vetor = new int[9];
        primos = new int[9];
        int cont = 0;
        int index = 0;

        System.out.println("Digite 9 números: ");

        for(int i=0; i<vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i=0; i<vetor.length; i++){
            
            for(int j=1; j<=vetor[i]; j++){
                
                if(vetor[i]%j==0){
                    cont++;
                   
                }  
            }
            if(cont==2){
                primos[index]=vetor[i];
                System.out.println();
                System.out.print("Index: " + i + " = ");
                System.out.println(primos[index]);
                index++;
                
            }  
            cont=0;   
        }

        //for(int i=0; i<primos.length; i++){
          //  System.out.print(primos[i] + " ");
       // }

        sc.close();
    }
}
