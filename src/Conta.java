public abstract class  Conta implements Iconta{

    protected int agencia;
    protected int numero;
    protected double saldo;
    private static int agencia_padrao = 1;
    private static int sequencial = 1;
    private Cliente cliente;

    
    public Conta(Cliente cliente){

        this.agencia = agencia_padrao;
        this.numero = sequencial++;
        this.cliente = cliente;
        
    }
    

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome() + " " + this.cliente.getSobrenome()));
         System.out.println(String.format("Agencia: %d", this.agencia));
         System.out.println(String.format("Numero: %d", this.numero));
         System.out.println(String.format("Saldo: %.2f", this.saldo));

    }
}
