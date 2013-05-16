/*
 * An XML document type.
 * Localname: _GeneralOperationParameter
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.GeneralOperationParameterDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one _GeneralOperationParameter(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeneralOperationParameterDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.GeneralOperationParameterDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeneralOperationParameterDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GENERALOPERATIONPARAMETER$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter");
    private static final org.apache.xmlbeans.QNameSet GENERALOPERATIONPARAMETER$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
    });
    
    
    /**
     * Gets the "_GeneralOperationParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterType getGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeneralOperationParameter" element
     */
    @Inject(optional=true) public void setGeneralOperationParameter(net.opengis.gml.AbstractGeneralOperationParameterType generalOperationParameter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().find_element_user(GENERALOPERATIONPARAMETER$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            }
            target.set(generalOperationParameter);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeneralOperationParameter" element
     */
    public net.opengis.gml.AbstractGeneralOperationParameterType addNewGeneralOperationParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeneralOperationParameterType target = null;
            target = (net.opengis.gml.AbstractGeneralOperationParameterType)get_store().add_element_user(GENERALOPERATIONPARAMETER$0);
            return target;
        }
    }
}
