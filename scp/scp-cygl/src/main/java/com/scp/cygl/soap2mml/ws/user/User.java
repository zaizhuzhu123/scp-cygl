//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.07.15 时间 06:00:04 PM CST 
//


package com.scp.cygl.soap2mml.ws.user;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>user complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grpID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="terminalType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memPowerFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memVPNFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="memIMSFuncFlag" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCFUInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCFBInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCFNRInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userCFNLInfo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wGroupID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cugID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languageType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "fullNumber",
    "grpID",
    "shortNumber",
    "terminalType",
    "userType",
    "status",
    "property",
    "displayFlag",
    "memPowerFlag",
    "memVPNFuncFlag",
    "memIMSFuncFlag",
    "userCFUInfo",
    "userCFBInfo",
    "userCFNRInfo",
    "userCFNLInfo",
    "wGroupID",
    "createTime",
    "cugID",
    "languageType"
})
public class User {

    @XmlElement(required = true)
    protected String fullNumber;
    @XmlElement(required = true)
    protected String grpID;
    @XmlElement(required = true)
    protected String shortNumber;
    @XmlElement(required = true)
    protected String terminalType;
    @XmlElement(required = true)
    protected String userType;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String property;
    @XmlElement(required = true)
    protected String displayFlag;
    @XmlElement(required = true)
    protected String memPowerFlag;
    @XmlElement(required = true)
    protected String memVPNFuncFlag;
    @XmlElement(required = true)
    protected String memIMSFuncFlag;
    @XmlElement(required = true)
    protected String userCFUInfo;
    @XmlElement(required = true)
    protected String userCFBInfo;
    @XmlElement(required = true)
    protected String userCFNRInfo;
    @XmlElement(required = true)
    protected String userCFNLInfo;
    @XmlElement(required = true)
    protected String wGroupID;
    @XmlElement(required = true)
    protected String createTime;
    @XmlElement(required = true)
    protected String cugID;
    @XmlElement(required = true)
    protected String languageType;

    /**
     * 获取fullNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNumber() {
        return fullNumber;
    }

    /**
     * 设置fullNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNumber(String value) {
        this.fullNumber = value;
    }

    /**
     * 获取grpID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpID() {
        return grpID;
    }

    /**
     * 设置grpID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpID(String value) {
        this.grpID = value;
    }

    /**
     * 获取shortNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNumber() {
        return shortNumber;
    }

    /**
     * 设置shortNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNumber(String value) {
        this.shortNumber = value;
    }

    /**
     * 获取terminalType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * 设置terminalType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

    /**
     * 获取userType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 设置userType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取property属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * 获取displayFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayFlag() {
        return displayFlag;
    }

    /**
     * 设置displayFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayFlag(String value) {
        this.displayFlag = value;
    }

    /**
     * 获取memPowerFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemPowerFlag() {
        return memPowerFlag;
    }

    /**
     * 设置memPowerFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemPowerFlag(String value) {
        this.memPowerFlag = value;
    }

    /**
     * 获取memVPNFuncFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemVPNFuncFlag() {
        return memVPNFuncFlag;
    }

    /**
     * 设置memVPNFuncFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemVPNFuncFlag(String value) {
        this.memVPNFuncFlag = value;
    }

    /**
     * 获取memIMSFuncFlag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemIMSFuncFlag() {
        return memIMSFuncFlag;
    }

    /**
     * 设置memIMSFuncFlag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemIMSFuncFlag(String value) {
        this.memIMSFuncFlag = value;
    }

    /**
     * 获取userCFUInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCFUInfo() {
        return userCFUInfo;
    }

    /**
     * 设置userCFUInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCFUInfo(String value) {
        this.userCFUInfo = value;
    }

    /**
     * 获取userCFBInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCFBInfo() {
        return userCFBInfo;
    }

    /**
     * 设置userCFBInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCFBInfo(String value) {
        this.userCFBInfo = value;
    }

    /**
     * 获取userCFNRInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCFNRInfo() {
        return userCFNRInfo;
    }

    /**
     * 设置userCFNRInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCFNRInfo(String value) {
        this.userCFNRInfo = value;
    }

    /**
     * 获取userCFNLInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserCFNLInfo() {
        return userCFNLInfo;
    }

    /**
     * 设置userCFNLInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserCFNLInfo(String value) {
        this.userCFNLInfo = value;
    }

    /**
     * 获取wGroupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWGroupID() {
        return wGroupID;
    }

    /**
     * 设置wGroupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWGroupID(String value) {
        this.wGroupID = value;
    }

    /**
     * 获取createTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置createTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateTime(String value) {
        this.createTime = value;
    }

    /**
     * 获取cugID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCugID() {
        return cugID;
    }

    /**
     * 设置cugID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCugID(String value) {
        this.cugID = value;
    }

    /**
     * 获取languageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageType() {
        return languageType;
    }

    /**
     * 设置languageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageType(String value) {
        this.languageType = value;
    }

}
