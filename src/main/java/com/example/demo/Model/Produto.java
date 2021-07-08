package com.example.demo.Model;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int valor;

    @ManyToOne
    private Empresa empresa;



    public Produto(Long id, String name, int valor) {
        this.id = id;
        this.name = name;
        this.valor = valor;
    }

    public Produto(String name, int valor) {
        this.name = name;
        this.valor = valor;
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}

