/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PessoaFisica extends Cliente {
    private String cpf;

    public PessoaFisica() { }
    
    

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    /*@Override
    public void cadastrar(){
        
    }
    @Override
    public void imprimir(){
       System.out.println("Nome: " + getNome() + "\nCPF: " + this.getCpf() + "\nEndereço: " + getEndereco() +
                            "\nTelefone: " + getTelefone()); 
    }*/
    
    @Override
    public  String getInfo(){
        System.out.println("---- Dados do Desktop ----");
       /*System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Potência da Fonte: " + this.getPotenciaFte());*/
       return "{ 'Nome': '" + nome 
               + "' , 'Endereco': " + endereco 
               + " , 'Telefone': " + telefone
               + "' , 'CPF': " + this.getCpf() + " } \n";
       
    }
    @Override
    public  void cadastrar(){
        PessoaFisica pf = new PessoaFisica();
        pf.setCpf(cpf);
    }
    @Override
     public void excluir() {
        this.zerarCadastro();
        System.out.println("Nome Pessoa Física "+ nome + " excluído");
    }

    @Override
    protected void zerarCadastro() {
        this.setQuantidade( 0.0 );
    }
 
    
}
