package Questao6;

interface AnimalDeEstimacao{
    String getNome();
    void setNome(String nome);
    void brinca();
}

public class Animal {
    private int pernas = 0;

    public Animal() {
    }
    public void caminha(){
        System.out.println("Caminhando");
    }
    public void come(){
        System.out.println("Comendo");
    }
}

class Formiga extends Animal{
    public Formiga() {
    }

    @Override
    public void come() {
        super.come();
    }
}

class Cachorro extends Animal implements AnimalDeEstimacao {
    private String nome;

    public Cachorro() {
    }

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public void come() {
        super.come();
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public void setNome(String nome) {

    }

    @Override
    public void brinca() {

    }
}

class Peixe extends Animal implements AnimalDeEstimacao {
    private String nome;

    public Peixe() {
    }

    @Override
    public void come() {
        super.come();
    }

    @Override
    public String getNome() {
        return null;
    }

    @Override
    public void setNome(String nome) {

    }

    @Override
    public void brinca() {

    }
}