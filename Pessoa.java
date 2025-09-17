import java.sql.SQLOutput;

public class Pessoa {
    private String nome;
    double imc = peso / (altura * altura);

    public Pessoa(Atleta atleta) {
        this.atleta = atleta;
    }

    System.out.print("Digite seu nome: ");
    private String nome = scanner.nextString();

    System.out.print("Digite seu peso em kg: ");
    private double peso = scanner.nextDouble();

    System.out.print("Digite a sua altura em metros: ");
    private double altura = scanner.nextDouble();

    System.out.printf("Resultado do IMC: \n" + imc);

    if (imc < 18.5) {
        System.out.println("Portanto, voce esta classificado como abaixo do peso.");
    } else if (imc < 25){
        System.out.println("Portanto, voce esta classificado como peso normal.");
    } else if (imc < 30){
        System.out.println("Portanto, voce esta classificado como sobrepeso.");
    } else if (imc < 35){
        System.out.println("Portanto, voce esta classificado como obesidade grau I.");
    } else (imc < 40){
        System.out.println("Portanto, voce esta classificado como obesidade grau II.");
    } else {
        System.out.println("Portanto, voce esta classificado como obesidade grau III (morbida).");
    }

    scanner.close();
  }
