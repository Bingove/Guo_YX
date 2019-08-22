package com.xhs.center.service.master;
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

import com.xhs.center.model.master.TUser;

/**
 * @projectName Monitor_Management
 * @packageName com.xhs.center.service.master
 * @Author 常冬军
 * @Date 2019/08/22 16:53
 * @title TUserService
 * @ToDo
 */
public interface TUserService {
    boolean delete(int id);
    boolean update(TUser user);

    TUser queryByName(String username);
    boolean save(TUser user);
    TUser queryByNOAndP(String username, int role);
}
