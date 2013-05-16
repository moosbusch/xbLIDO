/*
 * An XML document type.
 * Localname: resultOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ResultOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one resultOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ResultOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ResultOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ResultOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName RESULTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "resultOf");
    
    
    /**
     * Gets the "resultOf" element
     */
    public net.opengis.gml.AssociationType getResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().find_element_user(RESULTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "resultOf" element
     */
    @Inject(optional=true) public void setResultOf(net.opengis.gml.AssociationType resultOf)
    {
        generatedSetterHelperImpl(resultOf, RESULTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "resultOf" element
     */
    public net.opengis.gml.AssociationType addNewResultOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AssociationType target = null;
            target = (net.opengis.gml.AssociationType)get_store().add_element_user(RESULTOF$0);
            return target;
        }
    }
}
