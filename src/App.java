import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Mural mural = new Mural();
        User user = new User("Marcos");
        User user2 = new User("Sarah");
        User user3 = new User("Enrir");

        mural.addUser(user);
        mural.addUser(user2);
        mural.addUser(user3);

        user.addSeguido("Sarah");
        user.addSeguido("Enrir");
        user.addTweet("java é legal");

        System.out.println("Usuários no mural:");
        for (User u : mural.getUsers()) {
            System.out.println(u.getName());
        }

        List<String> seguidos = mural.getSeguidos(user);
        List<String> tweets = mural.getTweets(user);

        if (seguidos != null) {
            System.out.println("Seguidos:");
            for (String s : seguidos) {
                System.out.println(s);
            }
        } else {
            System.out.println("Não tem seguidos");
        }

        if (tweets != null) {
            System.out.println("Tweets:");
            for (String t : tweets) {
                System.out.println(t);
            }
        } else {
            System.out.println("Não tem tweets");
        }

    }
}
