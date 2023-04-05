package com.dog.withd.Mapper;

import com.dog.withd.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface MapperUser {
    void saveUser(User user);
}
