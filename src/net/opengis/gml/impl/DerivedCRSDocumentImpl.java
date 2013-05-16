/*
 * An XML document type.
 * Localname: DerivedCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DerivedCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DerivedCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DerivedCRSDocumentImpl extends net.opengis.gml.impl.GeneralDerivedCRSDocumentImpl implements net.opengis.gml.DerivedCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public DerivedCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DERIVEDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS");
    
    
    /**
     * Gets the "DerivedCRS" element
     */
    public net.opengis.gml.DerivedCRSType getDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSType target = null;
            target = (net.opengis.gml.DerivedCRSType)get_store().find_element_user(DERIVEDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DerivedCRS" element
     */
    @Inject(optional=true) public void setDerivedCRS(net.opengis.gml.DerivedCRSType derivedCRS)
    {
        generatedSetterHelperImpl(derivedCRS, DERIVEDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DerivedCRS" element
     */
    public net.opengis.gml.DerivedCRSType addNewDerivedCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DerivedCRSType target = null;
            target = (net.opengis.gml.DerivedCRSType)get_store().add_element_user(DERIVEDCRS$0);
            return target;
        }
    }
}
