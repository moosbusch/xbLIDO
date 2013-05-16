/*
 * An XML document type.
 * Localname: targetCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TargetCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one targetCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TargetCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TargetCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public TargetCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TARGETCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "targetCRS");
    
    
    /**
     * Gets the "targetCRS" element
     */
    public net.opengis.gml.CRSRefType getTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().find_element_user(TARGETCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "targetCRS" element
     */
    @Inject(optional=true) public void setTargetCRS(net.opengis.gml.CRSRefType targetCRS)
    {
        generatedSetterHelperImpl(targetCRS, TARGETCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    public net.opengis.gml.CRSRefType addNewTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().add_element_user(TARGETCRS$0);
            return target;
        }
    }
}
