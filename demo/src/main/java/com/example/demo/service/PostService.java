package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<>();
        list.add(new Post("Сентяяябрь горит", new Date(2026, 2, 12)));
        list.add(new Post("Ответ на главный вопрос жизни вселенной и вообще:", new Date(4242, 4, 2)));
        list.add(new Post("Ещё 1 пост", new Date()));
        return list;
    }
}
