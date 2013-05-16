/*
 * An XML document type.
 * Localname: BaseUnit
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one BaseUnit(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BaseUnitDocumentImpl extends net.opengis.gml.impl.UnitDefinitionDocumentImpl implements net.opengis.gml.BaseUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit");
    
    
    /**
     * Gets the "BaseUnit" element
     */
    public net.opengis.gml.BaseUnitType getBaseUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BaseUnitType target = null;
            target = (net.opengis.gml.BaseUnitType)get_store().find_element_user(BASEUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BaseUnit" element
     */
    @Inject(optional=true) public void setBaseUnit(net.opengis.gml.BaseUnitType baseUnit)
    {
        generatedSetterHelperImpl(baseUnit, BASEUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "BaseUnit" element
     */
    public net.opengis.gml.BaseUnitType addNewBaseUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BaseUnitType target = null;
            target = (net.opengis.gml.BaseUnitType)get_store().add_element_user(BASEUNIT$0);
            return target;
        }
    }
}
