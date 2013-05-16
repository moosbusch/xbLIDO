/*
 * An XML document type.
 * Localname: MappingRule
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MappingRuleDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one MappingRule(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MappingRuleDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MappingRuleDocument
{
    private static final long serialVersionUID = 1L;
    
    public MappingRuleDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MAPPINGRULE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MappingRule");
    
    
    /**
     * Gets the "MappingRule" element
     */
    public net.opengis.gml.StringOrRefType getMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(MAPPINGRULE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "MappingRule" element
     */
    @Inject(optional=true) public void setMappingRule(net.opengis.gml.StringOrRefType mappingRule)
    {
        generatedSetterHelperImpl(mappingRule, MAPPINGRULE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MappingRule" element
     */
    public net.opengis.gml.StringOrRefType addNewMappingRule()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(MAPPINGRULE$0);
            return target;
        }
    }
}
