package list.Ordenacao;

import java.util.*;

public class OrdenacaoPessoa {
    //atributos
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);

        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());

        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome2", 30, 1.88);
        ordenacaoPessoa.adicionarPessoa("Nome3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome4", 17, 1.56);

        System.out.println("");
        System.out.println("Ordednação por Idade:");
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("");
        System.out.println("Ordednação por Altura:");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}