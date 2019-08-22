package com.xhs.center.dao.master;

import com.xhs.center.model.master.TUser;
import com.xhs.center.utils.MyMapper;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Repository
public interface TUserMapper extends MyMapper<TUser> {
    //删除用户
    //@Update("update t_user set flag=2 where id=#{id}")
    int delete_1(int id);

    //修改用户  主要是用户名 或者密码
    //@Update("update t_user set password=#{password} where id=#{id}")
    int update(TUser user);

    //校验   查询
    //@Select("select * from t_user where username=#{username} and role=1")
    // @ResultType(TUser.class)
    TUser queryByName(String username);

    //增加数据 也就是 注册
    //@Insert("insert into t_user(username,password,role,flag) values(#{username},#{password},1,1)")
    int save(TUser user);

    //登录
    //@Select("select * from t_user where username=#{username} and role=#{role}")
    //@ResultType(TUser.class)
    TUser queryByNOAndP(Map map);

}