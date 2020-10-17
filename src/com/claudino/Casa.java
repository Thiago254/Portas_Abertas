package com.claudino;

public class Casa {
    public String cor;
    public int porta1 = 1;
    public int porta2 = 1;
    public int porta3 = 1;
    public int quantasPortasEstaoAbertas = porta1 + porta2 + porta3 ;

    public void pinta(String cor){
        if (this.cor == cor) {
            System.out.println("A cor da porta é");
        } else {
            this.cor = cor;
            System.out.println("A cor da porta é " + this.cor);
            System.out.println("-------------------------------");
        }
    }
    //Abre porta
    void abrePorta(){
        if (quantasPortasEstaoAbertas < 3){
            quantasPortasEstaoAbertas += 1;
        }
    }

    //Fecha porta
    void fechaPorta(){
        if (quantasPortasEstaoAbertas > 0){
            quantasPortasEstaoAbertas -= 1;
        }
    }


    //Conta portas abertas
    void PortasAbertas(){
        System.out.println(quantasPortasEstaoAbertas + " estão abertas!");
    }

}
