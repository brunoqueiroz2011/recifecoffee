package br.com.agnes_bruno.recifecoffee.Cafeteria;

import java.util.ArrayList;
import java.util.List;

import br.com.agnes_bruno.recifecoffee.R;

public class Cafeteria {

    private String nome;
    private String horarios;
    private String localizacao;
    private int imagem;

    public Cafeteria(String nome, String horarios, String localizacao, int imagem) {
        this.nome = nome;
        this.horarios = horarios;
        this.localizacao = localizacao;
        this.imagem = imagem;
    }

    public static List<Cafeteria> getCafeterias(){
        List<Cafeteria> cafeterias = new ArrayList<Cafeteria>();
        //cafeterias.add(new Cafeteria("A vida é Bela","teste"," teste", R.drawable.a_vida_e_bela));
        cafeterias.add(new Cafeteria("A vida é Bela","Ter-Sex:12h às 20h e Sab-Dom: 15h às 20h","Rua Francisco Lacerda, n° 394, Varzea", R.drawable.a_vida_e_bela));
        return cafeterias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
