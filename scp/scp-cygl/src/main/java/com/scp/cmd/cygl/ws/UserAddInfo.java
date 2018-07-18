//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.7 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.07.18 时间 09:26:48 AM CST 
//


package com.scp.cmd.cygl.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>userAddInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="userAddInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serviceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="impuList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="extraShortNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portalAccount" type="{http://www.cygl.cmd.scp.com/ws}portalAccount"/>
 *         &lt;element name="address" type="{http://www.cygl.cmd.scp.com/ws}userAddress"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userAddInfo", propOrder = {
    "serviceNo",
    "areaNo",
    "impl",
    "impuList",
    "extraShortNumber",
    "portalAccount",
    "address"
})
public class UserAddInfo {

    @XmlElement(required = true)
    protected String serviceNo;
    @XmlElement(required = true)
    protected String areaNo;
    @XmlElement(required = true)
    protected String impl;
    @XmlElement(nillable = true)
    protected List<String> impuList;
    @XmlElement(required = true)
    protected String extraShortNumber;
    @XmlElement(required = true)
    protected PortalAccount portalAccount;
    @XmlElement(required = true)
    protected UserAddress address;

    /**
     * 获取serviceNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNo() {
        return serviceNo;
    }

    /**
     * 设置serviceNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNo(String value) {
        this.serviceNo = value;
    }

    /**
     * 获取areaNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * 设置areaNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaNo(String value) {
        this.areaNo = value;
    }

    /**
     * 获取impl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpl() {
        return impl;
    }

    /**
     * 设置impl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpl(String value) {
        this.impl = value;
    }

    /**
     * Gets the value of the impuList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impuList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpuList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImpuList() {
        if (impuList == null) {
            impuList = new ArrayList<String>();
        }
        return this.impuList;
    }

    /**
     * 获取extraShortNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraShortNumber() {
        return extraShortNumber;
    }

    /**
     * 设置extraShortNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraShortNumber(String value) {
        this.extraShortNumber = value;
    }

    /**
     * 获取portalAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PortalAccount }
     *     
     */
    public PortalAccount getPortalAccount() {
        return portalAccount;
    }

    /**
     * 设置portalAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PortalAccount }
     *     
     */
    public void setPortalAccount(PortalAccount value) {
        this.portalAccount = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserAddress }
     *     
     */
    public UserAddress getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddress }
     *     
     */
    public void setAddress(UserAddress value) {
        this.address = value;
    }

}
