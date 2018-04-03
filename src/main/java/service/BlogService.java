/*
package service;
import java.util.List;

import Factory.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Entity.Blog;
import mapper.BlogMapper;
import Factory.MyBatisSqlSessionFactory;
public class BlogService
{
	private Logger logger =
			LoggerFactory.getLogger(getClass());
	public List<Blog> listAllBlog()
	{
		SqlSession sqlSession =
				MyBatisSqlSessionFactory.openSession();
		try
		{
			BlogMapper blogMapper =
					sqlSession.getMapper(BlogMapper.class);
			return blogMapper.listAllBlog();
		}
		finally
		{
			//If sqlSession is not closed
			//then database Connection associated this sqlSession will not be
			returned to pool
			//and application may run out of connections.
			sqlSession.close();
		}
	}
	public Blog queryBlogById(String id)
	{
		logger.debug("Select Blog By ID :{}", id);
		SqlSession sqlSession =
				MyBatisSqlSessionFactory.openSession();
		try
		{
			BlogMapper blogMapper =
					sqlSession.getMapper(BlogMapper.class);
			return blogMapper.queryBlogbyId(id);
		}
		finally
		{
			sqlSession.close();
		}
	}
	public void newBlog(Blog blog)
	{
		SqlSession sqlSession =
				MyBatisSqlSessionFactory.openSession();
		try
		{
			BlogMapper blogMapper =
					sqlSession.getMapper(BlogMapper.class);
			blogMapper.newBlog(blog);
			sqlSession.commit();
		}
		finally
		{
			sqlSession.close();
		}
	}
}
*/
