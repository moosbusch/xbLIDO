/*
 * An XML document type.
 * Localname: parameterValueGroup
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ParameterValueGroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one parameterValueGroup(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ParameterValueGroupDocumentImpl extends net.opengis.gml.impl.GeneralParameterValueDocumentImpl implements net.opengis.gml.ParameterValueGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public ParameterValueGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARAMETERVALUEGROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "parameterValueGroup");
    
    
    /**
     * Gets the "parameterValueGroup" element
     */
    public net.opengis.gml.ParameterValueGroupType getParameterValueGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueGroupType target = null;
            target = (net.opengis.gml.ParameterValueGroupType)get_store().find_element_user(PARAMETERVALUEGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "parameterValueGroup" element
     */
    @Inject(optional=true) public void setParameterValueGroup(net.opengis.gml.ParameterValueGroupType parameterValueGroup)
    {
        generatedSetterHelperImpl(parameterValueGroup, PARAMETERVALUEGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "parameterValueGroup" element
     */
    public net.opengis.gml.ParameterValueGroupType addNewParameterValueGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ParameterValueGroupType target = null;
            target = (net.opengis.gml.ParameterValueGroupType)get_store().add_element_user(PARAMETERVALUEGROUP$0);
            return target;
        }
    }
}
