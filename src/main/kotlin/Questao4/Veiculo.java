package Questao4;

import Questao3.Animal;

public abstract  class Veiculo {
    abstract boolean checkList();
    abstract void adjust();
    abstract void cleanup();
}

 class Bicicleta extends Veiculo {

    private int rodagem;
    private boolean precisaDeLimpeza=false;
    @Override
    boolean checkList() {
        System.out.println("Verificando se o veiculo precisa ser analisado");
        rodagem++;
        if (rodagem%5==0){
            precisaDeLimpeza=true;
            System.out.println("O bicicleta está precisando de limpeza");
        }
        return rodagem % 2 == 0;
    }

    @Override
    void adjust() {
        System.out.println("Ajustando");
        rodagem=0;
    }

    @Override
    void cleanup() {
        if (precisaDeLimpeza){
            precisaDeLimpeza=false;
            System.out.println("O bicicleta está está limpo");
        }
        else {
            System.out.println("A bicicleta não precisa de limpeza");
        }
    }
}

class Carro extends Veiculo {

    private int rodagem;
    private boolean precisaDeLimpeza=false;
    @Override
    boolean checkList() {
        System.out.println("Verificando se o veiculo precisa ser analisado");
        rodagem++;
        if (rodagem%7==0){
            precisaDeLimpeza=true;
            System.out.println("O carro está precisando de limpeza");
        }
        return rodagem % 5 == 0;
    }

    @Override
    void adjust() {
        System.out.println("Ajustando");
        rodagem=0;
    }

    @Override
    void cleanup() {
        if (precisaDeLimpeza){
            precisaDeLimpeza=false;
            System.out.println("O carro está está limpo");
        }
        else {
            System.out.println("A carro não precisa de limpeza");
        }
    }
}