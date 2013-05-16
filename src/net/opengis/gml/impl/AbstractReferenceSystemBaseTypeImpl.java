/*
 * XML Type:  AbstractReferenceSystemBaseType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractReferenceSystemBaseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractReferenceSystemBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractReferenceSystemBaseTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.AbstractReferenceSystemBaseType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractReferenceSystemBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SRSNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "srsName");
    
    
    /**
     * Gets the "srsName" element
     */
    public net.opengis.gml.CodeType getSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(SRSNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "srsName" element
     */
    @Inject(optional=true) public void setSrsName(net.opengis.gml.CodeType srsName)
    {
        generatedSetterHelperImpl(srsName, SRSNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "srsName" element
     */
    public net.opengis.gml.CodeType addNewSrsName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(SRSNAME$0);
            return target;
        }
    }
}
