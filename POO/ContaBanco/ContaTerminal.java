package ContaBanco;

public class ContaTerminal {
    public int numConta;
    protected double saldo;
    private String tipo, dono;
    private boolean status;

    public ContaTerminal() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC")
            this.setSaldo(50);
        else if(t == "CP")
            this.setSaldo(150);
        System.out.println("Conta aberta com sucesso!!");
    }
    public void fecharConta(){
        if(getSaldo() < 0)
            System.out.println("Há débito pendente, corrija e tente novamente!");
        else if(getSaldo() > 0)
            System.out.println("Há dinheiro na conta, retire e tente novamente!");
        else if(getStatus()){
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
    }
        else System.out.println("A conta ja está fechada!");
    }
    public void depositar(double valor){
        if(getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Depósito de %.2f na conta de %s foi realizado com sucesso! Novo saldo: %.2f\n", valor, getDono(), getSaldo());
        }
        else
            System.out.println("Impossível realizar essa operação pois a conta está fechada!");
    }
    public void sacar(double valor){
        if(getStatus()){
            if(getSaldo() >= valor){
                System.out.printf("Seu saldo atual é de: %.2f,\nDigite o valor de saque: %.2f\n", getSaldo(), valor);
                this.setSaldo(this.getSaldo() - valor);
                System.out.printf("Saque de %.2f na conta de %s foi realizado com sucesso!\n", valor, getDono());
            }
            else
                System.out.println("Saldo insuficiente, digite outro valor!");
        }
        else
            System.out.println("Impossível realizar essa operação pois a conta está fechada!");
    }
    public void pagarMensal(double valor){
        if(this.getStatus()){
            if(this.getTipo() == "CC") {
                valor = 12;
                if(this.getSaldo() > valor){
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Mensalidade paga com sucesso!");
            }   else
                    System.out.println("Saldo insuficiente!");
            }
            else if(this.getTipo() == "CP"){
                valor = 20;
                if(this.getSaldo() > valor){
                    this.setSaldo(this.getSaldo() - valor);
                    System.out.println("Mensalidade paga com sucesso!");
            }}
            else
                System.out.println("Opção inválida, tente novamente!");
        }
        else
            System.out.println("Impossível realizar essa operação pois a conta está fechada!");
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean getStatus() {
        return status;
    }


    public void setStatus(boolean status) {
        this.status = status;
    }
}
