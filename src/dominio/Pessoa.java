package dominio;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double[] pesos;
    private double altura;
    private String nacionalidade;

    public void imprime() {
        System.out.println("===== DADOS DA PESSOA =====");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Sexo: " + sexo);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Nacionalidade: " + nacionalidade);

        System.out.println("============================");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPesos(double[] pesos) {
        this.pesos = pesos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double[] getPesos() {
        return pesos;
    }

    public double getAltura() {
        return altura;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void verificarMaioridade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");

        } else {
            System.out.println("Menor de idade");
        }
    }

    public double calcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }

    public void classificarImc() {
        double imc = calcularImc();

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }

    public void mostrarHistoricoPesos() {
        for (double peso : pesos) {
            System.out.println("Peso: " + peso + " kg");

        }
    }

    public double calcularMediaPesos() {
        double soma = 0;

        for (double peso : pesos) {
            soma += peso;
        }

        return soma / pesos.length;
    }

    public double encontrarMaiorPeso() {
        double maior = pesos[0];
        for (double num : pesos) {
            if (num > maior) {
                maior = num;
            }
        }
        return maior;
    }
}

