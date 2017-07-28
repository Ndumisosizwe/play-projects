package model;

import model.User;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean ( name = "userController", eager = true )
@ApplicationScoped
public class UserController {

  private User user = new User();

  public UserController ( ) {
  }

  public User createUser() {
    return null;
  }
}
