import java.util.Scanner;

//Faça um programa para corrigir provas de múltipla escolha. 
// 8 questões e 10 alunos
//Mostre o número e a nota de cada aluno
//A porcentagem de aprovação- nota mínima é 6

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int[][] answers = new int[3][5];
        int[] feedback = new int[5];
        int[] notas = new int[3];
        int nota = 0;
        int soma = 0;
        double media = 0;

        

        System.out.println("Digite o gabarito: 1(A), 2(B), 3(C), 4(D) ");

        for(int i=0; i<feedback.length; i++){
           feedback[i] = sc.nextInt(); 
        }

        System.out.println("Digite as respostas dos alunos: ");
        //Primeiro elemento india a linha e o segundo a coluna
        for(int i = 0; i < 3; i++){
            System.out.println("Linha "+i);
            for(int j = 0;  j < 5; j++){
                System.out.println("Coluna "+j);
                answers[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Matriz: ");
        for(int i = 0; i < 3; i++){  
            System.out.print("\n");
            for(int j = 0;  j < 5; j++){
                System.out.print(answers[i][j] + "\t");
            }
        }

        for(int i = 0; i < 3; i++){  
                for(int j = 0;  j < 5; j++){
                    if(answers[i][j]==feedback[j]){
                        nota++;
                    }
                }
                notas[i]=nota;
                System.out.println(" ");
                System.out.println("Aluno " + i + " : nota: " + nota);
                nota=0;
        }
        sc.close();

        for(int i = 0; i < 3; i++){  
            soma += notas[i];
        }

        media = ((soma / 3)*100)/5;
        System.out.println("A média da turma foi de " + media + " %");
   
}
}

