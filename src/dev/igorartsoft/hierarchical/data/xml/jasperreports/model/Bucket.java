//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bucketExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}orderByExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}comparatorExpression" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" default="java.lang.String" />
 *       &lt;attribute name="order" default="Ascending">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Ascending"/>
 *             &lt;enumeration value="Descending"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bucketExpression",
    "orderByExpression",
    "comparatorExpression"
})
@XmlRootElement(name = "bucket")
public class Bucket {

    protected BucketExpression bucketExpression;
    protected OrderByExpression orderByExpression;
    protected ComparatorExpression comparatorExpression;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "order")
    protected String order;

    /**
     * Gets the value of the bucketExpression property.
     * 
     * @return
     *     possible object is
     *     {@link BucketExpression }
     *     
     */
    public BucketExpression getBucketExpression() {
        return bucketExpression;
    }

    /**
     * Sets the value of the bucketExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link BucketExpression }
     *     
     */
    public void setBucketExpression(BucketExpression value) {
        this.bucketExpression = value;
    }

    /**
     * Gets the value of the orderByExpression property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByExpression }
     *     
     */
    public OrderByExpression getOrderByExpression() {
        return orderByExpression;
    }

    /**
     * Sets the value of the orderByExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByExpression }
     *     
     */
    public void setOrderByExpression(OrderByExpression value) {
        this.orderByExpression = value;
    }

    /**
     * Gets the value of the comparatorExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ComparatorExpression }
     *     
     */
    public ComparatorExpression getComparatorExpression() {
        return comparatorExpression;
    }

    /**
     * Sets the value of the comparatorExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComparatorExpression }
     *     
     */
    public void setComparatorExpression(ComparatorExpression value) {
        this.comparatorExpression = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "java.lang.String";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrder() {
        if (order == null) {
            return "Ascending";
        } else {
            return order;
        }
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrder(String value) {
        this.order = value;
    }

}
