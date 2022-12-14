package model;

import org.checkerframework.checker.nullness.Opt;

import java.util.*;

public class UserStore {
    private Map<Integer,User> users=new HashMap<>();

    public Optional<User> addUser(User user)
    {
        int id= users.size();
        user.setId(id);
        users.put(id,user);
        return Optional.ofNullable(user);
    }

    public Optional<User> getUser(int id)
    {
        return Optional.ofNullable(users.get(id));
    }

    public Set<User> getAllUsers()
    {
        return new HashSet<>(users.values());
    }
}
