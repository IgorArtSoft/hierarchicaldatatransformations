//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}keyExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}valueExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}labelExpression" minOccurs="0"/>
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}sectionHyperlink" minOccurs="0"/>
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
    "keyExpression",
    "valueExpression",
    "labelExpression",
    "sectionHyperlink"
})
@XmlRootElement(name = "pieSeries")
public class PieSeries {

    protected KeyExpression keyExpression;
    protected ValueExpression valueExpression;
    protected LabelExpression labelExpression;
    protected SectionHyperlink sectionHyperlink;

    /**
     * Gets the value of the keyExpression property.
     * 
     * @return
     *     possible object is
     *     {@link KeyExpression }
     *     
     */
    public KeyExpression getKeyExpression() {
        return keyExpression;
    }

    /**
     * Sets the value of the keyExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyExpression }
     *     
     */
    public void setKeyExpression(KeyExpression value) {
        this.keyExpression = value;
    }

    /**
     * Gets the value of the valueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ValueExpression }
     *     
     */
    public ValueExpression getValueExpression() {
        return valueExpression;
    }

    /**
     * Sets the value of the valueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExpression }
     *     
     */
    public void setValueExpression(ValueExpression value) {
        this.valueExpression = value;
    }

    /**
     * Gets the value of the labelExpression property.
     * 
     * @return
     *     possible object is
     *     {@link LabelExpression }
     *     
     */
    public LabelExpression getLabelExpression() {
        return labelExpression;
    }

    /**
     * Sets the value of the labelExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link LabelExpression }
     *     
     */
    public void setLabelExpression(LabelExpression value) {
        this.labelExpression = value;
    }

    /**
     * Gets the value of the sectionHyperlink property.
     * 
     * @return
     *     possible object is
     *     {@link SectionHyperlink }
     *     
     */
    public SectionHyperlink getSectionHyperlink() {
        return sectionHyperlink;
    }

    /**
     * Sets the value of the sectionHyperlink property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionHyperlink }
     *     
     */
    public void setSectionHyperlink(SectionHyperlink value) {
        this.sectionHyperlink = value;
    }

}