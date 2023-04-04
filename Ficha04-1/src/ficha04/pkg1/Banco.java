
package ficha04.pkg1;

import java.util.ArrayList;

public class Banco implements Imprimir {

    public Banco() {
    }
   
     ContaCorrente ccc = new ContaCorrente();
     ContaPoupanca ppp = new ContaPoupanca();
      
        ArrayList<ContaCorrente> lista = new ArrayList(); 

    @Override
    public void mostrarDados() {
        for(int t = 0; t <= lista.size(); t++){
            System.out.println("Conta: "+ccc.getNumConta());
        }
            System.out.println("Removido no indice "+lista.remove(ccc));
            System.out.println(lista.size());  
    }
          
    public void inserir(int escolha) {       
        ccc.setNumConta(escolha);
         lista.add(ccc);
    }
  
    public void remover(int escolha) {
       if(lista.add(ccc)){
        lista.remove(escolha);
           System.out.println("Conta removida com com sucesso!");
        }else{
           System.out.println("Nao existe conta por remover");
       }
    }

    public void procurarConta(int numCont) {
        for(int x = 0; x <= lista.size(); x++){
            if(lista.equals(numCont)){
                System.out.println(lista.size());  
            } else{
                System.out.println("Null");
            }    
        }
    }    
    public void Depositar(int depositar){   
        ccc.depositar(depositar + ccc.getSaldo());
        lista.add(ccc);
    }
    
    public void sacar(int saque){
        ccc.sacar(ccc.getSaldo() - saque);
        lista.add(ccc);
    }
    
    public void tranferir(int transferencia, int transf){
        if(ccc.getNumConta() == transferencia){
           ccc.setSaldo(ccc.getSaldo() + transf);
        }else{
            System.out.println("Conta inexistente!");
        }   
    }

    public ContaCorrente getCc() {
        return ccc;
    }

    public void setCc(ContaCorrente cc) {
        this.ccc = cc;
    }

    public ArrayList<ContaCorrente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<ContaCorrente> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Banco{" + "cc=" + ccc + ", lista=" + lista + '}';
    }
}
