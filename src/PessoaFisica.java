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
    private Long cpf;

    public PessoaFisica(Long cpf) {
        this.cpf = cpf;
    }

    public PessoaFisica(Long cpf, String nome, String endereco, int telefone) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    /**
     * @return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public void cadastrar(){
        
    }
    @Override
    public void imprimir(){
       System.out.println("Nome: " + getNome() + "\nCPF: " + this.getCpf() + "\nEndereço: " + getEndereco() +
                            "\nTelefone: " + getTelefone()); 
    }
    
}
