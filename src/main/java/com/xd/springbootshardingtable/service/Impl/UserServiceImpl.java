package com.xd.springbootshardingtable.service.Impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xd.springbootshardingtable.entity.User;
import com.xd.springbootshardingtable.mapper.UserMapper;
import com.xd.springbootshardingtable.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname UserServiceImpl
 * @Description 用户服务实现类
 * @Author 李号东 lihaodongmail@163.com
 * @Date 2019-05-26 17:32
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Override
    public boolean save(User entity) {
        return super.save(entity);
    }

    @Override
    public List<User> getUserList() {
        return baseMapper.selectList(Wrappers.<User>lambdaQuery());
    }

    @Override
    public Integer getcount() {
        return baseMapper.selectCount(Wrappers.<User>lambdaQuery());
    }

    @Override
    public List<User> getUserListByAge(Integer age) {
        QueryWrapper<User> ueryWrapper = new QueryWrapper<>();
        ueryWrapper.eq("age",age);
        return baseMapper.selectList(ueryWrapper);
    }

}
