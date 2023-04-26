package edu.bill.mongodb.javamongodb.controller;

import edu.bill.mongodb.javamongodb.model.Funcionario;
import edu.bill.mongodb.javamongodb.service.FuncionarioService;
import edu.bill.mongodb.javamongodb.service.FuncionarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/funcionarios")
public class FunionarioController {
    @Autowired
    FuncionarioServiceImpl service;
    @PostMapping
    public Funcionario criar(@RequestBody Funcionario funcionario) {
        return this.service.cadastrar(funcionario);
    }
    @GetMapping
    public List<Funcionario> buscarTodos(){
        return this.service.buscarTodos();
    }
    @GetMapping("/range")
    public List<Funcionario> buscarPorFaixaEtaria(@RequestParam("de") Integer de,@RequestParam("ate") Integer ate){
        return this.service.buscarPorFaixaEtaria(de, ate);
    }
    @GetMapping("/por-nome")
    public List<Funcionario> buscarPorNome(@RequestParam("nome") String nome){
        return this.service.buscarPorNome(nome);
    }
    @GetMapping("/{codigo}")
    public Funcionario buscarPorCodigo(@PathVariable String codigo){
        return this.service.buscarPorCodigo(codigo);
    }
    @PutMapping("/{codigo}")
    public Funcionario AlterarPorCodigo(@PathVariable String codigo,@RequestBody Funcionario funcionario){
        return this.service.alterarPorCodigo(codigo,funcionario);
    }
    @DeleteMapping("/{codigo}")
    public void apagar(@PathVariable String codigo){
    service.apagarPorCodigo(codigo);
    }
}
