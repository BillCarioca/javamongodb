package edu.bill.mongodb.javamongodb.repository;

import edu.bill.mongodb.javamongodb.model.Funcionario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface FuncionarioRepository extends MongoRepository<Funcionario,String> {
  @Query("{$and: [{'idade':{$gte:?0}},{'idade':{$lte:?1}}]}")
    public List<Funcionario> obterFunciorioPorFaixaEtaria(Integer idadeInicial,Integer idadeFinal);
    public List<Funcionario> findByNome(String nome);
}
