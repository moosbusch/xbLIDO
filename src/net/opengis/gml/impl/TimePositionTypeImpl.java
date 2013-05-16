/*
 * XML Type:  TimePositionType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimePositionType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimePositionType(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 *     org.apache.xmlbeans.XmlTime
 *     org.apache.xmlbeans.XmlDateTime
 *     org.apache.xmlbeans.XmlAnyURI
 *     org.apache.xmlbeans.XmlDecimal
 */
public class TimePositionTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.TimePositionType, net.opengis.gml.CalDate, org.apache.xmlbeans.XmlTime, org.apache.xmlbeans.XmlDateTime, org.apache.xmlbeans.XmlAnyURI, org.apache.xmlbeans.XmlDecimal
{
    private static final long serialVersionUID = 1L;
    
    public TimePositionTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TimePositionTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName FRAME$0 = 
        new javax.xml.namespace.QName("", "frame");
    private static final javax.xml.namespace.QName CALENDARERANAME$2 = 
        new javax.xml.namespace.QName("", "calendarEraName");
    private static final javax.xml.namespace.QName INDETERMINATEPOSITION$4 = 
        new javax.xml.namespace.QName("", "indeterminatePosition");
    
    
    /**
     * Gets the "frame" attribute
     */
    public java.lang.String getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(FRAME$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public org.apache.xmlbeans.XmlAnyURI xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_default_attribute_value(FRAME$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$0) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    @Inject(optional=true) public void setFrame(java.lang.String frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$0);
            }
            target.setStringValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(org.apache.xmlbeans.XmlAnyURI frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlAnyURI target = null;
            target = (org.apache.xmlbeans.XmlAnyURI)get_store().find_attribute_user(FRAME$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlAnyURI)get_store().add_attribute_user(FRAME$0);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$0);
        }
    }
    
    /**
     * Gets the "calendarEraName" attribute
     */
    public java.lang.String getCalendarEraName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALENDARERANAME$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "calendarEraName" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCalendarEraName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CALENDARERANAME$2);
            return target;
        }
    }
    
    /**
     * True if has "calendarEraName" attribute
     */
    public boolean isSetCalendarEraName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CALENDARERANAME$2) != null;
        }
    }
    
    /**
     * Sets the "calendarEraName" attribute
     */
    @Inject(optional=true) public void setCalendarEraName(java.lang.String calendarEraName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CALENDARERANAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CALENDARERANAME$2);
            }
            target.setStringValue(calendarEraName);
        }
    }
    
    /**
     * Sets (as xml) the "calendarEraName" attribute
     */
    public void xsetCalendarEraName(org.apache.xmlbeans.XmlString calendarEraName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CALENDARERANAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CALENDARERANAME$2);
            }
            target.set(calendarEraName);
        }
    }
    
    /**
     * Unsets the "calendarEraName" attribute
     */
    public void unsetCalendarEraName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CALENDARERANAME$2);
        }
    }
    
    /**
     * Gets the "indeterminatePosition" attribute
     */
    public net.opengis.gml.TimeIndeterminateValueType.Enum getIndeterminatePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDETERMINATEPOSITION$4);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.TimeIndeterminateValueType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "indeterminatePosition" attribute
     */
    public net.opengis.gml.TimeIndeterminateValueType xgetIndeterminatePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIndeterminateValueType target = null;
            target = (net.opengis.gml.TimeIndeterminateValueType)get_store().find_attribute_user(INDETERMINATEPOSITION$4);
            return target;
        }
    }
    
    /**
     * True if has "indeterminatePosition" attribute
     */
    public boolean isSetIndeterminatePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INDETERMINATEPOSITION$4) != null;
        }
    }
    
    /**
     * Sets the "indeterminatePosition" attribute
     */
    @Inject(optional=true) public void setIndeterminatePosition(net.opengis.gml.TimeIndeterminateValueType.Enum indeterminatePosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INDETERMINATEPOSITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INDETERMINATEPOSITION$4);
            }
            target.setEnumValue(indeterminatePosition);
        }
    }
    
    /**
     * Sets (as xml) the "indeterminatePosition" attribute
     */
    public void xsetIndeterminatePosition(net.opengis.gml.TimeIndeterminateValueType indeterminatePosition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeIndeterminateValueType target = null;
            target = (net.opengis.gml.TimeIndeterminateValueType)get_store().find_attribute_user(INDETERMINATEPOSITION$4);
            if (target == null)
            {
                target = (net.opengis.gml.TimeIndeterminateValueType)get_store().add_attribute_user(INDETERMINATEPOSITION$4);
            }
            target.set(indeterminatePosition);
        }
    }
    
    /**
     * Unsets the "indeterminatePosition" attribute
     */
    public void unsetIndeterminatePosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INDETERMINATEPOSITION$4);
        }
    }
}
