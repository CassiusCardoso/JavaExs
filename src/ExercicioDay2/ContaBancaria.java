package ExercicioDay2;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
            this.saldo = saldo;
        }

        // Getter
        public double getSaldo() {
            return this.saldo;
        }
        // Setter
        public void setSaldo(double saldo){
            this.saldo = saldo;
        }

    public void depositar(double valor){
        if (valor < 0){
            System.out.println("Valor insuficiente");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Valor insuficiente");
        } else {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso");
        }

    }

    public void mostrarSaldo(){
        System.out.println(this.saldo);
    }
}

