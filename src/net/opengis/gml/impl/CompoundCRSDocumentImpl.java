/*
 * An XML document type.
 * Localname: CompoundCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CompoundCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one CompoundCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CompoundCRSDocumentImpl extends net.opengis.gml.impl.CRSDocumentImpl implements net.opengis.gml.CompoundCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public CompoundCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMPOUNDCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS");
    
    
    /**
     * Gets the "CompoundCRS" element
     */
    public net.opengis.gml.CompoundCRSType getCompoundCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompoundCRSType target = null;
            target = (net.opengis.gml.CompoundCRSType)get_store().find_element_user(COMPOUNDCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "CompoundCRS" element
     */
    @Inject(optional=true) public void setCompoundCRS(net.opengis.gml.CompoundCRSType compoundCRS)
    {
        generatedSetterHelperImpl(compoundCRS, COMPOUNDCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "CompoundCRS" element
     */
    public net.opengis.gml.CompoundCRSType addNewCompoundCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompoundCRSType target = null;
            target = (net.opengis.gml.CompoundCRSType)get_store().add_element_user(COMPOUNDCRS$0);
            return target;
        }
    }
}
