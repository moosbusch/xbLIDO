/*
 * XML Type:  KnotType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.KnotType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML KnotType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class KnotTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.KnotType
{
    private static final long serialVersionUID = 1L;
    
    public KnotTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "value");
    private static final javax.xml.namespace.QName MULTIPLICITY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiplicity");
    private static final javax.xml.namespace.QName WEIGHT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "weight");
    
    
    /**
     * Gets the "value" element
     */
    public double getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" element
     */
    public org.apache.xmlbeans.XmlDouble xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "value" element
     */
    @Inject(optional=true) public void setValue(double value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setDoubleValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" element
     */
    public void xsetValue(org.apache.xmlbeans.XmlDouble value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Gets the "multiplicity" element
     */
    public java.math.BigInteger getMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLICITY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "multiplicity" element
     */
    public org.apache.xmlbeans.XmlNonNegativeInteger xgetMultiplicity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MULTIPLICITY$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "multiplicity" element
     */
    @Inject(optional=true) public void setMultiplicity(java.math.BigInteger multiplicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MULTIPLICITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MULTIPLICITY$2);
            }
            target.setBigIntegerValue(multiplicity);
        }
    }
    
    /**
     * Sets (as xml) the "multiplicity" element
     */
    public void xsetMultiplicity(org.apache.xmlbeans.XmlNonNegativeInteger multiplicity)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNonNegativeInteger target = null;
            target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().find_element_user(MULTIPLICITY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNonNegativeInteger)get_store().add_element_user(MULTIPLICITY$2);
            }
            target.set(multiplicity);
        }
    }
    
    /**
     * Gets the "weight" element
     */
    public double getWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "weight" element
     */
    public org.apache.xmlbeans.XmlDouble xgetWeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHT$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "weight" element
     */
    @Inject(optional=true) public void setWeight(double weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(WEIGHT$4);
            }
            target.setDoubleValue(weight);
        }
    }
    
    /**
     * Sets (as xml) the "weight" element
     */
    public void xsetWeight(org.apache.xmlbeans.XmlDouble weight)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(WEIGHT$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(WEIGHT$4);
            }
            target.set(weight);
        }
    }
}
