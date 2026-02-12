package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {
    public List<Post> listAllPosts(){
        List<Post> list = new ArrayList<>();
        list.add(new Post("Сентяяябрь горит", 2007));
        list.add(new Post("Ответ на главный вопрос жизни вселенной и вообще:", 42));
        list.add(new Post("Ещё 1 пост", 123));
        return list;
    }
}
