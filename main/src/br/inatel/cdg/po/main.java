package br.inatel.cdg.po;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.nome = "PC Mania";


        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        computador1.marca = "Positivo";
        computador2.marca = "Acer";
        computador3.marca = "Vaio";

        computador1.preco = 9754;
        computador2.preco = 1234 +9754;
        computador3.preco = 5678+9754;

        /*SistemaOperacional sistemaOperacional1 = new SistemaOperacional();
        SistemaOperacional sistemaOperacional2 = new SistemaOperacional();
        SistemaOperacional sistemaOperacional3 = new SistemaOperacional();

        sistemaOperacional1.nome = "Linux Ubuntu";
        sistemaOperacional2.nome = "Windows 8";
        sistemaOperacional3.nome = "Windows 10";

        sistemaOperacional1.tipo = 32;
        sistemaOperacional2.tipo = 64;

        sistemaOperacional3.tipo = 64;
*/
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        MemoriaUSB memoriaUSB2 = new MemoriaUSB();
        MemoriaUSB memoriaUSB3 = new MemoriaUSB();

        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB2.nome = "Pen-drive";
        memoriaUSB3.nome = "HD externo";

        memoriaUSB1.capacidade =16;
        memoriaUSB2.capacidade = 32;
        memoriaUSB3.capacidade = 1000;
/*
        HardwareBasico hardwareBasico1 = new HardwareBasico();
        HardwareBasico hardwareBasico2 = new HardwareBasico();
        HardwareBasico hardwareBasico3 = new HardwareBasico();

        hardwareBasico1.nome = "Pentium core i3";
        hardwareBasico2.nome = "Pentium core i5";
        hardwareBasico3.nome = "Pentium core i7";

        hardwareBasico1.capacidade = 2200;
        hardwareBasico2.capacidade = 3370;
        hardwareBasico3.capacidade = 4500;
*/
        while (opcao != 0) {
            System.out.println("Escolha a promoção que deseja comprar (1, 2, 3) ou 0 para sair:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cliente.addcomputadores(computador1);
                    break;
                case 2:
                    cliente.addcomputadores(computador2);
                    break;
                case 3:
                    cliente.addcomputadores(computador3);
                    break;
                case 0:
                    System.out.println("Finalizando compras.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        // Mostrar compras do cliente
        cliente.mostraCompras();
        cliente.calculaTotalCompras();
        scanner.close();
    }
}