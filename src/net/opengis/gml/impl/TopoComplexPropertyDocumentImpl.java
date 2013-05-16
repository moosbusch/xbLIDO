/*
 * An XML document type.
 * Localname: topoComplexProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoComplexPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoComplexProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoComplexPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoComplexPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoComplexPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCOMPLEXPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoComplexProperty");
    
    
    /**
     * Gets the "topoComplexProperty" element
     */
    public net.opengis.gml.TopoComplexMemberType getTopoComplexProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().find_element_user(TOPOCOMPLEXPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoComplexProperty" element
     */
    @Inject(optional=true) public void setTopoComplexProperty(net.opengis.gml.TopoComplexMemberType topoComplexProperty)
    {
        generatedSetterHelperImpl(topoComplexProperty, TOPOCOMPLEXPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoComplexProperty" element
     */
    public net.opengis.gml.TopoComplexMemberType addNewTopoComplexProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoComplexMemberType target = null;
            target = (net.opengis.gml.TopoComplexMemberType)get_store().add_element_user(TOPOCOMPLEXPROPERTY$0);
            return target;
        }
    }
}
