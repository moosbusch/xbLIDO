/*
 * An XML document type.
 * Localname: secondDefiningParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.SecondDefiningParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one secondDefiningParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class SecondDefiningParameterDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.SecondDefiningParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public SecondDefiningParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "secondDefiningParameter");
    
    
    /**
     * Gets the "secondDefiningParameter" element
     */
    public net.opengis.gml.SecondDefiningParameterType getSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SecondDefiningParameterType target = null;
            target = (net.opengis.gml.SecondDefiningParameterType)get_store().find_element_user(SECONDDEFININGPARAMETER$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "secondDefiningParameter" element
     */
    @Inject(optional=true) public void setSecondDefiningParameter(net.opengis.gml.SecondDefiningParameterType secondDefiningParameter)
    {
        generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "secondDefiningParameter" element
     */
    public net.opengis.gml.SecondDefiningParameterType addNewSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SecondDefiningParameterType target = null;
            target = (net.opengis.gml.SecondDefiningParameterType)get_store().add_element_user(SECONDDEFININGPARAMETER$0);
            return target;
        }
    }
}
