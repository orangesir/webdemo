package com.orangesir;

import com.alibaba.fastjson.JSON;

class User {

    private Long   id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class App 
{
    public static void main( String[] args )
    {
        User user = new User();
        user.setId(10l);
        user.setName("json兄弟!");
        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString);
        User user1 = JSON.parseObject(jsonString, User.class);
        System.out.println("user1:"+user1.getId()+","+user1.getName());
    }
}
