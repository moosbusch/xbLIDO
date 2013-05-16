/*
 * An XML document type.
 * Localname: CartesianCS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CartesianCSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CartesianCS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CartesianCSDocumentImpl extends net.opengis.gml.impl.CoordinateSystemDocumentImpl implements net.opengis.gml.CartesianCSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CartesianCSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CARTESIANCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS");
    
    
    /**
     * Gets the "CartesianCS" element
     */
    public net.opengis.gml.CartesianCSType getCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSType target = null;
            target = (net.opengis.gml.CartesianCSType)get_store().find_element_user(CARTESIANCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CartesianCS" element
     */
    @Inject(optional=true) public void setCartesianCS(net.opengis.gml.CartesianCSType cartesianCS)
    {
        generatedSetterHelperImpl(cartesianCS, CARTESIANCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CartesianCS" element
     */
    public net.opengis.gml.CartesianCSType addNewCartesianCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CartesianCSType target = null;
            target = (net.opengis.gml.CartesianCSType)get_store().add_element_user(CARTESIANCS$0);
            return target;
        }
    }
}
