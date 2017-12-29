package com.orangesir;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    @Insert("INSERT INTO user(`id`,`username`) VALUES(#{id},#{username})")
    int insertUser(@Param("id") int id, @Param("username") String username);
}
