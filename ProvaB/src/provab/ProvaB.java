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
public class ProvaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Gerente objGerente = new Gerente("Gerente Geral", "Zona Sul", 0.0f);
        objGerente.setNome("Marcelo");
        objGerente.setIdade(40);
        objGerente.setRegistro(12125682);
        objGerente.setSalario(17000.0f);

        System.out.println("O Gerente " + objGerente.getNome()
                + " " + objGerente.getDepartamento()
                + " da " + objGerente.getRegiao()
                + " com o salário de " + objGerente.getSalario()
                + " teve um aumento de 10% pela sua região = " + objGerente.calcularAumento(17000, "Zona Sul")
                + " mais uma bonificação unal de 15% = " + objGerente.calcularBonificacao(17000) 
                + objGerente.salarioMaiorQue(17000));
        System.out.println("_______________________\n");

        Gerente objGerente2 = new Gerente("Gerente Alimentos e Bebidas ", "Zona Leste ", 0.0f);
        objGerente2.setNome("Thatyane");
        objGerente2.setIdade(39);
        objGerente2.setRegistro(1277485);
        objGerente2.setSalario(5000.0f);

        System.out.println("O Gerente " + objGerente2.getNome()
                + " " + objGerente2.getDepartamento()
                + " da " + objGerente2.getRegiao()
                + " com o salário de " + objGerente2.getSalario()
                + " teve um aumento de 10,85% pela sua região = " + objGerente2.calcularAumento(5000, "Zona Leste")
                + " mais uma bonificação unal de 15% = " + objGerente2.calcularBonificacao(5000)
                + objGerente2.salarioMaiorQue(5000));
        System.out.println("_______________________\n");

        Gerente objGerente3 = new Gerente("Gerente Gov", "Zona Oeste", 0.0f);
        objGerente3.setNome("Lucas");
        objGerente3.setIdade(34);
        objGerente3.setRegistro(1021745);
        objGerente3.setSalario(4000.0f);

        System.out.println("O Gerente " + objGerente3.getNome()
                + " " + objGerente3.getDepartamento()
                + " da " + objGerente3.getRegiao()
                + " com o salário de " + objGerente3.getSalario()
                + " teve um aumento de 9,96% pela sua região = " + objGerente3.calcularAumento(4000, "Zona Oeste")
                + " mais uma bonificação unal de 15% = " + objGerente3.calcularBonificacao(4000)
                + objGerente3.salarioMaiorQue(4000));
        System.out.println("_______________________\n");

        Gerente objGerente4 = new Gerente("Gerente Grupos", "Zona Norte", 0.0f);
        objGerente4.setNome("Karine");
        objGerente4.setIdade(29);
        objGerente4.setRegistro(10245631);
        objGerente4.setSalario(3000.0f);

        System.out.println("O Gerente " + objGerente4.getNome()
                + " " + objGerente4.getDepartamento()
                + " da " + objGerente4.getRegiao()
                + " com o salário de " + objGerente4.getSalario()
                + " teve um aumento de 10,05% pela sua região = " + objGerente4.calcularAumento(3000, "Zona Norte")
                + " mais uma bonificação unal de 15% = " + objGerente4.calcularBonificacao(3000)
                + objGerente4.salarioMaiorQue(3000));
        System.out.println("_______________________\n");
    }

}
