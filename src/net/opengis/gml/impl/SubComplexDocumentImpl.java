/*
 * An XML document type.
 * Localname: subComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SubComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one subComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SubComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SubComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public SubComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUBCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "subComplex");
    
    
    /**
     * Gets the "subComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(SUBCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "subComplex" element
     */
    @Inject(optional=true) public void setSubComplex(net.opengis.gml.TopoComplexMemberType subComplex)
    {
        generatedSetterHelperImpl(subComplex, SUBCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "subComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewSubComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(SUBCOMPLEX$0);
            return target;
        }
    }
}
