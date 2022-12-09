package Questao3;

public abstract class Animal {
    private String nome;
    private int idade;
    private String cor;

    public Animal(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public abstract void emiteSom();
    public void corre(){
        System.out.println("O " + nome +" está correndo");
    }
    public void sobeEmArvore(){
        System.out.println("O " + nome +" está sobe em árvore");
    }
}
class Cachorro extends Animal{

    public Cachorro(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emiteSom() {
        System.out.println("Au Au");
    }

    @Override
    public void corre() {
        super.corre();
    }
}
class Cavalo extends Animal{

    public Cavalo(String nome, int idade, String cor) {
        super(nome, idade, cor);
    }

    @Override
    public void emiteSom() {
        System.out.println("Slinsh");
    }

    @Override
    public void corre() {
        super.corre();
    }
}

class Preguica extends Animal{

    public Preguica(
            String nome,
            int idade,
            String cor
    ) {
        super(
                nome,
                idade,
                cor
        );
    }

    @Override
    public void emiteSom() {
        System.out.println("ahhhhhhhhhhhhh");
    }

    @Override
    public void sobeEmArvore() {
        super.sobeEmArvore();
    }
}