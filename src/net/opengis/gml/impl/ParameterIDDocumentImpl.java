/*
 * An XML document type.
 * Localname: parameterID
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParameterIDDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one parameterID(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ParameterIDDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ParameterIDDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterIDDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterID");
    
    
    /**
     * Gets the "parameterID" element
     */
    public net.opengis.gml.IdentifierType getParameterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(PARAMETERID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterID" element
     */
    @Inject(optional=true) public void setParameterID(net.opengis.gml.IdentifierType parameterID)
    {
        generatedSetterHelperImpl(parameterID, PARAMETERID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameterID" element
     */
    public net.opengis.gml.IdentifierType addNewParameterID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(PARAMETERID$0);
            return target;
        }
    }
}