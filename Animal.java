public class Animal {
    void fazersom(){
        System.out.println("O animal faz um som");
    }
}

class Cachorro extends Animal{
    @Override
    void fazerSom(){
        super.fazerSom(){
            super.fazerSom; //chamando o método da superclasse
            System.out.println("O cachorro late");
        }
    }
}