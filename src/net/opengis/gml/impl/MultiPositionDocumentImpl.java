/*
 * An XML document type.
 * Localname: multiPosition
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiPositionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiPosition(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiPositionDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiPositionDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiPositionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIPOSITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiPosition");
    
    
    /**
     * Gets the "multiPosition" element
     */
    public net.opengis.gml.MultiPointPropertyType getMultiPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().find_element_user(MULTIPOSITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiPosition" element
     */
    @Inject(optional=true) public void setMultiPosition(net.opengis.gml.MultiPointPropertyType multiPosition)
    {
        generatedSetterHelperImpl(multiPosition, MULTIPOSITION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiPosition" element
     */
    public net.opengis.gml.MultiPointPropertyType addNewMultiPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiPointPropertyType target = null;
            target = (net.opengis.gml.MultiPointPropertyType)get_store().add_element_user(MULTIPOSITION$0);
            return target;
        }
    }
}
