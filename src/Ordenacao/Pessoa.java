package Ordenacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pessoa implements Comparable<Pessoa> {
    //atributos
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "Nome= '" + nome + '\'' +
                ", idade= " + idade +
                ", altura= " + altura +
                '}';
    }

    @Override
    public int compareTo(Pessoa p) { /* usado implements Comparable com generics Pessoa,
                                e adicionado o método de comparar as idades da classe com o a idade do objeto */
        return Integer.compare(idade, p.getIdade());
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
