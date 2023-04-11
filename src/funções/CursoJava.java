package funções;

import java.util.ArrayList;

public class CursoJava {
    public static void main(String[] args) {


        ArrayList<Integer> valores = new ArrayList<>();
        ArrayList<Integer> dobro = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

         valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.add(4);
        valores.add(5);
        valores.add(6);

         //As funções lambda e uma função sem declaração isto e, não e necessario
        //adicionar um nome um tipo um retorno e um modificador de acesso rapido
        //A ideia e que o metodo seja usado no mesmo lugar em que foi declarado
        valores.forEach((v)->{dobro.add(v*2);});


        System.out.println(valores);
        System.out.println(dobro);
        System.out.println(par);
        System.out.println(impar);

    }

}
