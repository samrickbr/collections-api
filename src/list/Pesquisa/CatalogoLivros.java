package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //métodos


    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l:livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntevaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();
        if (!livroList.isEmpty()){
            for (Livro l:livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisaporTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){
            for(Livro l: livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivros("livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivros("livro 2", "Autor 1", 2001);
        catalogoLivros.adicionarLivros("livro 3", "Autor 2", 2000);
        catalogoLivros.adicionarLivros("livro 4", "Autor 2", 2003);
        catalogoLivros.adicionarLivros("livro 4", "Autor 3", 2002);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));

        System.out.println(catalogoLivros.pesquisaPorIntevaloAno(2000, 2001));

        System.out.println(catalogoLivros.pesquisaporTitulo("livro 4"));

    }
}
