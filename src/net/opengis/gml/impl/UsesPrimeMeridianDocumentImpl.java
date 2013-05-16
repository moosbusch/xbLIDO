/*
 * An XML document type.
 * Localname: usesPrimeMeridian
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesPrimeMeridianDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesPrimeMeridian(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesPrimeMeridianDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesPrimeMeridianDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesPrimeMeridianDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESPRIMEMERIDIAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesPrimeMeridian");
    
    
    /**
     * Gets the "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType getUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().find_element_user(USESPRIMEMERIDIAN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesPrimeMeridian" element
     */
    @Inject(optional=true) public void setUsesPrimeMeridian(net.opengis.gml.PrimeMeridianRefType usesPrimeMeridian)
    {
        generatedSetterHelperImpl(usesPrimeMeridian, USESPRIMEMERIDIAN$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesPrimeMeridian" element
     */
    public net.opengis.gml.PrimeMeridianRefType addNewUsesPrimeMeridian()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PrimeMeridianRefType target = null;
            target = (net.opengis.gml.PrimeMeridianRefType)get_store().add_element_user(USESPRIMEMERIDIAN$0);
            return target;
        }
    }
}
