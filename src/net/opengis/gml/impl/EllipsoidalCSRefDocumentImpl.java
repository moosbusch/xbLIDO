/*
 * An XML document type.
 * Localname: ellipsoidalCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidalCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ellipsoidalCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidalCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EllipsoidalCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidalCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDALCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidalCSRef");
    
    
    /**
     * Gets the "ellipsoidalCSRef" element
     */
    public net.opengis.gml.EllipsoidalCSRefType getEllipsoidalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().find_element_user(ELLIPSOIDALCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidalCSRef" element
     */
    @Inject(optional=true) public void setEllipsoidalCSRef(net.opengis.gml.EllipsoidalCSRefType ellipsoidalCSRef)
    {
        generatedSetterHelperImpl(ellipsoidalCSRef, ELLIPSOIDALCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidalCSRef" element
     */
    public net.opengis.gml.EllipsoidalCSRefType addNewEllipsoidalCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EllipsoidalCSRefType target = null;
            target = (net.opengis.gml.EllipsoidalCSRefType)get_store().add_element_user(ELLIPSOIDALCSREF$0);
            return target;
        }
    }
}
