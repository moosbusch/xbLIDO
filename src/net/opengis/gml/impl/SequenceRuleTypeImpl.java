/*
 * XML Type:  SequenceRuleType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SequenceRuleType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML SequenceRuleType(@http://www.opengis.net/gml).
 *
 * This is an atomic type that is a restriction of net.opengis.gml.SequenceRuleType.
 */
public class SequenceRuleTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements net.opengis.gml.SequenceRuleType
{
    private static final long serialVersionUID = 1L;
    
    public SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, true);
    }
    
    protected SequenceRuleTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    
    private static final javax.xml.namespace.QName ORDER$0 = 
        new javax.xml.namespace.QName("", "order");
    
    
    /**
     * Gets the "order" attribute
     */
    public net.opengis.gml.IncrementOrder.Enum getOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.IncrementOrder.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "order" attribute
     */
    public net.opengis.gml.IncrementOrder xgetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IncrementOrder target = null;
            target = (net.opengis.gml.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            return target;
        }
    }
    
    /**
     * True if has "order" attribute
     */
    public boolean isSetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ORDER$0) != null;
        }
    }
    
    /**
     * Sets the "order" attribute
     */
    @Inject(optional=true) public void setOrder(net.opengis.gml.IncrementOrder.Enum order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ORDER$0);
            }
            target.setEnumValue(order);
        }
    }
    
    /**
     * Sets (as xml) the "order" attribute
     */
    public void xsetOrder(net.opengis.gml.IncrementOrder order)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IncrementOrder target = null;
            target = (net.opengis.gml.IncrementOrder)get_store().find_attribute_user(ORDER$0);
            if (target == null)
            {
                target = (net.opengis.gml.IncrementOrder)get_store().add_attribute_user(ORDER$0);
            }
            target.set(order);
        }
    }
    
    /**
     * Unsets the "order" attribute
     */
    public void unsetOrder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ORDER$0);
        }
    }
}
