package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.kosta.service.SqlMapClient;

public class program {

	public static void main(String[] args) {
		//SqlSession sqlsession = SqlMapClient.getSqlSession();
		//System.out.println(sqlsession.toString());
		//sqlsession.selectOne(arg0)
		
		SqlSessionFactory sqlsession = SqlMapClient.getSqlSession();
		
		
		SqlSession session = sqlsession.openSession();
		session.selectList("Emp.getusers");
		session.close();
		
		
		SqlSession session2 = sqlsession.openSession();
		String ename="hong";
		session2.selectOne("Emp.getone", ename);
		
		//아래 처럼 사용 가능
		//SqlMapClient.getSqlSession().openSession()
		
		/*
		SqlSession session = sqlSessionFactory.openSession();
		try {
		BlogMapper mapper = session.getMapper(BlogMapper.class);
		// do work
		} finally {
		session.close();
		} 
		*/
	}

}
