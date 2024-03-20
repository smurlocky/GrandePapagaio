public class User {

  String name;
  String seguidores[];
  String seguidos[];
  String tweets[];

  public User(String name, String[] seguidores, String[] seguidos, String[] tweets) {
    this.name = name;
    this.seguidores = seguidores;
    this.seguidos = seguidos;
    this.tweets = tweets;
  }

  public String getName() {
    return name;
  }

  public String[] getSeguidores() {
    return seguidores;
  }

  public String[] getSeguidos() {
    return seguidos;
  }

  public String[] getTweets() {
    return tweets;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSeguidores(String[] seguidores) {
    this.seguidores = seguidores;
  }

  public void setSeguidos(String[] seguidos) {
    this.seguidos = seguidos;
  }

  public void setTweets(String[] tweets) {
    this.tweets = tweets;
  }

}
