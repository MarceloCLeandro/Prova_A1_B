# Prova_A1_B
 Prova Regimental Ciência da Computação P.O.O.
 
 
<h1>Prova B</h1> <h2>Prova Regimental - POO - 5,0 pontos
Período noturno - Prof. Dr. Cleber</h2>

Um projeto Java está sendo elaborado com o NetBeans, para gerenciar os dados de funcionários de uma rede varejista. Neste momento, a empresa deseja criar um programa para manipular os dados de seus gerentes. Assim, utilize como base o projeto fornecido ProvaB para completar sua solução. Neste projeto já foram criadas as classes Trabalhador, Gerente e Geral.

1.	Crie os atributos da classe Trabalhador. Um trabalhador possui como atributos, nome, idade, registro e salário. Implemente um único método construtor sem parâmetros. Implemente os métodos get e set para manipulação dos atributos desta classe. 

2.	Crie os atributos da classe Gerente. Um Gerente possui os atributos: Departamento que gerencia, bonificação anual  e Região a qual gerencia (zona sul, zona norte, zona sul e zona leste). Implemente um único método construtor com parâmetros suficientes para criar objetos. Implemente os métodos get e set para manipulação dos atributos desta classe. Implemente um método para retornar, em forma de String, todos os dados de um Gerente. A classe Gerente deve herdar todos os atributos e métodos da classe Trabalhador.

3.	Na classe Gerente, crie o método calcularBonificacao(). Este método deve calcular a bonificação anual de um gerente, bônus de 15% sobre o salário. Este método deve também, apresentar o nome do gerente, e a sua bonificação.  
	
4.	Além da bonificação, cada gerente possui um aumento de salário anual diferenciado, que leva em conta a região em que trabalha. Crie o método calcularAumento() que deve imprimir na tela, a região em que o gerente trabalha, o valor do aumento e o novo salário. Para calcular o aumento, considere a seguinte tabela;

<table>
      <tr>
        <td>Zonas</td>
        <td>Zona Sul</td>
        <td>Zona Norte</td>
        <td>Zona Leste</td>
        <td>Zona Oeste</td>
     </tr>
       <tr>
        <td>Porcentagem de Aumento</td>
        <td>10 %</td>
        <td>10,05 %</td>
        <td>10,85%</td>
        <td>9,96%</td>
     </tr>
 </table>

5.	Ainda na classe Gerente, crie um método que determine qual gerente possui um salário maior que R$ 4.000,00 e mostre todos os seus dados. 

6.	Na classe geral. Instancie 3 objetos do tipo Gerente. Entre com todos os dados necessários. Chame todos os métodos criados para cada um dos 3 objetos. 

Observações obrigatórias

•	Compacte o projeto NetBeans completo com sua resposta dentro em um arquivo .zip, chamando com seu nome e depois seu RGM, por exemplo: Eduardo123456.zip, Renata234567.zip etc., para que o professor identifique o aluno autor desse programa.

Pontuação

1.	0,75 pontos
2.	0,75 pontos
3.	1 ponto
4.	1 ponto
5.	1 ponto
6.	0,5 ponto

Total: 5,0 pontos
