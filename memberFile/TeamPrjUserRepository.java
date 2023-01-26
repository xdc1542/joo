package com.ajd.meow.repository.donate;

import com.ajd.meow.entity.UserMaster;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<UserMaster, Long> {
}
