/*
 * An XML document type.
 * Localname: Bag
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BagDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Bag(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BagDocumentImpl extends net.opengis.gml.impl.GMLDocumentImpl implements net.opengis.gml.BagDocument
{
    private static final long serialVersionUID = 1L;
    
    public BagDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BAG$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bag");
    
    
    /**
     * Gets the "Bag" element
     */
    public net.opengis.gml.BagType getBag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BagType target = null;
            target = (net.opengis.gml.BagType)get_store().find_element_user(BAG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Bag" element
     */
    @Inject(optional=true) public void setBag(net.opengis.gml.BagType bag)
    {
        generatedSetterHelperImpl(bag, BAG$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Bag" element
     */
    public net.opengis.gml.BagType addNewBag()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BagType target = null;
            target = (net.opengis.gml.BagType)get_store().add_element_user(BAG$0);
            return target;
        }
    }
}
