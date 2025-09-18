//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Denilson", 90.5, 1.87);

    Pessoa atleta = new Atleta("Rebeca", 46, 1.55, "Ginastica");

    System.out.println(pessoa.getNome() + " - IMC: " + pessoa.IMC());
    System.out.println(atleta.getNome() + " (Atleta de " + ((Atleta) atleta).getEsportePraticado() + ") - IMC ajustado: " + atleta.IMC());
        }
    }
