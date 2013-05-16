/*
 * XML Type:  SecondDefiningParameterType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SecondDefiningParameterType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML SecondDefiningParameterType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class SecondDefiningParameterTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SecondDefiningParameterType
{
    private static final long serialVersionUID = 1L;
    
    public SecondDefiningParameterTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVERSEFLATTENING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "inverseFlattening");
    private static final javax.xml.namespace.QName SEMIMINORAXIS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "semiMinorAxis");
    private static final javax.xml.namespace.QName ISSPHERE$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "isSphere");
    
    
    /**
     * Gets the "inverseFlattening" element
     */
    public net.opengis.gml.MeasureType getInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(INVERSEFLATTENING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "inverseFlattening" element
     */
    public boolean isSetInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVERSEFLATTENING$0) != 0;
        }
    }
    
    /**
     * Sets the "inverseFlattening" element
     */
    @Inject(optional=true) public void setInverseFlattening(net.opengis.gml.MeasureType inverseFlattening)
    {
        generatedSetterHelperImpl(inverseFlattening, INVERSEFLATTENING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inverseFlattening" element
     */
    public net.opengis.gml.MeasureType addNewInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(INVERSEFLATTENING$0);
            return target;
        }
    }
    
    /**
     * Unsets the "inverseFlattening" element
     */
    public void unsetInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVERSEFLATTENING$0, 0);
        }
    }
    
    /**
     * Gets the "semiMinorAxis" element
     */
    public net.opengis.gml.MeasureType getSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(SEMIMINORAXIS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "semiMinorAxis" element
     */
    public boolean isSetSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEMIMINORAXIS$2) != 0;
        }
    }
    
    /**
     * Sets the "semiMinorAxis" element
     */
    @Inject(optional=true) public void setSemiMinorAxis(net.opengis.gml.MeasureType semiMinorAxis)
    {
        generatedSetterHelperImpl(semiMinorAxis, SEMIMINORAXIS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMinorAxis" element
     */
    public net.opengis.gml.MeasureType addNewSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(SEMIMINORAXIS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "semiMinorAxis" element
     */
    public void unsetSemiMinorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEMIMINORAXIS$2, 0);
        }
    }
    
    /**
     * Gets the "isSphere" element
     */
    public net.opengis.gml.IsSphereDocument.IsSphere.Enum getIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$4, 0);
            if (target == null)
            {
                return null;
            }
            return (net.opengis.gml.IsSphereDocument.IsSphere.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "isSphere" element
     */
    public net.opengis.gml.IsSphereDocument.IsSphere xgetIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsSphereDocument.IsSphere target = null;
            target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().find_element_user(ISSPHERE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "isSphere" element
     */
    public boolean isSetIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSPHERE$4) != 0;
        }
    }
    
    /**
     * Sets the "isSphere" element
     */
    @Inject(optional=true) public void setIsSphere(net.opengis.gml.IsSphereDocument.IsSphere.Enum isSphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSPHERE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSPHERE$4);
            }
            target.setEnumValue(isSphere);
        }
    }
    
    /**
     * Sets (as xml) the "isSphere" element
     */
    public void xsetIsSphere(net.opengis.gml.IsSphereDocument.IsSphere isSphere)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IsSphereDocument.IsSphere target = null;
            target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().find_element_user(ISSPHERE$4, 0);
            if (target == null)
            {
                target = (net.opengis.gml.IsSphereDocument.IsSphere)get_store().add_element_user(ISSPHERE$4);
            }
            target.set(isSphere);
        }
    }
    
    /**
     * Unsets the "isSphere" element
     */
    public void unsetIsSphere()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSPHERE$4, 0);
        }
    }
}
