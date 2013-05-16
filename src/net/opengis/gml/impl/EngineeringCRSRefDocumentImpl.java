/*
 * An XML document type.
 * Localname: engineeringCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EngineeringCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one engineeringCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EngineeringCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.EngineeringCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGCRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "engineeringCRSRef");
    
    
    /**
     * Gets the "engineeringCRSRef" element
     */
    public net.opengis.gml.EngineeringCRSRefType getEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringCRSRefType target = null;
            target = (net.opengis.gml.EngineeringCRSRefType)get_store().find_element_user(ENGINEERINGCRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "engineeringCRSRef" element
     */
    @Inject(optional=true) public void setEngineeringCRSRef(net.opengis.gml.EngineeringCRSRefType engineeringCRSRef)
    {
        generatedSetterHelperImpl(engineeringCRSRef, ENGINEERINGCRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "engineeringCRSRef" element
     */
    public net.opengis.gml.EngineeringCRSRefType addNewEngineeringCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringCRSRefType target = null;
            target = (net.opengis.gml.EngineeringCRSRefType)get_store().add_element_user(ENGINEERINGCRSREF$0);
            return target;
        }
    }
}
