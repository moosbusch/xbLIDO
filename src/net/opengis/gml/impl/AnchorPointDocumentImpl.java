/*
 * An XML document type.
 * Localname: anchorPoint
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AnchorPointDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one anchorPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AnchorPointDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AnchorPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public AnchorPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ANCHORPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "anchorPoint");
    
    
    /**
     * Gets the "anchorPoint" element
     */
    public net.opengis.gml.CodeType getAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(ANCHORPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "anchorPoint" element
     */
    @Inject(optional=true) public void setAnchorPoint(net.opengis.gml.CodeType anchorPoint)
    {
        generatedSetterHelperImpl(anchorPoint, ANCHORPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "anchorPoint" element
     */
    public net.opengis.gml.CodeType addNewAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(ANCHORPOINT$0);
            return target;
        }
    }
}
