/*
 * An XML document type.
 * Localname: crsRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CrsRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one crsRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CrsRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CrsRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CrsRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "crsRef");
    
    
    /**
     * Gets the "crsRef" element
     */
    public net.opengis.gml.CRSRefType getCrsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().find_element_user(CRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "crsRef" element
     */
    @Inject(optional=true) public void setCrsRef(net.opengis.gml.CRSRefType crsRef)
    {
        generatedSetterHelperImpl(crsRef, CRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "crsRef" element
     */
    public net.opengis.gml.CRSRefType addNewCrsRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().add_element_user(CRSREF$0);
            return target;
        }
    }
}
