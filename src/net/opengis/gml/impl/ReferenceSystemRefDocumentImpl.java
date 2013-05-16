/*
 * An XML document type.
 * Localname: referenceSystemRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ReferenceSystemRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one referenceSystemRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ReferenceSystemRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ReferenceSystemRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ReferenceSystemRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCESYSTEMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "referenceSystemRef");
    
    
    /**
     * Gets the "referenceSystemRef" element
     */
    public net.opengis.gml.ReferenceSystemRefType getReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceSystemRefType target = null;
            target = (net.opengis.gml.ReferenceSystemRefType)get_store().find_element_user(REFERENCESYSTEMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "referenceSystemRef" element
     */
    @Inject(optional=true) public void setReferenceSystemRef(net.opengis.gml.ReferenceSystemRefType referenceSystemRef)
    {
        generatedSetterHelperImpl(referenceSystemRef, REFERENCESYSTEMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "referenceSystemRef" element
     */
    public net.opengis.gml.ReferenceSystemRefType addNewReferenceSystemRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceSystemRefType target = null;
            target = (net.opengis.gml.ReferenceSystemRefType)get_store().add_element_user(REFERENCESYSTEMREF$0);
            return target;
        }
    }
}
