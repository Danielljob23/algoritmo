package br.inatel.cdg.po;

public class Computador {
    String marca;
    float preco;
    HardwareBasico[] hardware;
    SistemaOperacional sistema;
    MemoriaUSB memoria;

    public void Computador() {

        hardware = new HardwareBasico[3];
        sistema = new SistemaOperacional();

    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Hardware: " + hardware[3].nome + " - " + hardware[3].capacidade + " GHz");
        System.out.println("Sistema Operacional: " + sistema.nome + " - " + sistema.tipo);
        if (memoria != null) {
            System.out.println("Memória USB: " + memoria.nome + " - " + memoria.capacidade + " GB");
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;

    }
}
