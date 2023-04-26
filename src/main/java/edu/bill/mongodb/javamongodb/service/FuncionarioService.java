package edu.bill.mongodb.javamongodb.service;

import edu.bill.mongodb.javamongodb.model.Funcionario;

import java.util.List;

public interface FuncionarioService {
    public Funcionario cadastrar(Funcionario funcionario);


    public List<Funcionario> buscarTodos();
    public Funcionario buscarPorCodigo(String codigo);
    public List<Funcionario> buscarPorFaixaEtaria(Integer de, Integer ate);
    public List<Funcionario> buscarPorNome(String nome);
    public Funcionario alterarPorCodigo(String codigo,Object funcionarios);
    public void  apagarPorCodigo(String codigo);
}
