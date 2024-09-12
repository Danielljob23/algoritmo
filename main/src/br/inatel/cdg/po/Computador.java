package br.inatel.cdg.po;

public class Computador {
    String marca;
    float preco;
    HardwareBasico hardware;
    SistemaOperacional sistema;
    MemoriaUSB memoria;

    public Computador(HardwareBasico hardware, SistemaOperacional sistema) {

        this.hardware = hardware;
        this.sistema = sistema;
        this.memoria = null; // Inicialmente, não há memória USB
    }

    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Hardware: " + hardware.nome + " - " + hardware.capacidade + " GHz");
        System.out.println("Sistema Operacional: " + sistema.nome + " - " + sistema.tipo);
        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.nome + " - " + memoria.capacidade + " GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }
}
