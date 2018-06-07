package br.com.agnes_bruno.recifecoffee.Cafeteria;

import java.util.ArrayList;
import java.util.List;

import br.com.agnes_bruno.recifecoffee.R;

public class Cafeteria {

    private String nome; //Nome da Cafeteria
    private String descricao; //Descrição da Cafeteria
    private String bebidaCafe; //Bebida da sugestão do Barista
    private String salgado; //Salgado da sugestão do Barista
    private String sobremesa; //Sobremesa da sugestão do Barista
    private String horariosResumido; //Horario para exibição no menu
    private String horarios; //Horario completo
    private String localizacaoResumido; //Localização para exibição no menu
    private String localizacao; //Localização completo
    private String instagram; 
    private String facebook;
    private String telefone;
    private String formaPagamento;
    private int imagem;
    private int ImgBackground;

    public Cafeteria(String nome, String horarios, String localizacao, int imagem, int imgBackground, String instagram, String facebook) {
        this.nome = nome;
        this.horariosResumido = horarios;
        this.localizacaoResumido = localizacao;
        this.imagem = imagem;
        this.ImgBackground = imgBackground;
        this.instagram = instagram;
        this.facebook = facebook;
    }

    public static List<Cafeteria> getCafeterias(){
        List<Cafeteria> cafeterias = new ArrayList<Cafeteria>();
        //cafeterias.add(new Cafeteria("A vida é Bela","teste"," teste", R.drawable.a_vida_e_bela));
        cafeterias.add(new Cafeteria("A vida é Bela","Ter-Sex:12h às 20h\nSab-Dom: 15h às 20h","Varzea", R.drawable.a_vida_e_bela, R.drawable.detail_a_vida_e_bela,"https://www.instagram.com/avidaebela.cafe/","https://www.facebook.com/avidaebela.cafe/"));
        return cafeterias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getBebidaCafe() {
        return bebidaCafe;
    }

    public void setBebidaCafe(String bebidaCafe) {
        this.bebidaCafe = bebidaCafe;
    }

    public String getSalgado() {
        return salgado;
    }

    public void setSalgado(String salgado) {
        this.salgado = salgado;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public String getHorariosResumido() {
        return horariosResumido;
    }

    public void setHorariosResumido(String horariosResumido) {
        this.horariosResumido = horariosResumido;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public String getLocalizacaoResumido() {
        return localizacaoResumido;
    }

    public void setLocalizacaoResumido(String localizacaoResumido) {
        this.localizacaoResumido = localizacaoResumido;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public int getImgBackground() {
        return ImgBackground;
    }

    public void setImgBackground(int imgBackground) {
        ImgBackground = imgBackground;
    }
}
