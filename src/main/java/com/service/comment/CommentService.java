package com.service.comment;

import com.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService implements ICommentService {
    @Autowired
    com.repository.ICommentRepository ICommentRepository;

    @Override
    public Iterable<Comment> findAll() {
        return ICommentRepository.findAll();
    }

    @Override
    public Optional<Comment> findById(Long id) {
        return ICommentRepository.findById(id);
    }

    @Override
    public Comment save(Comment comment) {
        return ICommentRepository.save(comment);
    }

    @Override
    public void remove(Long id) {
        ICommentRepository.deleteById(id);

    }

    @Override
    public Iterable<Comment> getCommentBySongId(Long id) {
        return ICommentRepository.getCommentBySongId(id);
    }

    @Override
    public Iterable<Comment> getCommentByPlaylistId(Long id) {
        return ICommentRepository.getCommentByPlaylistId(id);
    }
}
