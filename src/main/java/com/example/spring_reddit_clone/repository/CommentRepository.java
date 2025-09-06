package com.example.spring_reddit_clone.repository;

import com.example.spring_reddit_clone.model.Comment;
import com.example.spring_reddit_clone.model.Post;
import com.example.spring_reddit_clone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
