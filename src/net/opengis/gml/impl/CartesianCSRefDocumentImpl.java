/*
 * An XML document type.
 * Localname: cartesianCSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CartesianCSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one cartesianCSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CartesianCSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.CartesianCSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "cartesianCSRef");
    
    
    /**
     * Gets the "cartesianCSRef" element
     */
    public net.opengis.gml.CartesianCSRefType getCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().find_element_user(CARTESIANCSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cartesianCSRef" element
     */
    @Inject(optional=true) public void setCartesianCSRef(net.opengis.gml.CartesianCSRefType cartesianCSRef)
    {
        generatedSetterHelperImpl(cartesianCSRef, CARTESIANCSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "cartesianCSRef" element
     */
    public net.opengis.gml.CartesianCSRefType addNewCartesianCSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSRefType target = null;
            target = (net.opengis.gml.CartesianCSRefType)get_store().add_element_user(CARTESIANCSREF$0);
            return target;
        }
    }
}
