/*
 * XML Type:  BaseUnitType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseUnitType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML BaseUnitType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class BaseUnitTypeImpl extends net.opengis.gml.impl.UnitDefinitionTypeImpl implements net.opengis.gml.BaseUnitType
{
    private static final long serialVersionUID = 1L;
    
    public BaseUnitTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITSSYSTEM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "unitsSystem");
    
    
    /**
     * Gets the "unitsSystem" element
     */
    public net.opengis.gml.ReferenceType getUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().find_element_user(UNITSSYSTEM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unitsSystem" element
     */
    @Inject(optional=true) public void setUnitsSystem(net.opengis.gml.ReferenceType unitsSystem)
    {
        generatedSetterHelperImpl(unitsSystem, UNITSSYSTEM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unitsSystem" element
     */
    public net.opengis.gml.ReferenceType addNewUnitsSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ReferenceType target = null;
            target = (net.opengis.gml.ReferenceType)get_store().add_element_user(UNITSSYSTEM$0);
            return target;
        }
    }
}
