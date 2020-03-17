package com.notmyfault02.api.controller.v1;

import com.notmyfault02.api.entity.User;
import com.notmyfault02.api.repository.UserJpaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping (value = "/v1")
public class UserControllor {
    private UserJpaRepo userJPARepo;

    @GetMapping (value = "/user")
    public List<User> findAllUser() {
        return userJPARepo.findAll();
    }

    @PostMapping (value = "/user")
    public User save() {
        User user = User.builder()
                .uid("hello0000@naver.coom")
                .name("김안녕")
                .build();
        return userJPARepo.save(user);
    }

}
