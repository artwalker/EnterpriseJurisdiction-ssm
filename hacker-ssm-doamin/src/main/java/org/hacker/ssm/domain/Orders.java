package org.hacker.ssm.domain;

import java.util.Date;
import java.util.List;

/**
 * @author HackerStar
 * @create 2020-04-22 11:11
 */
public class Orders {
    private String id;//无意义，主键
    private String orderNum;//订单编号 不为空 唯一
    private Date orderTime;//下单时间

    private String orderTimeStr;
    private int orderStatus;//订单状态(1 未支付 1 已支付)
    private String orderStatusStr;
    private int peopleCount;//出行人数
    private Product product;//产品信息
    private Member member;//会员信息
    private List<Traveller> travellers;//旅客信息
    private Integer payType;//支付方式(0 支付宝 1 微信 2 其他)
    private String payTypeStr;//支付方式描述
    private String orderDesc;//订单描述(其他信息)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusStr() {
        //订单状态(1 未支付 1 已支付)
        if (orderStatus == 0) {
            return "未支付";
        } else if (orderStatus == 1) {
            return "已支付";
        }

        return null;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        //支付方式(0 支付宝 1 微信 2 其他)
        if (payType == 0) {
            return "支付宝";
        } else if (payType == 1) {
            return "微信";
        } else {
            return "其他";
        }
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }
}
