package Entidades;

public class Banco {
    public static void main(String[] args) {
        Loja sansung = new Loja("Sansung");
        Loja americanas = new Loja("Americanas");
        Funcionario matheus = new Funcionario("Matheus");
        sansung.adicionaFuncionarios(matheus);
        Funcionario raissa = new Funcionario("Raissa");
        sansung.adicionaFuncionarios(raissa);
        Funcionario arthur = new Funcionario("Arthur");
        americanas.adicionaFuncionarios(arthur);
        Funcionario caio = new Funcionario("Caio");
        americanas.adicionaFuncionarios(caio);
        int numClientes = 10;
        double saldoInicialClientes = 2000;
        Cliente[] clientes = new Cliente[numClientes];

        for (int i = 0; i < sansung.getFuncionarios().size(); i++) {
            sansung.getFuncionario(i).start();
        }

        for (int i = 0; i < americanas.getFuncionarios().size(); i++) {
            americanas.getFuncionario(i).start();
        }

        for (int i = 0; i < numClientes; i++) {
            clientes[i] = new Cliente(saldoInicialClientes, i + 1);
            clientes[i].start();
        }

        try {
            for (Cliente cliente : clientes) {
                cliente.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sansung.setMovimentacao(sansung.getNome() + ":\nSaldo inicial: R$ " + sansung.lerSaldo() + "\n");
        americanas.setMovimentacao(americanas.getNome() + ":\nSaldo inicial: R$ " + americanas.lerSaldo() + "\n");

        for (int i = 0; i < numClientes; i++) {
            Cliente cliente = clientes[i];
            System.out.println(cliente.getName() + ":");
            System.out.println("Saldo inicial: R$ " + saldoInicialClientes);

            for (int j = 0; j < cliente.getTansferencias().length; j++) {
                double valorTransferencia = cliente.getTansferencia(j);
                if (j < cliente.getTansferencias().length / 2) {
                    sansung.receberTransferencia(valorTransferencia);
                    sansung.setMovimentacao(sansung.getNome() + " recebeu R$ " + valorTransferencia + " de " + cliente.getName() + "\n");
                    if (sansung.lerSaldo() >= 1400 * sansung.getFuncionarios().size()) {
                        for (Funcionario funcionario : sansung.getFuncionarios()) {
                            sansung.setMovimentacao(sansung.getNome() + " transferiu R$ " + sansung.getValorSalario() + " para o(a) funcionário(a) " + funcionario.getName() + "\n");
                            sansung.pagarFuncionarios();
                            funcionario.receberSalario(sansung.getValorSalario());
                        }
                    }
                    System.out.println("Transferiu R$ " + valorTransferencia + " para " + sansung.getNome());
                } else {
                    americanas.receberTransferencia(valorTransferencia);
                    americanas.setMovimentacao(americanas.getNome() + " recebeu R$ " + valorTransferencia + " de " + cliente.getName() + "\n");
                    if (americanas.lerSaldo() >= 1400 * americanas.getFuncionarios().size()) {
                        for (Funcionario funcionario : americanas.getFuncionarios()) {
                            americanas.setMovimentacao(americanas.getNome() + " transferiu R$ " + americanas.getValorSalario() + " para o(a) funcionário(a) " + funcionario.getName() + "\n");
                            americanas.pagarFuncionarios();
                            funcionario.receberSalario(americanas.getValorSalario());
                        }
                    }
                    System.out.println("Transferiu R$ " + valorTransferencia + " para " + americanas.getNome());
                }
            }
            System.out.println("Saldo final: R$ " + cliente.lerSaldo() + "\n");
        }

        try {
            for (Funcionario funcionario : sansung.getFuncionarios()) {
                funcionario.join();
            }
            for (Funcionario funcionario : americanas.getFuncionarios()) {
                funcionario.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sansung.setMovimentacao("Saldo final: R$ " + sansung.lerSaldo() + "\n\n");
        americanas.setMovimentacao("Saldo final: R$ " + americanas.lerSaldo() + "\n\n");

        System.out.print(sansung.getMovimentacao());
        System.out.print(americanas.getMovimentacao());
        System.out.println(matheus.getMovimentacoes() + "\n");
        System.out.println(raissa.getMovimentacoes() + "\n");
        System.out.println(arthur.getMovimentacoes() + "\n");
        System.out.println(caio.getMovimentacoes());

        
    }
}
