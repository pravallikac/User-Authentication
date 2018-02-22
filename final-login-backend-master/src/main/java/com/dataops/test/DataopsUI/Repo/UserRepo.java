package com.dataops.test.DataopsUI.Repo;

import com.dataops.test.DataopsUI.Model.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserInfo, Integer> {

    UserInfo findByUsername(String username);

}

