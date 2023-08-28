package com.codingbox.web.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlMapConfig {
	private static SqlSessionFactory factory;
	
	//클래스 초기화 블록(클래스가 처음 로딩될때 한번만 수행되는 초기화 블록)
	  static {
	      try {
	         String resource = "./com/codingbox/web/mybatis/config.xml";
	         Reader reader =  Resources.getResourceAsReader(resource);         
	         factory = new SqlSessionFactoryBuilder().build(reader);
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
	   }

	public static SqlSessionFactory getFactory() {
		return factory;
	}
	
}