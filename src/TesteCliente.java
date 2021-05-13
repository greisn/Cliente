
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class TesteCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
       String opcao = "s";
       
         List<PessoaFisica> listaPessoaFisica = new ArrayList<>();
         List<PessoaJuridica> listaPessoaJuridica = new ArrayList<>();
         
         while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção: \n" + 
                    "1 - Adicionar Cliente Pessoa Fisica \n" + 
                    "2 - Adicionar Cliente Pessoa Juridica \n" +
                    "3 - Listar Cliente \n" + 
                    "4 - Remover Cliente Pessoa Fisica \n" + 
                    "5 - Remover Cliente Pessoa Juridica \n" + 
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);
            switch( opcao ){
                case "1":
                    PessoaFisica pf = new PessoaFisica();
                    
                    String nome = JOptionPane.showInputDialog("Cliente Pessoa Fisica ");
                    
                    pf.setNome(nome);
                    
                    
                    
                    String endereco = JOptionPane.showInputDialog("Endereço de " + nome);
                    endereco = endereco.replace(",", ".");
                    pf.setEndereco(endereco);
                    
                   
                    
                    String telefone = JOptionPane.showInputDialog("Telefone de " + nome );
                    telefone = telefone.replace(",", ".");
                    pf.setTelefone(telefone);
                   
                   
                    
                    String cpf = JOptionPane.showInputDialog("CPF de " + nome);
                   cpf = cpf.replace(",", ".");
                    pf.setCpf(cpf);
                                                            
                    
                    listaPessoaFisica.add( pf );
                    
                    break;
                    
                    case "2":
                    
                    PessoaJuridica pj = new PessoaJuridica();
                    String nomePJ = JOptionPane.showInputDialog("Cliente Pessoa Juridica ");
                    
                   
                    pj.setNome(nomePJ);
                    
                    
                    String enderecoPJ = JOptionPane.showInputDialog("Endereço de " + nomePJ);
                   
                    
                    pj.setEndereco(enderecoPJ);
                   
                    
                    String telefonePJ = JOptionPane.showInputDialog("Telefone de " + nomePJ );
                    
                    
                    pj.setTelefone(telefonePJ);
                    
                    
                    String cnpj = JOptionPane.showInputDialog("CNPJ de " + nomePJ);
                    cnpj = cnpj.replace(",", ".");
                    pj.setCnpj(cnpj);
                    
                    
                    listaPessoaJuridica.add( pj );
                    
                    break;
                
                case "3":
                   
                     String conteudo = "";
                    
                     for(PessoaFisica fisica : listaPessoaFisica){
                          conteudo += fisica.getInfo();
                     }
                            
                if(listaPessoaFisica instanceof PessoaFisica)
                    ((PessoaFisica) listaPessoaFisica).getInfo();
                    
                    
                else
                    
                    for(PessoaJuridica juridica : listaPessoaJuridica){
                          conteudo += juridica.getInfo();
                     }
                            
                if(listaPessoaJuridica instanceof PessoaJuridica)
                    ((PessoaJuridica) listaPessoaJuridica).getInfo();
                    
                    
                JOptionPane.showMessageDialog(null, conteudo);
                  
        
                  
                    break;
                    case "4":
                    int posicao = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    listaPessoaFisica.remove(posicao -1 );
                    JOptionPane.showMessageDialog(null, "Cliente removido da posição: " + posicao);
                    
                        
                    break;
                    
                     case "5":
                    int posicaoPJ = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    
                         listaPessoaJuridica.remove(posicaoPJ -1 );
                         JOptionPane.showMessageDialog(null, "Cliente removido da posição: " + posicaoPJ);
                    
                    
                     break;
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
                    
            }
        }
       
       
       
    }
         
    }
