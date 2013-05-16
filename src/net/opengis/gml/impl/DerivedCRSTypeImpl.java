/*
 * XML Type:  DerivedCRSType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DerivedCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML DerivedCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class DerivedCRSTypeImpl extends net.opengis.gml.impl.AbstractGeneralDerivedCRSTypeImpl implements net.opengis.gml.DerivedCRSType
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRSTYPE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "derivedCRSType");
    private static final javax.xml.namespace.QName USESCS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCS");
    
    
    /**
     * Gets the "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType getDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().find_element_user(DERIVEDCRSTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "derivedCRSType" element
     */
    @Inject(optional=true) public void setDerivedCRSType(net.opengis.gml.DerivedCRSTypeType derivedCRSType)
    {
        generatedSetterHelperImpl(derivedCRSType, DERIVEDCRSTYPE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "derivedCRSType" element
     */
    public net.opengis.gml.DerivedCRSTypeType addNewDerivedCRSType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSTypeType target = null;
            target = (net.opengis.gml.DerivedCRSTypeType)get_store().add_element_user(DERIVEDCRSTYPE$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(USESCS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCS" element
     */
    @Inject(optional=true) public void setUsesCS(net.opengis.gml.CoordinateSystemRefType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType addNewUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(USESCS$2);
            return target;
        }
    }
}
