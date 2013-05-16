/*
 * XML Type:  AbstractDatumBaseType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AbstractDatumBaseType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML AbstractDatumBaseType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractDatumBaseTypeImpl extends net.opengis.gml.impl.DefinitionTypeImpl implements net.opengis.gml.AbstractDatumBaseType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDatumBaseTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUMNAME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumName");
    
    
    /**
     * Gets the "datumName" element
     */
    public net.opengis.gml.CodeType getDatumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(DATUMNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "datumName" element
     */
    @Inject(optional=true) public void setDatumName(net.opengis.gml.CodeType datumName)
    {
        generatedSetterHelperImpl(datumName, DATUMNAME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "datumName" element
     */
    public net.opengis.gml.CodeType addNewDatumName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(DATUMNAME$0);
            return target;
        }
    }
}
