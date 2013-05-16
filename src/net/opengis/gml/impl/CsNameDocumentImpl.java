/*
 * An XML document type.
 * Localname: csName
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CsNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one csName(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CsNameDocumentImpl extends net.opengis.gml.impl.NameDocumentImpl implements net.opengis.gml.CsNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public CsNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CSNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "csName");
    
    
    /**
     * Gets the "csName" element
     */
    public net.opengis.gml.CodeType getCsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(CSNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "csName" element
     */
    @Inject(optional=true) public void setCsName(net.opengis.gml.CodeType csName)
    {
        generatedSetterHelperImpl(csName, CSNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "csName" element
     */
    public net.opengis.gml.CodeType addNewCsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(CSNAME$0);
            return target;
        }
    }
}
