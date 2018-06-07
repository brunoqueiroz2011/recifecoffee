package br.com.agnes_bruno.recifecoffee.Utils;

/*
A Class Singleton é utilizada para guardar informações, de forma que só haja uma unica instancia.
* */

public class Singleton {
    private static final Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

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
    private int ImgBackground;

    private Singleton() {
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

    public int getImgBackground() {
        return ImgBackground;
    }

    public void setImgBackground(int imgBackground) {
        this.ImgBackground = imgBackground;
    }
}
