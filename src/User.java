import java.util.ArrayList;
import java.util.List;

public class User {

  private String name;
  private List<String> seguidores;
  private List<String> seguidos;
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

  public List<String> getSeguidores() {
    return seguidores;
  }

  public List<String> getSeguidos() {
    return seguidos;
  }

  public void addTweet(String tweet) {
    tweets.add(tweet);
  }

  public void addSeguidor(String seguidor) {
    seguidores.add(seguidor);
  }

  public void addSeguido(String seguido) {
    seguidos.add(seguido);
  }

  public void removeSeguidor(String seguidor) {
    seguidores.remove(seguidor);
  }

  public void removeSeguido(String seguido) {
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
