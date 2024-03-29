package harsha.bth.App.process;

import harsha.bth.App.db.entity.User;

import java.util.List;


public interface UserProcess {

    User verify(User user);
    User verifyForPost(User user);
    User create(User user);
    List<User> getList(String role);

}