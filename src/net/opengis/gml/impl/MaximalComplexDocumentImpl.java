/*
 * An XML document type.
 * Localname: maximalComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MaximalComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one maximalComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MaximalComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MaximalComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public MaximalComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAXIMALCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "maximalComplex");
    
    
    /**
     * Gets the "maximalComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(MAXIMALCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "maximalComplex" element
     */
    @Inject(optional=true) public void setMaximalComplex(net.opengis.gml.TopoComplexMemberType maximalComplex)
    {
        generatedSetterHelperImpl(maximalComplex, MAXIMALCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "maximalComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewMaximalComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(MAXIMALCOMPLEX$0);
            return target;
        }
    }
}
