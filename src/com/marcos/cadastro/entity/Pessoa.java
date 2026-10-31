package com.marcos.cadastro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Pattern;



@Entity
@Table(name = "pessoas")
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "O nome não pode ficar vazio")
    @Column(length = 100)
    private String nome;

    @Min(value = 1, message = "A idade deve ser no mínimo 1")
    private Integer idade;

    @NotBlank
    @Column(length = 1, columnDefinition = "CHAR(1)")
    @Pattern(regexp = "M|F", message = "O sexo deve ser informado como M ou F")
    private String sexo;

    @Column(precision = 5, scale = 2)
    @DecimalMin(value = "0.01", message = "O peso deve ser maior que zero")
    private BigDecimal peso;

    @Column(precision = 3, scale = 2)
    @DecimalMin(value = "0.01", message = "A altura deve ser maior que zero")
    private BigDecimal altura;

    @NotBlank(message = "A nacionalidade não pode ficar vazia")
    @Column(length = 50)
    private String nacionalidade;

    public Pessoa() {
    }
    public Integer getId() {
        return id;
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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}