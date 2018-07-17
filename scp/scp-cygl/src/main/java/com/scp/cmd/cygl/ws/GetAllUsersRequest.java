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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="grpID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pagingInfo" type="{http://www.cygl.cmd.scp.com/ws}pagingInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "grpID",
    "pagingInfo"
})
@XmlRootElement(name = "getAllUsersRequest")
public class GetAllUsersRequest {

    @XmlElement(required = true)
    protected String grpID;
    @XmlElement(required = true)
    protected PagingInfo pagingInfo;

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
     * 获取pagingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PagingInfo }
     *     
     */
    public PagingInfo getPagingInfo() {
        return pagingInfo;
    }

    /**
     * 设置pagingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PagingInfo }
     *     
     */
    public void setPagingInfo(PagingInfo value) {
        this.pagingInfo = value;
    }

}
