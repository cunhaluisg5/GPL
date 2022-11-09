/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author luisg
 */
public class Profissao {
    private String profissao;
    private String setor;
    private String cargoAtual;
    private String salarioContratual;
    private String tipoAdmissao;
    private String anoFormacao;
    private String anoContratacao;
    private Empregador empregador;

    public Profissao() {
        empregador = new Empregador();
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargoAtual() {
        return cargoAtual;
    }

    public void setCargoAtual(String cargoAtual) {
        this.cargoAtual = cargoAtual;
    }

    public String getSalarioContratual() {
        return salarioContratual;
    }

    public void setSalarioContratual(String salarioContratual) {
        this.salarioContratual = salarioContratual;
    }

    public String getTipoAdmissao() {
        return tipoAdmissao;
    }

    public void setTipoAdmissao(String tipoAdmissao) {
        this.tipoAdmissao = tipoAdmissao;
    }

    public String getAnoFormacao() {
        return anoFormacao;
    }

    public void setAnoFormacao(String anoFormacao) {
        this.anoFormacao = anoFormacao;
    }

    public String getAnoContratacao() {
        return anoContratacao;
    }

    public void setAnoContratacao(String anoContratacao) {
        this.anoContratacao = anoContratacao;
    }

    public Empregador getEmpregador() {
        return empregador;
    }

    public void setEmpregador(Empregador empregador) {
        this.empregador = empregador;
    }
}
