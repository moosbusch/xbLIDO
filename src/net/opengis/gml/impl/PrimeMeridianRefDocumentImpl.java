/*
 * An XML document type.
 * Localname: primeMeridianRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PrimeMeridianRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one primeMeridianRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PrimeMeridianRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PrimeMeridianRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRIMEMERIDIANREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "primeMeridianRef");
    
    
    /**
     * Gets the "primeMeridianRef" element
     */
    public net.opengis.gml.PrimeMeridianRefType getPrimeMeridianRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().find_element_user(PRIMEMERIDIANREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "primeMeridianRef" element
     */
    @Inject(optional=true) public void setPrimeMeridianRef(net.opengis.gml.PrimeMeridianRefType primeMeridianRef)
    {
        generatedSetterHelperImpl(primeMeridianRef, PRIMEMERIDIANREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "primeMeridianRef" element
     */
    public net.opengis.gml.PrimeMeridianRefType addNewPrimeMeridianRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().add_element_user(PRIMEMERIDIANREF$0);
            return target;
        }
    }
}
