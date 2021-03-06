//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.04 at 03:04:02 PM EST 
//


package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}box" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="backcolor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Opaque"/>
 *             &lt;enumeration value="Transparent"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="style" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "box",
    "lineOrRectangleOrEllipse"
})
@XmlRootElement(name = "cellContents")
public class CellContents {

    protected Box box;
    @XmlElements({
        @XmlElement(name = "line", type = Line.class),
        @XmlElement(name = "rectangle", type = Rectangle.class),
        @XmlElement(name = "ellipse", type = Ellipse.class),
        @XmlElement(name = "image", type = Image.class),
        @XmlElement(name = "staticText", type = StaticText.class),
        @XmlElement(name = "textField", type = TextField.class),
        @XmlElement(name = "elementGroup", type = ElementGroup.class),
        @XmlElement(name = "frame", type = Frame.class),
        @XmlElement(name = "componentElement", type = ComponentElement.class),
        @XmlElement(name = "genericElement", type = GenericElement.class)
    })
    protected List<Object> lineOrRectangleOrEllipse;
    @XmlAttribute(name = "backcolor")
    protected String backcolor;
    @XmlAttribute(name = "mode")
    protected String mode;
    @XmlAttribute(name = "style")
    protected String style;

    /**
     * Gets the value of the box property.
     * 
     * @return
     *     possible object is
     *     {@link Box }
     *     
     */
    public Box getBox() {
        return box;
    }

    /**
     * Sets the value of the box property.
     * 
     * @param value
     *     allowed object is
     *     {@link Box }
     *     
     */
    public void setBox(Box value) {
        this.box = value;
    }

    /**
     * Gets the value of the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineOrRectangleOrEllipse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineOrRectangleOrEllipse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link ElementGroup }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     * 
     * 
     */
    public List<Object> getLineOrRectangleOrEllipse() {
        if (lineOrRectangleOrEllipse == null) {
            lineOrRectangleOrEllipse = new ArrayList<Object>();
        }
        return this.lineOrRectangleOrEllipse;
    }

    /**
     * Gets the value of the backcolor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackcolor() {
        return backcolor;
    }

    /**
     * Sets the value of the backcolor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackcolor(String value) {
        this.backcolor = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the style property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStyle() {
        return style;
    }

    /**
     * Sets the value of the style property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStyle(String value) {
        this.style = value;
    }

}
