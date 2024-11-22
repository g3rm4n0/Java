import java.util.Date;

 // Superclasse
 class Pessoa {
    public String nome;
    public String cpf;
    public Date dataNascimento; 

    public Pessoa(String nome, String cpf, Date dataNascimento) {
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
    }
 }

 //Subclasse Aluno
 class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
    super (nome, cpf, dataNascimento); // Chama o construtor da superclasse
    this.matricula = matricula;
    }
    public void exibirInformacoes () {
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Data de Nascimento: " + dataNascimento);
    System.out.println("Matrícula: " + matricula);

    }
 }
// Subclasse Professor 
class Professor extends Pessoa {
    public double salario;
    public String disciplina;

    public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
    super(nome, cpf, dataNascimento); // Chama o construtor da superclasse 
    this.salario = salario;
    this.disciplina = disciplina;
    }
        public void exibirInformacoes() {
        System.out .println("Nome:" + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Salário: " + salario);
        System.out.println("Disciplina: " + disciplina);
    }
}

//Classe Principal
public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno (nome: "José Silva", cpf:"123.456.789-00", new Date(), matricula:"2023-001");
        Professor professor = new Professor(nome:"Maria Oliveira", cpf:"987.654.321-00", new Date(), salario:5000.00, disciplina:"Matemática");

        System.out.println("Informações do Aluno:"); 
        aluno.exibirInformacoes();

        System.out.println("\nInformações do Professor:"); 
        professor.exibirInformacoes();
    }
}