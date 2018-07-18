//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.07.18 时间 09:26:48 AM CST 
//


package com.scp.cmd.cygl.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>portalAccount complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="portalAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enableAccount" type="{http://www.cygl.cmd.scp.com/ws}statusEnum"/>
 *         &lt;element name="loginName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passWord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portalAccount", propOrder = {
    "enableAccount",
    "loginName",
    "passWord"
})
public class PortalAccount {

    @XmlElement(required = true)
    protected StatusEnum enableAccount;
    @XmlElement(required = true)
    protected String loginName;
    @XmlElement(required = true)
    protected String passWord;

    /**
     * 获取enableAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StatusEnum }
     *     
     */
    public StatusEnum getEnableAccount() {
        return enableAccount;
    }

    /**
     * 设置enableAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StatusEnum }
     *     
     */
    public void setEnableAccount(StatusEnum value) {
        this.enableAccount = value;
    }

    /**
     * 获取loginName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置loginName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginName(String value) {
        this.loginName = value;
    }

    /**
     * 获取passWord属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置passWord属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassWord(String value) {
        this.passWord = value;
    }

}
