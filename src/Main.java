public class Main {
    public static void main(String[] args) {
        Cliente renan = new Cliente();
        renan.setNome("Renan");
        renan.setSobrenome("Mendes");
        Conta cc = new ContaCorrente(renan);
        Conta cp = new ContaPoupanca(renan);

        cc.depositar(100);
        cc.transferir(30, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
