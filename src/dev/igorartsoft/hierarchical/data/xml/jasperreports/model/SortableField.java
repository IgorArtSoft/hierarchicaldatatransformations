package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlElement;

public abstract class SortableField {
	
    @XmlElement(required = true)
	private ReportElement reportElement; 
        
    /**
     * Gets the value of the reportElement property.
     * 
     * @return
     *     possible object is
     *     {@link ReportElement }
     *     
     */
    public ReportElement getReportElement() {
        return reportElement;
    }

    /**
     * Sets the value of the reportElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportElement }
     *     
     */
    public void setReportElement(ReportElement value) {
        this.reportElement = value;
    }

}
