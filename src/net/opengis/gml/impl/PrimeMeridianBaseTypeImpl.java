/*
 * XML Type:  PrimeMeridianBaseType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PrimeMeridianBaseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PrimeMeridianBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PrimeMeridianBaseTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.PrimeMeridianBaseType
{
    private static final long serialVersionUID = 1L;
    
    public PrimeMeridianBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MERIDIANNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "meridianName");
    
    
    /**
     * Gets the "meridianName" element
     */
    public net.opengis.gml.CodeType getMeridianName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(MERIDIANNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "meridianName" element
     */
    @Inject(optional=true) public void setMeridianName(net.opengis.gml.CodeType meridianName)
    {
        generatedSetterHelperImpl(meridianName, MERIDIANNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "meridianName" element
     */
    public net.opengis.gml.CodeType addNewMeridianName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(MERIDIANNAME$0);
            return target;
        }
    }
}
