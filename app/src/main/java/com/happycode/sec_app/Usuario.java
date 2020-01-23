package com.happycode.sec_app;

public class Usuario {

    private String id;
    private String nome;
    private String userName;
    private String passWord;
    private Integer qtdCoins;
    private Double vlrCoins;

    public Usuario(String nome, Integer qtdCoins) {
        this.nome = nome;
        this.qtdCoins = qtdCoins;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Integer getQtdCoins() {
        return qtdCoins;
    }

    public void setQtdCoins(Integer qtdCoins) {
        this.qtdCoins = qtdCoins;
    }

    public Double getVlrCoins() {
        return vlrCoins;
    }

    public void setVlrCoins(Double vlrCoins) {
        this.vlrCoins = vlrCoins;
    }
}
