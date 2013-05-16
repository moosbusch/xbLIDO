/*
 * An XML document type.
 * Localname: superComplex
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SuperComplexDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one superComplex(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SuperComplexDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SuperComplexDocument
{
    private static final long serialVersionUID = 1L;
    
    public SuperComplexDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUPERCOMPLEX$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "superComplex");
    
    
    /**
     * Gets the "superComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType getSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(SUPERCOMPLEX$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "superComplex" element
     */
    @Inject(optional=true) public void setSuperComplex(net.opengis.gml.TopoComplexMemberType superComplex)
    {
        generatedSetterHelperImpl(superComplex, SUPERCOMPLEX$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "superComplex" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewSuperComplex()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(SUPERCOMPLEX$0);
            return target;
        }
    }
}
