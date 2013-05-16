/*
 * An XML document type.
 * Localname: ellipsoidRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ellipsoidRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EllipsoidRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidRef");
    
    
    /**
     * Gets the "ellipsoidRef" element
     */
    public net.opengis.gml.EllipsoidRefType getEllipsoidRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().find_element_user(ELLIPSOIDREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidRef" element
     */
    @Inject(optional=true) public void setEllipsoidRef(net.opengis.gml.EllipsoidRefType ellipsoidRef)
    {
        generatedSetterHelperImpl(ellipsoidRef, ELLIPSOIDREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidRef" element
     */
    public net.opengis.gml.EllipsoidRefType addNewEllipsoidRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidRefType target = null;
            target = (net.opengis.gml.EllipsoidRefType)get_store().add_element_user(ELLIPSOIDREF$0);
            return target;
        }
    }
}
