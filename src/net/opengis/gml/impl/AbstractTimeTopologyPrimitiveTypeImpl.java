/*
 * XML Type:  AbstractTimeTopologyPrimitiveType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractTimeTopologyPrimitiveType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractTimeTopologyPrimitiveType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractTimeTopologyPrimitiveTypeImpl extends net.opengis.gml.impl.AbstractTimePrimitiveTypeImpl implements net.opengis.gml.AbstractTimeTopologyPrimitiveType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractTimeTopologyPrimitiveTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "complex");
    
    
    /**
     * Gets the "complex" element
     */
    public net.opengis.gml.ReferenceType getComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(COMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "complex" element
     */
    public boolean isSetComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLEX$0) != 0;
        }
    }
    
    /**
     * Sets the "complex" element
     */
    @Inject(optional=true) public void setComplex(net.opengis.gml.ReferenceType complex)
    {
        generatedSetterHelperImpl(complex, COMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "complex" element
     */
    public net.opengis.gml.ReferenceType addNewComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(COMPLEX$0);
            return target;
        }
    }
    
    /**
     * Unsets the "complex" element
     */
    public void unsetComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLEX$0, 0);
        }
    }
}
