//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.07.17 时间 08:12:52 PM CST 
//


package com.scp.cmd.cygl.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>userInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{http://www.cygl.cmd.scp.com/ws}user"/>
 *         &lt;element name="userAddInfo" type="{http://www.cygl.cmd.scp.com/ws}userAddInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfo", propOrder = {
    "user",
    "userAddInfo"
})
public class UserInfo {

    @XmlElement(required = true)
    protected User user;
    @XmlElement(required = true)
    protected UserAddInfo userAddInfo;

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * 获取userAddInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserAddInfo }
     *     
     */
    public UserAddInfo getUserAddInfo() {
        return userAddInfo;
    }

    /**
     * 设置userAddInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddInfo }
     *     
     */
    public void setUserAddInfo(UserAddInfo value) {
        this.userAddInfo = value;
    }

}
