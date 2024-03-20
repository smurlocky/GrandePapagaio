import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mural {
  private List<User> users;
  private Map<User, List<String>> postsPorUsuario;
  private Map<User, List<User>> seguidoresPorUsuario;

  public Mural() {
    users = new ArrayList<>();
    postsPorUsuario = new HashMap<>();
    seguidoresPorUsuario = new HashMap<>();
  }

  public void addUser(User user) {
    users.add(user);
  }

  public List<User> getUsers() {
    return users;
  }

  public User getUser(int index) {
    return users.get(index);
  }

  public void removeUser(User user) {
    users.remove(user);
  }

  public void removeUser(String name) {
    users.removeIf(user -> user.getName().equals(name));
  }

  public void removeUser(int index) {
    users.remove(index);
  }

  public List<String> getSeguidos(User user) {
    return seguidoresPorUsuario.get(user).stream().map(User::getName).toList();
  }

  public List<String> getTweets(User user) {
    List<String> allTweets = new ArrayList<>();
    List<User> seguidos = seguidoresPorUsuario.getOrDefault(user, new ArrayList<>());
    for (User seguido : seguidos) {
      List<String> tweetsSeguido = postsPorUsuario.getOrDefault(seguido, new ArrayList<>());
      allTweets.addAll(tweetsSeguido);
    }
    return allTweets;
  }

  public void seguirUsuario(User seguidor, User seguido) {
    // Adicionar seguido à lista de seguidos do seguidor
    List<User> seguidos = seguidoresPorUsuario.getOrDefault(seguidor, new ArrayList<>());
    if (!seguidos.contains(seguido)) {
      seguidos.add(seguido);
      seguidoresPorUsuario.put(seguidor, seguidos);
    }

    // Adicionar os tweets do seguido ao seguidor
    List<String> postsSeguidor = postsPorUsuario.getOrDefault(seguidor, new ArrayList<>());
    List<String> postsSeguido = postsPorUsuario.getOrDefault(seguido, new ArrayList<>());
    postsSeguidor.addAll(postsSeguido);
    postsPorUsuario.put(seguidor, postsSeguidor);
  }

  public void postarMensagem(User user, String mensagem) {
    List<String> postsSeguidor = postsPorUsuario.getOrDefault(user, new ArrayList<>());
    if (!postsSeguidor.contains(mensagem)) {
      postsSeguidor.add(user.getName() + ": " + mensagem);
      postsPorUsuario.put(user, postsSeguidor);
    }
    // Adiciona o tweet ao mural de todos os seguidores
    List<User> seguidores = seguidoresPorUsuario.getOrDefault(user, new ArrayList<>());
    for (User seguidor : seguidores) {
      List<String> postsSeguidorAtualizado = postsPorUsuario.getOrDefault(seguidor, new ArrayList<>());
      if (!postsSeguidorAtualizado.contains(mensagem)) {
        postsSeguidorAtualizado.add(user.getName() + ": " + mensagem);
        postsPorUsuario.put(seguidor, postsSeguidorAtualizado);
      }
    }
  }

}