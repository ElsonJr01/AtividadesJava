package Celulares;

import java.util.Scanner;

class Celularr{
            String marca;
            String modelo;
            int nivelBateria;

            void carregarBateria(int carga){
                nivelBateria = carga;
                for(int i = 0; i < 100; i++){
                    System.out.println(carga+i + "% Carregando...");
                }
            }
             void exibirInformaçoes(){
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
            }
        }
public class Celular {
    public static void main(String[] args) {
        Celularr celular1 = new Celularr();
        celular1.marca = "Nokia";
        celular1.modelo = "Tijolão";
        celular1.carregarBateria(0);
        celular1.exibirInformaçoes();

    }
}