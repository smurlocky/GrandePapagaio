import java.util.List;

// Ainda existe comportamento estranho pq ainda nao dominei o uso do map no java, usei o que sabia do .map em javascript para aplicar aqui

public class App {
    public static void main(String[] args) {
        Mural mural = new Mural();
        User user = new User("Marcos");
        User user2 = new User("Sarah");
        User user3 = new User("Enrir");

        mural.addUser(user);
        mural.addUser(user2);
        mural.addUser(user3);

        mural.seguirUsuario(user, user2);
        mural.seguirUsuario(user, user3);
        mural.postarMensagem(user, "EUREKA");
        mural.postarMensagem(user2, "Java é legal");
        mural.postarMensagem(user3, "Aprendendo Java");

        System.out.println("Usuários no mural:");
        for (User u : mural.getUsers()) {
            System.out.println(u.getName());
        }

        List<String> seguidos = mural.getSeguidos(user);
        List<String> tweets = mural.getTweets(user);

        if (seguidos != null && !seguidos.isEmpty()) {
            System.out.println("Seguidos de " + user.getName() + ":");
            for (String s : seguidos) {
                System.out.println(s);
            }
        } else {
            System.out.println(user.getName() + " não segue nenhum usuário.");
        }

        if (tweets != null && !tweets.isEmpty()) {
            System.out.println("Tweets de " + user.getName() + ":");
            for (String t : tweets) {
                System.out.println(t);
            }
        } else {
            System.out.println(user.getName() + " não tem tweets.");
        }
    }
}
