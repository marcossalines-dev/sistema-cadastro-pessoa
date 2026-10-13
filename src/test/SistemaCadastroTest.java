package test;

import dominio.Pessoa;

public class SistemaCadastroTest {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();

            pessoa.setNome("Marcos");
            pessoa.setIdade(16);
            pessoa.setSexo('M');
            pessoa.setPeso(73.5);
            pessoa.setAltura(1.80);
            pessoa.setNacionalidade("Brasil");
            pessoa.setPesos(new double[]{70.0, 71.5, 72.8, 73.5});

            pessoa.imprime();
            pessoa.verificarMaioridade();

            System.out.println("IMC: " + pessoa.calcularImc());

            pessoa.classificarImc();
            pessoa.mostrarHistoricoPesos();

            System.out.println("Média dos pesos: " + pessoa.calcularMediaPesos() + " kg");

            System.out.println("Maior peso: " + pessoa.encontrarMaiorPeso() + " kg");
        }
    }

