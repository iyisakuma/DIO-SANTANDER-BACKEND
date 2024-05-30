package br.iyisakuma;

import br.iyisakuma.excecoes.ParametrosInvalidosException;

import java.io.InputStream;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Contador {

    private Scanner sc;

    public Contador(){
        this.sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Contador contador = new Contador();
        int param1 = contador.getParam();
        int param2 = contador.getParam();
        try {
            contador.contar(param1, param2);
        }catch (ParametrosInvalidosException ex){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }finally {
            contador.finaliza();
        }
    }

    private void contar(int param1, int param2) {
        if(param1 > param2){
            throw new ParametrosInvalidosException();
        }
        int contagem = param2 - param1;
        int i = 1;
        while (i <= contagem){
            System.out.println("Imprimindo o número " + i);
            i++;
        }
    }

    public int getParam(){
        System.out.println("Digite parâmetro");
        return sc.nextInt();
    }

    public void finaliza(){
        sc.close();
    }
}
