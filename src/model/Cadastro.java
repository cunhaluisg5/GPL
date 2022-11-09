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
public class Cadastro {
    private Pessoa pessoa;
    private Endereco endereco;
    private Contato contato;
    private Profissao profissao;

    public Cadastro() {
    }

    public Cadastro(Pessoa pessoa, Endereco endereco, Contato contato, Profissao profissao) {
        this.pessoa = pessoa;
        this.endereco = endereco;
        this.contato = contato;
        this.profissao = profissao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }
}
