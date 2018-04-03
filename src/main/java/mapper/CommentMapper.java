package mapper;

import javax.xml.stream.events.Comment;
import java.util.List;

/**
 * Created by Administrator on 2018/3/11 0011.
 */
public interface CommentMapper {
    public boolean newComment(Comment comment);
    public boolean delCommentById(String id);
    public boolean updateComment(Comment comment);
    public Comment queryCommentById(String id);
    public List<Comment> queryCommentByUserId(String userId);
}
