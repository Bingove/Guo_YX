package com.xhs.center.utils;
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

/**
 * @projectName Monitor_Management
 * @packageName com.xhs.center.utils
 * @Author Bingove
 * @Date 2019/08/22 16:56
 * @title ResultBean
 * @ToDo
 */
public class ResultBean {
    private int code;//编码  1 成功 2失败
    private String msg;//内容
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    //成功
    public static ResultBean setSuccess(String msg){
        ResultBean bean=new ResultBean();
        bean.setCode(1);
        bean.setMsg(msg);
        return bean;
    }
    //失败
    public static ResultBean setError(String msg){
        ResultBean bean=new ResultBean();
        bean.setCode(2);
        bean.setMsg(msg);
        return bean;
    }
}
