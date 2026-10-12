package Revisao.Exercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;
        int qntAlunas = 0;

        do{
            System.out.println("1- iniciar");
            System.out.println("2- mostrar quantidade de alunas cadastradas");
            System.out.println("3- sair");
            System.out.println("Digite a opção desejada: ");

            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Aluna aluna = new Aluna();

                    System.out.println("Digite a primeira nota: ");
                    aluna.nota1 = sc.nextDouble();

                    if (aluna.nota1 < 0 || aluna.nota1 > 10){
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10");
                        aluna.nota1 = sc.nextDouble();
                    }
                    System.out.println("Digite a segunda nota: ");
                    aluna.nota2 = sc.nextDouble();
                    if (aluna.nota2 < 0 || aluna.nota2 > 10){
                        System.out.println("Nota inválida! Digite uma nota entre 0 e 10");
                        aluna.nota2 = sc.nextDouble();
                    }

                    sc.nextLine();
                    System.out.println("Digite o nome da aluna: ");
                    aluna.nome = sc.nextLine();

                  aluna.media = (aluna.nota1 + aluna.nota2) / 2;

                    if(aluna.media >= 6){
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    }

                    qntAlunas++;

                    System.out.printf(
                            "O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, " +
                                    "e sua média final foi %.1f. Aluna aprovada: %b%n",
                            aluna.nome,
                            aluna.nota1,
                            aluna.nota2,
                            aluna.media,
                            aluna.passou
                    );

                    break;

                case 2:
                    System.out.printf("Até agora foram cadastradas %d aluna(s).%n", qntAlunas);
                    break;
                case 3:
                    System.out.println("Encerrando programa..");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
                    break;
            }
        } while (opcao != 3);

        sc.close();
    }
}
