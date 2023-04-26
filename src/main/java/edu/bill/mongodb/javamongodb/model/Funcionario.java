package edu.bill.mongodb.javamongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document
public class Funcionario {
    @Id
    private String codigo;
    private String nome;
    private Integer idade;
    private String funcao;
    private BigDecimal salario;
    @DBRef
    private Funcionario chefe;
    public Funcionario() {   }
    public Funcionario(String codigo, String nome, Integer idade, String funcao, BigDecimal salario, Funcionario chefe) {
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.funcao = funcao;
        this.salario = salario;
        this.chefe = chefe;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public Funcionario getChefe() {
        return chefe;
    }
    public void setChefe(Funcionario chefe) {
        this.chefe = chefe;
    }
}
