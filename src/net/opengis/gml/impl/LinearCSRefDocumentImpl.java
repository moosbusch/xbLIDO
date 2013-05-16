/*
 * An XML document type.
 * Localname: linearCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.LinearCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one linearCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class LinearCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.LinearCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public LinearCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINEARCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "linearCSRef");
    
    
    /**
     * Gets the "linearCSRef" element
     */
    public net.opengis.gml.LinearCSRefType getLinearCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LinearCSRefType target = null;
            target = (net.opengis.gml.LinearCSRefType)get_store().find_element_user(LINEARCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "linearCSRef" element
     */
    @Inject(optional=true) public void setLinearCSRef(net.opengis.gml.LinearCSRefType linearCSRef)
    {
        generatedSetterHelperImpl(linearCSRef, LINEARCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "linearCSRef" element
     */
    public net.opengis.gml.LinearCSRefType addNewLinearCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.LinearCSRefType target = null;
            target = (net.opengis.gml.LinearCSRefType)get_store().add_element_user(LINEARCSREF$0);
            return target;
        }
    }
}
