import functionality.*;

public class Main {
    public static void main(String[] args) {
        // Criando redes sociais
        Facebook facebook = new Facebook("1234", 100);
        Twitter twitter = new Twitter("abcd", 50);

        // Criando o usuário
        Usuario usuario = new Usuario("João", "joao@email.com");

        // Adicionando redes sociais ao usuário
        usuario.adicionarRedeSocial(facebook);
        usuario.adicionarRedeSocial(twitter);

        // Usando as redes sociais
        usuario.usarRedesSociais();
    }
}
