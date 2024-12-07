package com.klef.jfsd.springboot.controller;


import com.klef.jfsd.springboot.model.Comment;
import com.klef.jfsd.springboot.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments() {
        return commentService.getAllComments();
    }
}
