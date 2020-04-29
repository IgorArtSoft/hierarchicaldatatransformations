package dev.igorartsoft.hierarchical.data.xml.jasperreports.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "",
    ""
})
@XmlRootElement(name = "labelValues")
public class LabelValues {
	
	private StaticText staticText;
	private TextField[] textField;
	
	public StaticText getStaticText() {
		return staticText;
	}
	public void setStaticText(StaticText staticText) {
		this.staticText = staticText;
	}
	public TextField[] getTextField() {
		return textField;
	}
	public void setTextField(TextField[] textField) {
		this.textField = textField;
	}
	
}
