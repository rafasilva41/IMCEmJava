import java.util.Scanner;

public class Atleta extends Pessoa {
    private String esportePraticado;
    scanner.nextline();



    System.out.print("Voce eh um atleta com nivel de atividade alto? (sim/nao): ")
            System.out.print("Voce eh um atleta com nivel de atividade alto? (sim/nao): ")
    String resposta = scanner.nextline().trim().toLowerCase();

    System.out.print("Qual esporte voce pratica?");
    private String esportePraticado = scanner.nextString();

    if (resposta.equals("sim") || resposta.equals("s")) {
        imc *= 0.95;
        System.out.println("Aplicando ajuste de 5% para atleta de alta atividade.");
    }

    public String getEsportePraticado() {
        return esportePraticado;
    }

    public void setEsportePraticado(String esportePraticado) {
        this.esportePraticado = esportePraticado;
    }
}

