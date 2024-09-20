public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome) {
        super(nome);
    }

    public Professor(){

    }

    public void calcularSalario() {
        //calcular o salario
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
