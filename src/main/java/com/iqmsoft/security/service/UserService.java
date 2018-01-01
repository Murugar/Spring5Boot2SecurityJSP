
package com.iqmsoft.security.service;

import com.iqmsoft.security.model.User;

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
