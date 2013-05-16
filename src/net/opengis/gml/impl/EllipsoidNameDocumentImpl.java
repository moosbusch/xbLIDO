/*
 * An XML document type.
 * Localname: ellipsoidName
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EllipsoidNameDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ellipsoidName(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EllipsoidNameDocumentImpl extends net.opengis.gml.impl.NameDocumentImpl implements net.opengis.gml.EllipsoidNameDocument
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidName");
    
    
    /**
     * Gets the "ellipsoidName" element
     */
    public net.opengis.gml.CodeType getEllipsoidName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(ELLIPSOIDNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ellipsoidName" element
     */
    @Inject(optional=true) public void setEllipsoidName(net.opengis.gml.CodeType ellipsoidName)
    {
        generatedSetterHelperImpl(ellipsoidName, ELLIPSOIDNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ellipsoidName" element
     */
    public net.opengis.gml.CodeType addNewEllipsoidName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(ELLIPSOIDNAME$0);
            return target;
        }
    }
}
