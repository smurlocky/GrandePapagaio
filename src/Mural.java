import java.util.ArrayList;
import java.util.List;

public class Mural {
  private List<User> users;

  public Mural() {
    users = new ArrayList<User>();
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
    users.remove(new User(name));
  }

  public void removeUser(int index) {
    users.remove(index);
  }

  public List<String> getSeguidos(User user) {
    for (User u : users) {
      if (u.equals(user))
        return u.getSeguidos();
    }
    return null;
  }

  public List<String> getTweets(User user) {
    for (User u : users) {
      if (u.equals(user))
        return u.getTweets();
    }
    return null;
  }

}
