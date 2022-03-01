package com.company;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        boolean continueLooping = true;
        do {

            String a = JOptionPane.showInputDialog("Numerador: ");
            String b = JOptionPane.showInputDialog("Denominador: ");
            try{
                int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                System.out.println("Resultado: " + resultado);
                continueLooping = false;
            }catch (NumberFormatException e){
                JOptionPane.showInputDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());
                e.printStackTrace();
            } catch (ArithmeticException e){
                JOptionPane.showInputDialog(null, "Entrada inválida, não possível dividir um número por 0! ");
                e.printStackTrace();
            } finally {
                System.out.println("Chegou no fimally");
            }
        }while (continueLooping);
        System.out.println("O código continua!!!");
    }

    public  static int dividir(int a, int b){return a / b;}
}


