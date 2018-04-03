import Entity.Blog;
import util.MyBatisSqlSessionFactory;
import mapper.BlogMapper;
import org.apache.ibatis.session.SqlSession;

public class Main {
	public static void main(String[] args){
		SqlSession sqlSession= MyBatisSqlSessionFactory.openSession();
		BlogMapper blogMapper=sqlSession.getMapper(BlogMapper.class);
		Blog blog=blogMapper.queryBlogbyId("1");
		sqlSession.commit();
	}
}
