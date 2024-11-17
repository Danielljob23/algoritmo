package functionality;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<RedeSocial> redesSociais; // Usamos ArrayList para facilitar o entendimento

    // Construtor com nome, email e uma lista de redes sociais
    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.redesSociais = new ArrayList<>();
    }

    // Método para adicionar uma rede social
    public void adicionarRedeSocial(RedeSocial redeSocial) {
        redesSociais.add(redeSocial);
    }

    // Método para exibir as redes sociais e executar ações
    public void usarRedesSociais() {
        for (RedeSocial rede : redesSociais) {
            System.out.println("\nUsando a rede social: " + rede.getClass().getSimpleName());
            rede.postarFoto();
            rede.postarVideo();
            rede.postarComentario();
        }
    }
}
