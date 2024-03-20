import java.util.ArrayList;
import java.util.List;

public class User {
  private String name;
  private List<User> seguidores;
  private List<User> seguidos;
  private List<String> tweets;

  public User(String name) {
    this.name = name;
    this.seguidores = new ArrayList<>();
    this.seguidos = new ArrayList<>();
    this.tweets = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public List<String> getTweets() {
    return tweets;
  }

  public List<User> getSeguidores() {
    return seguidores;
  }

  public List<User> getSeguidos() {
    return seguidos;
  }

  public void addTweet(String tweet) {
    tweets.add(tweet);
  }

  public void addSeguidor(User seguidor) {
    seguidores.add(seguidor);
  }

  public void addSeguido(User seguido) {
    if (!seguidos.contains(seguido))
      seguidos.add(seguido);
  }

  public void removeSeguidor(User seguidor) {
    seguidores.remove(seguidor);
  }

  public void removeSeguido(User seguido) {
    seguidos.remove(seguido);
  }

  public void removeTweet(String tweet) {
    tweets.remove(tweet);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String toString() {
    return name;
  }
}