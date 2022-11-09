/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Cadastro;
import model.Contato;
import model.Endereco;
import model.Pessoa;
import model.Profissao;

/**
 *
 * @author luisg
 */
public class CadastroController {
    Cadastro cadastro;

    public CadastroController() {
    }

    public CadastroController(Pessoa pessoa, Endereco endereco, Contato contato, Profissao profissao) {
        cadastro = new Cadastro(pessoa, endereco, contato, profissao);
    }

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
}
