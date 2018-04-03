package mapper;

import Entity.User;

import java.util.List;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public interface UserMapper {
    public boolean newUser(User user);
    public boolean delUser(String id);
    public boolean updateUser(User user);
    public User queryUserById(String id);
    public List<User> listAllUser();
    public List<User> queryUserByName(String name);
}
