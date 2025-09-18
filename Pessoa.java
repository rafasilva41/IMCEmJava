public class Pessoa {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
            this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
            this.altura = altura;
    }

    public double IMC() {
        double imc = peso / (altura * altura);
        return Math.round(imc * 100) / 100;
    }
}


