package ficha04.pkg1;

import java.util.Scanner;

public class Executavel01 {
    
    public static void main(String[]args){
        
    Banco bc1 = new Banco();
    
    while(1==1 && 1!=0){ 
         Scanner x = new Scanner (System.in);
    
                    System.out.println("-----Menu-----");
                    System.out.println("1.contaPoupanca");
                    System.out.println("2.ContaCorrente");
                    System.out.println("3.Levantar e Depositar");
                    
    int escolha = x.nextInt();
    
    switch (escolha){
        case 1:   
            System.out.println("");
            System.out.println("1.Criar conta");
            System.out.println("3.Selecionar");
            System.out.println("3.Remover");
            System.out.println("4.Gerar Relatorio");
        int escolha1 = x.nextInt();
                                                   
            switch(escolha1){
                case 1:
                    System.out.println("");
                      System.out.println("Criando conta");
                      System.out.println("Insira o numero da Conta");
                      int esco= x.nextInt();
                      bc1.inserir(esco);break;
                case 2: 
                    System.out.println("");
                      System.out.println("Selecionar conta");
                      int escol = x.nextInt();
                      bc1.procurarConta(escol);break;        
                case 3:
                    System.out.println("");
                      System.out.println("Remover conta");
                      int escolh = x.nextInt();
                      bc1.remover(escolh);break;                 
                case 4:
                      bc1.mostrarDados();break;
        } break;
        
    case 2:     
            System.out.println("");
            System.out.println("1.Criar conta");
            System.out.println("3.Selecionar");
            System.out.println("3.Remover");
            System.out.println("4.Gerar Relatorio");
        int escolha2 = x.nextInt();
                                                   
            switch(escolha2){
                case 1:
                    System.out.println("");
                      System.out.println("Criando conta");
                      System.out.println("Insira o numero da Conta");
                      int esco= x.nextInt();
                      bc1.inserir(esco);break;
                case 2: 
                    System.out.println("");
                      System.out.println("Selecionar conta");
                      int escol = x.nextInt();
                      bc1.procurarConta(escol);break;        
                case 3:
                    System.out.println("");
                      System.out.println("Remover conta");
                      int escolh = x.nextInt();
                      bc1.remover(escolh);break;                 
                case 4:
                      bc1.mostrarDados();break;
        } break;
        
    case 3:
        System.out.println("");
           System.out.println("1.Depositar");
             System.out.println("2.Sacar");
               System.out.println("3.Transferir");
                 System.out.println("4.Gerar Relatorio");
                
                 int choice= x.nextInt();
                 switch(choice){
                     case 1:
                           System.out.println("---Deposito---");
                           System.out.println("O valor da transferencia");
                           int choic = x.nextInt();
                           bc1.Depositar(choic);break;
                           
                     case 2:
                        
                         
                     
                }
            }  
        }
    }  
}