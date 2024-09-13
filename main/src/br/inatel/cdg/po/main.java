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
        computador3.preco = 5678 + 9754;

        computador1.sistema.nome = "Linux Ubuntu";
        computador2.sistema.nome = "Windows 8";
        computador3.sistema.nome = "Windows 10";

        computador1.sistema.tipo = 32;
        computador2.sistema.tipo = 64;
        computador3.sistema.tipo = 64;

        //CRIANDO O HARDWARE E PASSANDO PRA POSICAO DO VETOR
        HardwareBasico h1 = new HardwareBasico();
        computador1.hardware[0] = h1;

        computador1.hardware[0].nome = "Pentium core i3";
        computador1.hardware[0].capacidade = 2200;

        //USANDO O ADD MEMORIA
        MemoriaUSB memoriaUSB1 = new MemoriaUSB();
        memoriaUSB1.nome = "Pen-drive";
        memoriaUSB1.capacidade =16;
        computador1.addMemoriaUSB(memoriaUSB1);

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
        do {
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
        }while (opcao != 0);

        // Mostrar compras do cliente
        cliente.mostraCompras();
        cliente.calculaTotalCompras();
        scanner.close();
    }
}