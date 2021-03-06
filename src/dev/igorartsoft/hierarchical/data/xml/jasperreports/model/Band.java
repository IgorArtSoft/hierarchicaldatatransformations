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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}printWhenExpression" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}break"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}line"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}rectangle"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ellipse"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}image"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}staticText"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}textField"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}subreport"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pieChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}pie3DChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}barChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bar3DChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyBarChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBarChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedBar3DChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}lineChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyLineChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}areaChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}xyAreaChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}scatterChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}bubbleChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}timeSeriesChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}highLowChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}candlestickChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}meterChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}thermometerChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}multiAxisChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}stackedAreaChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}ganttChart"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}elementGroup"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}crosstab"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}frame"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}componentElement"/>
 *           &lt;element ref="{http://jasperreports.sourceforge.net/jasperreports}genericElement"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" default="0" />
 *       &lt;attribute name="isSplitAllowed">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="true"/>
 *             &lt;enumeration value="false"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="splitType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Stretch"/>
 *             &lt;enumeration value="Prevent"/>
 *             &lt;enumeration value="Immediate"/>
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
    "printWhenExpression",
    "breakOrLineOrRectangle",
    "rectangle",
    "break1",
    "line",
    "ellipse",
    "image",
    "elementGroup",
    "labelValues",
    "textField",    
    "staticText",
    "subreport",
    "pieChart",
    "pie3DChart",
    "barChart",
    "bar3DChart",
    "xyBarChart",
    "stackedBarChart",
    "stackedBar3DChart",
    "lineChart",
    "xyLineChart",
    "areaChart",
    "xyAreaChart",
    "scatterChart",
    "bubbleChart",
    "timeSeriesChart",
    "highLowChart",
    "candlestickChart",
    "meterChart",
    "thermometerChart",
    "multiAxisChart",
    "stackedAreaChart",
    "ganttChart",
    "crosstab",
    "frame",
    "componentElement",
    "genericElement"
})
@XmlRootElement(name = "band")
public class Band {

    private PrintWhenExpression printWhenExpression;
    
    private TextField[] textField;
    private Rectangle[] rectangle;
    private LabelValues[] labelValues;
        
    @XmlElement(name = "break" )
    private Break[] break1;
    private Line[] line;
    private Ellipse[] ellipse;
    private Image[] image;
    private StaticText[] staticText;
    private Subreport[] subreport;
    
    private PieChart[] pieChart;
    private Pie3DChart[] pie3DChart;
    private BarChart[] barChart;
    private Bar3DChart[] bar3DChart;
    private XyBarChart[] xyBarChart;
    private StackedBarChart[] stackedBarChart;
    private StackedBar3DChart[] stackedBar3DChart;
    private LineChart[] lineChart;
    private XyLineChart[] xyLineChart;
    private AreaChart[] areaChart;
    private XyAreaChart[] xyAreaChart;
    private ScatterChart[] scatterChart;
    private BubbleChart[] bubbleChart;
    private TimeSeriesChart[] timeSeriesChart;
    private HighLowChart[] highLowChart;
    private CandlestickChart[] candlestickChart;
    private MeterChart[] meterChart;
    private ThermometerChart[] thermometerChart;
    private MultiAxisChart[] multiAxisChart;
    private StackedAreaChart[] stackedAreaChart;
    private GanttChart[] ganttChart;
    private ElementGroup[] elementGroup;
    private Crosstab[] crosstab;
    private Frame[] frame;
    private ComponentElement[] componentElement;
    private GenericElement[] genericElement;

    private List<Object> breakOrLineOrRectangle;
    @XmlAttribute(name = "height")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    private String height;
    @XmlAttribute(name = "isSplitAllowed")
    private String isSplitAllowed;
    @XmlAttribute(name = "splitType")
    private String splitType;

    /**
     * Gets the value of the printWhenExpression property.
     * 
     * @return
     *     possible object is
     *     {@link PrintWhenExpression }
     *     
     */
    public PrintWhenExpression getPrintWhenExpression() {
        return printWhenExpression;
    }

    /**
     * Sets the value of the printWhenExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrintWhenExpression }
     *     
     */
    public void setPrintWhenExpression(PrintWhenExpression value) {
        this.printWhenExpression = value;
    }

    /**
     * Gets the value of the breakOrLineOrRectangle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the breakOrLineOrRectangle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBreakOrLineOrRectangle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Break }
     * {@link Line }
     * {@link Rectangle }
     * {@link Ellipse }
     * {@link Image }
     * {@link StaticText }
     * {@link TextField }
     * {@link Subreport }
     * {@link PieChart }
     * {@link Pie3DChart }
     * {@link BarChart }
     * {@link Bar3DChart }
     * {@link XyBarChart }
     * {@link StackedBarChart }
     * {@link StackedBar3DChart }
     * {@link LineChart }
     * {@link XyLineChart }
     * {@link AreaChart }
     * {@link XyAreaChart }
     * {@link ScatterChart }
     * {@link BubbleChart }
     * {@link TimeSeriesChart }
     * {@link HighLowChart }
     * {@link CandlestickChart }
     * {@link MeterChart }
     * {@link ThermometerChart }
     * {@link MultiAxisChart }
     * {@link StackedAreaChart }
     * {@link GanttChart }
     * {@link ElementGroup }
     * {@link Crosstab }
     * {@link Frame }
     * {@link ComponentElement }
     * {@link GenericElement }
     * 
     * 
     */
    public List<Object> getBreakOrLineOrRectangle() {
        if (breakOrLineOrRectangle == null) {
            breakOrLineOrRectangle = new ArrayList<Object>();
        }
        return this.breakOrLineOrRectangle;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        if (height == null) {
            return "0";
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the isSplitAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsSplitAllowed() {
        return isSplitAllowed;
    }

    /**
     * Sets the value of the isSplitAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsSplitAllowed(String value) {
        this.isSplitAllowed = value;
    }

    /**
     * Gets the value of the splitType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSplitType() {
        return splitType;
    }

    /**
     * Sets the value of the splitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSplitType(String value) {
        this.splitType = value;
    }

	public TextField[] getTextField() {
		return textField;
	}

	public void setTextField(TextField[] textField) {
		this.textField = textField;
	}

	public Rectangle[] getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle[] rectangle) {
		this.rectangle = rectangle;
	}

	public void setBreakOrLineOrRectangle(List<Object> breakOrLineOrRectangle) {
		this.breakOrLineOrRectangle = breakOrLineOrRectangle;
	}

	public Break[] getBreak1() {
		return break1;
	}

	public void setBreak1(Break[] break1) {
		this.break1 = break1;
	}

	public Line[] getLine() {
		return line;
	}

	public void setLine(Line[] line) {
		this.line = line;
	}

	public Ellipse[] getEllipse() {
		return ellipse;
	}

	public void setEllipse(Ellipse[] ellipse) {
		this.ellipse = ellipse;
	}

	public Image[] getImage() {
		return image;
	}

	public void setImage(Image[] image) {
		this.image = image;
	}

	public StaticText[] getStaticText() {
		return staticText;
	}

	public void setStaticText(StaticText[] staticText) {
		this.staticText = staticText;
	}

	public Subreport[] getSubreport() {
		return subreport;
	}

	public void setSubreport(Subreport[] subreport) {
		this.subreport = subreport;
	}

	public PieChart[] getPieChart() {
		return pieChart;
	}

	public void setPieChart(PieChart[] pieChart) {
		this.pieChart = pieChart;
	}

	public Pie3DChart[] getPie3DChart() {
		return pie3DChart;
	}

	public void setPie3DChart(Pie3DChart[] pie3dChart) {
		pie3DChart = pie3dChart;
	}

	public BarChart[] getBarChart() {
		return barChart;
	}

	public void setBarChart(BarChart[] barChart) {
		this.barChart = barChart;
	}

	public Bar3DChart[] getBar3DChart() {
		return bar3DChart;
	}

	public void setBar3DChart(Bar3DChart[] bar3dChart) {
		bar3DChart = bar3dChart;
	}

	public XyBarChart[] getXyBarChart() {
		return xyBarChart;
	}

	public void setXyBarChart(XyBarChart[] xyBarChart) {
		this.xyBarChart = xyBarChart;
	}

	public StackedBarChart[] getStackedBarChart() {
		return stackedBarChart;
	}

	public void setStackedBarChart(StackedBarChart[] stackedBarChart) {
		this.stackedBarChart = stackedBarChart;
	}

	public StackedBar3DChart[] getStackedBar3DChart() {
		return stackedBar3DChart;
	}

	public void setStackedBar3DChart(StackedBar3DChart[] stackedBar3DChart) {
		this.stackedBar3DChart = stackedBar3DChart;
	}

	public LineChart[] getLineChart() {
		return lineChart;
	}

	public void setLineChart(LineChart[] lineChart) {
		this.lineChart = lineChart;
	}

	public XyLineChart[] getXyLineChart() {
		return xyLineChart;
	}

	public void setXyLineChart(XyLineChart[] xyLineChart) {
		this.xyLineChart = xyLineChart;
	}

	public AreaChart[] getAreaChart() {
		return areaChart;
	}

	public void setAreaChart(AreaChart[] areaChart) {
		this.areaChart = areaChart;
	}

	public XyAreaChart[] getXyAreaChart() {
		return xyAreaChart;
	}

	public void setXyAreaChart(XyAreaChart[] xyAreaChart) {
		this.xyAreaChart = xyAreaChart;
	}

	public ScatterChart[] getScatterChart() {
		return scatterChart;
	}

	public void setScatterChart(ScatterChart[] scatterChart) {
		this.scatterChart = scatterChart;
	}

	public BubbleChart[] getBubbleChart() {
		return bubbleChart;
	}

	public void setBubbleChart(BubbleChart[] bubbleChart) {
		this.bubbleChart = bubbleChart;
	}

	public TimeSeriesChart[] getTimeSeriesChart() {
		return timeSeriesChart;
	}

	public void setTimeSeriesChart(TimeSeriesChart[] timeSeriesChart) {
		this.timeSeriesChart = timeSeriesChart;
	}

	public HighLowChart[] getHighLowChart() {
		return highLowChart;
	}

	public void setHighLowChart(HighLowChart[] highLowChart) {
		this.highLowChart = highLowChart;
	}

	public CandlestickChart[] getCandlestickChart() {
		return candlestickChart;
	}

	public void setCandlestickChart(CandlestickChart[] candlestickChart) {
		this.candlestickChart = candlestickChart;
	}

	public MeterChart[] getMeterChart() {
		return meterChart;
	}

	public void setMeterChart(MeterChart[] meterChart) {
		this.meterChart = meterChart;
	}

	public ThermometerChart[] getThermometerChart() {
		return thermometerChart;
	}

	public void setThermometerChart(ThermometerChart[] thermometerChart) {
		this.thermometerChart = thermometerChart;
	}

	public MultiAxisChart[] getMultiAxisChart() {
		return multiAxisChart;
	}

	public void setMultiAxisChart(MultiAxisChart[] multiAxisChart) {
		this.multiAxisChart = multiAxisChart;
	}

	public StackedAreaChart[] getStackedAreaChart() {
		return stackedAreaChart;
	}

	public void setStackedAreaChart(StackedAreaChart[] stackedAreaChart) {
		this.stackedAreaChart = stackedAreaChart;
	}

	public GanttChart[] getGanttChart() {
		return ganttChart;
	}

	public void setGanttChart(GanttChart[] ganttChart) {
		this.ganttChart = ganttChart;
	}

	public ElementGroup[] getElementGroup() {
		return elementGroup;
	}

	public void setElementGroup(ElementGroup[] elementGroup) {
		this.elementGroup = elementGroup;
	}

	public Crosstab[] getCrosstab() {
		return crosstab;
	}

	public void setCrosstab(Crosstab[] crosstab) {
		this.crosstab = crosstab;
	}

	public Frame[] getFrame() {
		return frame;
	}

	public void setFrame(Frame[] frame) {
		this.frame = frame;
	}

	public ComponentElement[] getComponentElement() {
		return componentElement;
	}

	public void setComponentElement(ComponentElement[] componentElement) {
		this.componentElement = componentElement;
	}

	public GenericElement[] getGenericElement() {
		return genericElement;
	}

	public void setGenericElement(GenericElement[] genericElement) {
		this.genericElement = genericElement;
	}

	public LabelValues[] getLabelValues() {
		return labelValues;
	}

	public void setLabelValues(LabelValues[] labelValues) {
		this.labelValues = labelValues;
	}

}
