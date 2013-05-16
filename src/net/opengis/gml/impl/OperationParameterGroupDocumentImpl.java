/*
 * An XML document type.
 * Localname: OperationParameterGroup
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.OperationParameterGroupDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one OperationParameterGroup(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class OperationParameterGroupDocumentImpl extends net.opengis.gml.impl.GeneralOperationParameterDocumentImpl implements net.opengis.gml.OperationParameterGroupDocument
{
    private static final long serialVersionUID = 1L;
    
    public OperationParameterGroupDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATIONPARAMETERGROUP$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup");
    
    
    /**
     * Gets the "OperationParameterGroup" element
     */
    public net.opengis.gml.OperationParameterGroupType getOperationParameterGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterGroupType target = null;
            target = (net.opengis.gml.OperationParameterGroupType)get_store().find_element_user(OPERATIONPARAMETERGROUP$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "OperationParameterGroup" element
     */
    @Inject(optional=true) public void setOperationParameterGroup(net.opengis.gml.OperationParameterGroupType operationParameterGroup)
    {
        generatedSetterHelperImpl(operationParameterGroup, OPERATIONPARAMETERGROUP$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "OperationParameterGroup" element
     */
    public net.opengis.gml.OperationParameterGroupType addNewOperationParameterGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationParameterGroupType target = null;
            target = (net.opengis.gml.OperationParameterGroupType)get_store().add_element_user(OPERATIONPARAMETERGROUP$0);
            return target;
        }
    }
}
