/*
import Entity.Blog;
import Factory.MyBatisSqlSessionFactory;
import mapper.BlogMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.Date;


public class MyTest {

	 SqlSessionFactory sqlSessionFactory=null;
	@Before
	public void BeforeClass(){
		SqlSessionFactory session = MyBatisSqlSessionFactory.getSqlSessionFactory();
		try {
			InputStream is= Resources.getResourceAsStream("log4j.properties");
			PropertyConfigurator.configure(is);
			Reader reader = Resources.getResourceAsReader("BlogMapper.xml");
			sqlSessionFactory= new SqlSessionFactoryBuilder().build(reader);
			BlogMapper mapper = session.getMapper(BlogMapper.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	*/
/*@Test
	public void test(){
		System.out.println("123");
		 Logger logger = LoggerFactory.getLogger(getClass());
		 logger.debug("456");
	}*//*


	@Test
	public void newBlogTest(){
		Blog blog = new Blog();
		*/
/*BlogMapper mapper = session.getMapper(BlogMapper.class);*//*







	}



}
*/
