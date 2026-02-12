package com.example.demo.service;

import com.example.demo.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();
    public List<Post> listAllPosts(){
        /*posts.add(new Post("Сентяяябрь горит", new Date(2026, 2, 12)));
        posts.add(new Post("Ответ на главный вопрос жизни вселенной и вообще:", new Date(4242, 4, 2)));
        posts.add(new Post("Ещё 1 пост", new Date()));*/
        return posts;
    }
    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
}
