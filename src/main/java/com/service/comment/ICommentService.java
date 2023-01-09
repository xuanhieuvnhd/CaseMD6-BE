package com.service.comment;

import com.entity.Comment;
import com.service.GenericService;

public interface ICommentService extends GenericService<Comment> {
    Iterable<Comment> getCommentBySongId(Long id);

    Iterable<Comment> getCommentByPlaylistId(Long id);
}
