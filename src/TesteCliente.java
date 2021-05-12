
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
       
         List<Cliente> listaCliente = new ArrayList<>();
         //List<Notebook> listaNotebook = new ArrayList<>();
         
         while( ! opcao.equalsIgnoreCase( "n" )){
            String texto = "Digite sua opção: \n" + 
                    "1 - Adicionar Cliente \n" + 
                    "2 - Remover Cliente \n" + 
                    "3 - Listar Cliente \n" + 
                    "n - Sair ";
            opcao =  JOptionPane.showInputDialog(texto);
            switch( opcao ){
                case "1":
                    PessoaFisica pf = new PessoaFisica();
                    PessoaJuridica pj = new PessoaJuridica();
                    String nome = JOptionPane.showInputDialog("Cliente ");
                     //if(listaCliente[i] instanceof PessoaFisica)
                    pf.setNome(nome);
                    pj.setNome(nome);
                    
                    
                    String endereco = JOptionPane.showInputDialog("Endereço de " + nome);
                    endereco = endereco.replace(",", ".");
                    pf.setEndereco(endereco);
                    pj.setEndereco(endereco);
                    //d.setPreco( Double.valueOf( preco ) );
                    
                    String telefone = JOptionPane.showInputDialog("Telefone de " + nome );
                    telefone = telefone.replace(",", ".");
                    pf.setTelefone(0);
                    pf.setTelefone(0);
                    //p.setQuantidade(Double.valueOf( qtd ) );
                    
                    String cpf = JOptionPane.showInputDialog("CPF de " + nome);
                   cpf = cpf.replace(",", ".");
                    pf.setCpf(Long.MIN_VALUE);
                    
                    String cnpj = JOptionPane.showInputDialog("CNPJ de " + nome);
                    cnpj = cnpj.replace(",", ".");
                    pj.setCnpj(Long.MIN_VALUE);
                    
                    
                    listaCliente.add( pf );
                    listaCliente.add( pj );
                    break;
                case "2":
                    int posicao = Integer.valueOf(  JOptionPane.showInputDialog("Informe a posição que deseja remover:")  );
                    listaCliente.remove(posicao -1 );
                    break;
                case "3":
                    String conteudo = "";
                    for (Cliente cliente : listaCliente) {
                        conteudo += cliente.getInfo() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, conteudo);
                  
                    break;
                case "n":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção incorreta");
                    
            }
        }
       
       
       
       
       
    }
         
    }
