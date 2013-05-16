/*
 * XML Type:  TimeIntervalLengthType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TimeIntervalLengthType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TimeIntervalLengthType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.TimeIntervalLengthType.
 */
public class TimeIntervalLengthTypeImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements net.opengis.gml.TimeIntervalLengthType
{
    private static final long serialVersionUID = 1L;
    
    public TimeIntervalLengthTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected TimeIntervalLengthTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName UNIT$0 = 
        new javax.xml.namespace.QName("", "unit");
    private static final javax.xml.namespace.QName RADIX$2 = 
        new javax.xml.namespace.QName("", "radix");
    private static final javax.xml.namespace.QName FACTOR$4 = 
        new javax.xml.namespace.QName("", "factor");
    
    
    /**
     * Gets the "unit" attribute
     */
    public java.lang.String getUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "unit" attribute
     */
    public net.opengis.gml.TimeUnitType xgetUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeUnitType target = null;
            target = (net.opengis.gml.TimeUnitType)get_store().find_attribute_user(UNIT$0);
            return target;
        }
    }
    
    /**
     * Sets the "unit" attribute
     */
    @Inject(optional=true) public void setUnit(java.lang.String unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNIT$0);
            }
            target.setStringValue(unit);
        }
    }
    
    /**
     * Sets (as xml) the "unit" attribute
     */
    public void xsetUnit(net.opengis.gml.TimeUnitType unit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimeUnitType target = null;
            target = (net.opengis.gml.TimeUnitType)get_store().find_attribute_user(UNIT$0);
            if (target == null)
            {
                target = (net.opengis.gml.TimeUnitType)get_store().add_attribute_user(UNIT$0);
            }
            target.set(unit);
        }
    }
    
    /**
     * Gets the "radix" attribute
     */
    public java.math.BigInteger getRadix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIX$2);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "radix" attribute
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetRadix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(RADIX$2);
            return target;
        }
    }
    
    /**
     * True if has "radix" attribute
     */
    public boolean isSetRadix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RADIX$2) != null;
        }
    }
    
    /**
     * Sets the "radix" attribute
     */
    @Inject(optional=true) public void setRadix(java.math.BigInteger radix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RADIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RADIX$2);
            }
            target.setBigIntegerValue(radix);
        }
    }
    
    /**
     * Sets (as xml) the "radix" attribute
     */
    public void xsetRadix(org.apache.xmlbeans.XmlPositiveInteger radix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_attribute_user(RADIX$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_attribute_user(RADIX$2);
            }
            target.set(radix);
        }
    }
    
    /**
     * Unsets the "radix" attribute
     */
    public void unsetRadix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RADIX$2);
        }
    }
    
    /**
     * Gets the "factor" attribute
     */
    public java.math.BigInteger getFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTOR$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "factor" attribute
     */
    public org.apache.xmlbeans.XmlInteger xgetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FACTOR$4);
            return target;
        }
    }
    
    /**
     * True if has "factor" attribute
     */
    public boolean isSetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FACTOR$4) != null;
        }
    }
    
    /**
     * Sets the "factor" attribute
     */
    @Inject(optional=true) public void setFactor(java.math.BigInteger factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FACTOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FACTOR$4);
            }
            target.setBigIntegerValue(factor);
        }
    }
    
    /**
     * Sets (as xml) the "factor" attribute
     */
    public void xsetFactor(org.apache.xmlbeans.XmlInteger factor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_attribute_user(FACTOR$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInteger)get_store().add_attribute_user(FACTOR$4);
            }
            target.set(factor);
        }
    }
    
    /**
     * Unsets the "factor" attribute
     */
    public void unsetFactor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FACTOR$4);
        }
    }
}
