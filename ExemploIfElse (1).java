import java.util.Scanner;

public class ExemploIfElse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);//cria um objeto Scanner para ler a entrada
      
      System.out.print("Digite quantos anos de experiência você possui: ");//solicite a entrada do usuario 
        int anosDeExperiencia = scanner.nextInt(); //Lê o nº de anos de experiencia
        if(anosDeExperiencia <2) {
            System.out.println("Você é um desenvolvedor júnior!");
        } else if (anosDeExperiencia >= 2 && anosDeExperiencia <5) {
            System.out.println("Você é um desenvolvedor pleno!");
        } else {
            System.out.println("Você é um desenvolvedor sênior!");
        }
        scanner.close();//fecha o scanner 
    }
}
