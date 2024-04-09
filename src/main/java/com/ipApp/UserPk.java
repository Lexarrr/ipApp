package com.ipApp;

import com.ipApp.persistence.model.Role;
import com.ipApp.persistence.model.User;

import java.io.Serializable;
import java.util.Objects;

//@Entity
//@Table(name="role_user")
public class UserPk implements Serializable {

    private User user;

    private Role role;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPk userPk = (UserPk) o;
        return Objects.equals(user, userPk.user) && Objects.equals(role, userPk.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, role);
    }
}
