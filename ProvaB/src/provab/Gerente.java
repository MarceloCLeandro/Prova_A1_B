/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provab;

/**
 *
 * @author cleber
 */
public class Gerente extends Trabalhador {

    private String departamento, regiao[];
    private float bonificacao;

    public Gerente(String departamento, String[] regiao, float bonificacao) {
        this.departamento = departamento;
        this.regiao = regiao;
        this.bonificacao = bonificacao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String[] getRegiao() {
        return regiao;
    }

    public void setRegiao(String[] regiao) {
        this.regiao = regiao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "Departamento Gerenciado = " + departamento
                + ", Região Gerenciada = " + regiao
                + ", Bonificação Anual de = " + bonificacao;
    }

    double calcularBonificacao(float salario, float bonificacao) {
        float valorBonificacao;
        bonificacao = (float) (15.0 / 100);
        valorBonificacao = salario + (salario * bonificacao);
        return valorBonificacao;
    }

    public void calcularAumento(float salario, String regiao) {
        float aumento = 0.0f;
        if (regiao.equalsIgnoreCase("Zona Sul")) {
            aumento = salario + (salario * 0.10f);// calcular 10%
        } else {
            if (regiao.equalsIgnoreCase("C")) {
                aumento = salario + (salario * 0.1005f);// calcular 10,05%
            } else {
                if (regiao.equalsIgnoreCase("VB")) {
                    aumento = salario + (salario * 0.1085f);// calcular 10,85%
                } else {
                    if (regiao.equalsIgnoreCase("Go")) {
                        aumento = salario + (salario * 0.0996f);// calcular 9,96%
                    }
                }
            }

        }

    }
}
