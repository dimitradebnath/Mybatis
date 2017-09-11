package com.dd.Service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dd.MyBatisUtil;
import com.dd.domain.User;
import com.dd.mappers.UserMapper;

public class UserService
{
	 public static void insertUser(User user)
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	            userMapper.insertUser(user);
	            sqlSession.commit();
	            System.out.println("Data Inserted");
	        } finally
	        {
	            sqlSession.close();
	        }
	    }
	 
	    public User getUserById(Integer userId)
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	            return userMapper.getUserById(userId);
	        } finally
	        {
	            sqlSession.close();
	        }
	    }
	 
	    public static List<User> getAllUsers()
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	            System.out.println("Data is shown in the database");
	            return userMapper.getAllUsers();
	            
	        } finally
	        {
	            sqlSession.close();
	        }
	    }
	 
	    public static void updateUser(User user)
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	            userMapper.updateUser(user);
	            sqlSession.commit();
	            System.out.println("Data is updated");
	        } finally
	        {
	            sqlSession.close();
	        }
	 
	    }
	 
	    public static void deleteUser(Integer userId)
	    {
	        SqlSession sqlSession = MyBatisUtil.getSqlSessionFactory().openSession();
	        try
	        {
	            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
	            userMapper.deleteUser(userId);
	            sqlSession.commit();
	            System.out.println("Data is deleted");
	        } finally
	        {
	            sqlSession.close();
	        }
	 
	    }
	
}