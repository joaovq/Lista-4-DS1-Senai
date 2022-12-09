package Questao5;


import java.util.Arrays;
import java.util.Random;

public abstract class Quadrilatero {

    abstract float calcularArea();
    abstract float calcularPerimetro();

}

class Retangulo extends Quadrilatero{
    private float lado;

    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;
    }

    private float altura;

    Retangulo() {
    }

    @Override
    float calcularArea() {
        return lado*altura;
    }

    @Override
    float calcularPerimetro() {
        return lado*4;
    }
}

class Circulo extends Quadrilatero{
    private float raio;

    public Circulo(float raio) {
        this.raio = raio;
    }

    private final float PI = (float) Math.PI;

    @Override
    float calcularArea() {
        return ((raio*raio)*PI);
    }

    @Override
    float calcularPerimetro() {
        return   2*PI*raio;
    }
}
class Quadrado extends Retangulo{
    private float ladoQuadrado;

    public Quadrado(float ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public Quadrado(float lado, float altura) {
        super(lado, altura);
    }

    @Override
    float calcularArea() {
        return ladoQuadrado*ladoQuadrado;
    }

    @Override
    float calcularPerimetro() {
        return ladoQuadrado*4;
    }
}

class TestQuadrado{
    public static void main(String[] args) {
        Random random = new Random();
        random.nextFloat(0,100);
        Quadrilatero[] quadradrilateros = new Quadrilatero[]
                {
                        new Circulo(random.nextInt(0,100)),
                        new Retangulo(
                                random.nextInt(0,100),
                                random.nextInt(0,100)
                        ),
                        new Quadrado(random.nextInt(0,100)),
                        new Quadrado(random.nextInt(0,100)),
                        new Retangulo(
                                random.nextInt(0,100),
                                random.nextInt(0,100)
                        )
                };

        int length = quadradrilateros.length;
        for (int i = 0; i< length; i++){
            System.out.println(Arrays.toString(quadradrilateros[i].getClass().toString().split("class Questao5.|.java")));
            System.out.println("Area: "+quadradrilateros[i].calcularArea());
            System.out.println("Perimetro: "+quadradrilateros[i].calcularPerimetro());
        }
    }
}