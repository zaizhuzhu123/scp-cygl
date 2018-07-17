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
 * <p>delUser complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="delUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fullNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="grpID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shortNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "delUser", propOrder = {
    "fullNumber",
    "grpID",
    "shortNumber"
})
public class DelUser {

    @XmlElement(required = true)
    protected String fullNumber;
    @XmlElement(required = true)
    protected String grpID;
    @XmlElement(required = true)
    protected String shortNumber;

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

}
