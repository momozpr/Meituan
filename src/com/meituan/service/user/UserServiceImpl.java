package com.meituan.service.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.meituan.mapper.UserMapper;
import com.meituan.pojo.EUDataGridResult;
import com.meituan.pojo.User;
import com.meituan.pojo.UserExample;

@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User findUserById(String id) {
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
	
	
	@Override
	public PageInfo<User> findUsers(int curPage,int pageSize){
//		return users;
		
		 //��ѯ��Ʒ�б�  
		UserExample ue=new UserExample();  
        //��ҳ����  
        PageHelper.startPage(curPage, pageSize);  
        List<User> list=userMapper.selectByExample(ue);
        //����һ������ֵ����  
        //���÷��ؽ��  
        //���÷��ص��ܼ�¼��  
        PageInfo<User> pageInfo=new PageInfo<>(list);  
        return pageInfo;
        
	}

}