/*
 * An XML document type.
 * Localname: UnitDefinition
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UnitDefinitionDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one UnitDefinition(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UnitDefinitionDocumentImpl extends net.opengis.gml.impl.DefinitionDocumentImpl implements net.opengis.gml.UnitDefinitionDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitDefinitionDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITDEFINITION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition");
    private static final org.apache.xmlbeans.QNameSet UNITDEFINITION$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
    });
    
    
    /**
     * Gets the "UnitDefinition" element
     */
    public net.opengis.gml.UnitDefinitionType getUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "UnitDefinition" element
     */
    @Inject(optional=true) public void setUnitDefinition(net.opengis.gml.UnitDefinitionType unitDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().find_element_user(UNITDEFINITION$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            }
            target.set(unitDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "UnitDefinition" element
     */
    public net.opengis.gml.UnitDefinitionType addNewUnitDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitDefinitionType target = null;
            target = (net.opengis.gml.UnitDefinitionType)get_store().add_element_user(UNITDEFINITION$0);
            return target;
        }
    }
}
