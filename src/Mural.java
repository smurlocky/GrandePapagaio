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

}
