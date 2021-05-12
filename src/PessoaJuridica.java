/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class PessoaJuridica extends Cliente {
    private Long cnpj;

    public PessoaJuridica() { }
    
    

    public PessoaJuridica(Long cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(Long cnpj, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
    }

    /**
     * @return the cnpj
     */
    public Long getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }
    
    /*@Override
    public void cadastrar(){
        
    }
    @Override
    public void imprimir(){
        System.out.println("Nome: " + getNome() + "\nCPF: " + this.getCnpj() + "\nEndereço: " + getEndereco() +
                            "\nTelefone: " + getTelefone()); 
    }*/
    @Override
    public  String getInfo(){
        System.out.println("---- Dados do Desktop ----");
       /*System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Preço: " + this.getPreco());
        System.out.println("Potência da Fonte: " + this.getPotenciaFte());*/
       return "{ 'nome': '" + nome 
               + "' , 'endereco': " + endereco 
               + " , 'telefone': " + telefone
               + "' , 'CPF': " + this.getCnpj() + " }";
       
    }
    @Override
    public  void cadastrar(){
        
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
