package edu.bill.mongodb.javamongodb.service;

import edu.bill.mongodb.javamongodb.model.Funcionario;
import edu.bill.mongodb.javamongodb.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FuncionarioServiceImpl implements FuncionarioService{
    @Autowired
    FuncionarioRepository repository;
    @Override
    public Funcionario cadastrar(Funcionario funcionario) {
        Funcionario chefe = this.repository.findById(funcionario.getChefe().getCodigo())
                .orElseThrow(()-> new IllegalArgumentException("Codigo informado inexistente!"));;
        funcionario.setChefe(chefe);
        return this.repository.save(funcionario);
    }
    @Override
    public List<Funcionario> buscarTodos() {
        return this.repository.findAll();
    }
    @Override
    public Funcionario buscarPorCodigo(String codigo) {
        return this.repository.findById(codigo).orElseThrow(()-> new IllegalArgumentException("Codigo informado inexistente!"));
    }

    @Override
    public List<Funcionario> buscarPorFaixaEtaria(Integer de, Integer ate) {
        return this.repository.obterFunciorioPorFaixaEtaria(de,ate);
    }

    @Override
    public List<Funcionario> buscarPorNome(String nome) {
        return this.repository.findByNome(nome);
    }

    @Override
    public Funcionario alterarPorCodigo(String codigo, Object funcionarios) {
        Funcionario funcionarioUpdate =repository.findById(codigo).orElseThrow(()-> new IllegalArgumentException("Codigo informado inexistente!"));
        return this.repository.save(funcionarioUpdate);
    }
    @Override
    public void apagarPorCodigo(String codigo) {
        this.repository.deleteById(codigo);
    }
}
