package kr.or.kosta.service;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


//설계자가 요구한 코드가 아니다
//이 코드를 바꿔보세요
/*public class SqlMapClient {
	private static SqlSession session;
	static{
		String resource = "SqlMapConfig.xml";
		try{
			Reader reader = Resources.getResourceAsReader(resource);
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("static 초기자 설정");
			session = factory.openSession();
		}catch(Exception e){
			
		}
	}
	public static SqlSession getSqlSession(){
		return session;
	}
}*/
public class SqlMapClient {
	private static SqlSessionFactory sqlsessionfactory;
	static{
		String resource = "SqlMapConfig.xml";
		try{
			Reader reader = Resources.getResourceAsReader(resource);
			sqlsessionfactory = new SqlSessionFactoryBuilder().build(reader);
			System.out.println("static 초기자 설정");
			
		}catch(Exception e){
			
		}
	}
	public static SqlSessionFactory getSqlSession(){
		return sqlsessionfactory;
	}
}