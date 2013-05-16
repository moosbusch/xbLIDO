/*
 * XML Type:  ObservationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ObservationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML ObservationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ObservationTypeImpl extends net.opengis.gml.impl.AbstractFeatureTypeImpl implements net.opengis.gml.ObservationType
{
    private static final long serialVersionUID = 1L;
    
    public ObservationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validTime");
    private static final javax.xml.namespace.QName USING$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "using");
    private static final javax.xml.namespace.QName TARGET$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "target");
    private static final org.apache.xmlbeans.QNameSet TARGET$5 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "target"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "subject"),
    });
    private static final javax.xml.namespace.QName RESULTOF$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "resultOf");
    
    
    /**
     * Gets the "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    @Inject(optional=true) public void setValidTime(net.opengis.gml.TimePrimitivePropertyType validTime)
    {
        generatedSetterHelperImpl(validTime, VALIDTIME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public net.opengis.gml.TimePrimitivePropertyType addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TimePrimitivePropertyType target = null;
            target = (net.opengis.gml.TimePrimitivePropertyType)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Gets the "using" element
     */
    public net.opengis.gml.FeaturePropertyType getUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().find_element_user(USING$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "using" element
     */
    public boolean isSetUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USING$2) != 0;
        }
    }
    
    /**
     * Sets the "using" element
     */
    @Inject(optional=true) public void setUsing(net.opengis.gml.FeaturePropertyType using)
    {
        generatedSetterHelperImpl(using, USING$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "using" element
     */
    public net.opengis.gml.FeaturePropertyType addNewUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FeaturePropertyType target = null;
            target = (net.opengis.gml.FeaturePropertyType)get_store().add_element_user(USING$2);
            return target;
        }
    }
    
    /**
     * Unsets the "using" element
     */
    public void unsetUsing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USING$2, 0);
        }
    }
    
    /**
     * Gets the "target" element
     */
    public net.opengis.gml.TargetPropertyType getTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().find_element_user(TARGET$5, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "target" element
     */
    public boolean isSetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGET$5) != 0;
        }
    }
    
    /**
     * Sets the "target" element
     */
    @Inject(optional=true) public void setTarget(net.opengis.gml.TargetPropertyType targetValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().find_element_user(TARGET$5, 0);
            if (target == null)
            {
                target = (net.opengis.gml.TargetPropertyType)get_store().add_element_user(TARGET$4);
            }
            target.set(targetValue);
        }
    }
    
    /**
     * Appends and returns a new empty "target" element
     */
    public net.opengis.gml.TargetPropertyType addNewTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TargetPropertyType target = null;
            target = (net.opengis.gml.TargetPropertyType)get_store().add_element_user(TARGET$4);
            return target;
        }
    }
    
    /**
     * Unsets the "target" element
     */
    public void unsetTarget()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGET$5, 0);
        }
    }
    
    /**
     * Gets the "resultOf" element
     */
    public net.opengis.gml.AssociationType getResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(RESULTOF$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultOf" element
     */
    @Inject(optional=true) public void setResultOf(net.opengis.gml.AssociationType resultOf)
    {
        generatedSetterHelperImpl(resultOf, RESULTOF$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultOf" element
     */
    public net.opengis.gml.AssociationType addNewResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(RESULTOF$6);
            return target;
        }
    }
}
