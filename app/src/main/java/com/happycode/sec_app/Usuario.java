package com.happycode.sec_app;

public class Usuario {

    private String id;
    private String nome;
    private String userName;
    private String passWord;
    private Integer qtdCoins;
    private Double vlrCoins;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public Integer getQtdCoins() {
        return qtdCoins;
    }

    public Double getVlrCoins() {
        return vlrCoins;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setQtdCoins(Integer qtdCoins) {
        this.qtdCoins = qtdCoins;
    }

    public void setVlrCoins(Double vlrCoins) {
        this.vlrCoins = vlrCoins;
    }
}
