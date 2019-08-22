package com.xhs.center.service.master.impl;
/**
 * .............................................
 * 佛祖保佑             永无BUG
 * 佛曰:
 * 写字楼里写字间，写字间里程序员；
 * 程序人员写程序，又拿程序换酒钱。
 * 酒醒只在网上坐，酒醉还来网下眠；
 * 酒醉酒醒日复日，网上网下年复年。
 * 但愿老死电脑间，不愿鞠躬老板前；
 * 奔驰宝马贵者趣，公交自行程序员。
 * 别人笑我忒疯癫，我笑自己命太贱；
 *
 * @Motto 纵有疾风起  人生不言弃
 */

import com.xhs.center.dao.master.TUserMapper;
import com.xhs.center.model.master.TUser;
import com.xhs.center.service.master.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @projectName Monitor_Management
 * @packageName com.xhs.center.service.master.impl
 * @Author Bingove
 * @Date 2019/08/22 16:53
 * @title TUserServiceImpl
 * @ToDo
 */
@Service
public class TUserServiceImpl implements TUserService {
    @Autowired
    private TUserMapper mapper;

    @Override
    public boolean delete(int id) {
        return mapper.delete_1(id) > 0;
    }

    @Override
    public boolean update(TUser user) {
        return mapper.update(user) > 0;
    }

    @Override
    public TUser queryByName(String username) {
        return mapper.queryByName(username);
    }

    @Override
    public boolean save(TUser user) {
        return mapper.save(user) > 0;
    }

    @Override
    public TUser queryByNOAndP(String username, int role) {
        Map<String, Object> map = new HashMap<>();
        map.put("username", username);
        map.put("role", role);
        return mapper.queryByNOAndP(map);
    }
}
