/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provab;

/**
 *
 * @author mcl_l
 */
public class Trabalhador {

    private String nome;
    private int idade;
    private float registro, salario;

    public Trabalhador() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getRegistro() {
        return registro;
    }

    public void setRegistro(float registro) {
        this.registro = registro;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
