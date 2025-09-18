public class Atleta extends Pessoa{
    private String esportePraticado;

    public Atleta(String nome, double peso, double altura, String esportePraticado) {
        super(nome, peso, altura);
        this.esportePraticado = esportePraticado;
    }


    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }

    @Override
    public double IMC() {
        double imcNormal = super.IMC();
        return Math.round((imcNormal * 0.95) * 100) / 100;
    }
}
