package Exercicios3;
import java.util.Scanner;

public class At23Java {
    //Fiz com AJUDA
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do mês:");
        String mes = sc.nextLine();

        int dias;

        switch (mes) {
            case "janeiro": //1
            case "março": //2
            case "maio": //3
            case "julho": //4
            case "agosto": //5
            case "outubro": //6
            case "dezembro": //7
                dias = 31;
                break;
            case "fevereiro": //8
                dias = 28;
                break;
            case "abril": //9
            case "junho": //10
            case "setembro": //11
            case "novembro": //12
                dias = 30;
                break;

                default:
                    System.out.println("mÊs invalido");
                    return;

        }
        System.out.println("O mês de " + mes + " possui " + dias + " dias.");
    }
}
