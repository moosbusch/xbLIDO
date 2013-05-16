/*
 * An XML document type.
 * Localname: topoPointProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoPointPropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoPointProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoPointPropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPointPropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointPropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPOINTPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoPointProperty");
    
    
    /**
     * Gets the "topoPointProperty" element
     */
    public net.opengis.gml.TopoPointPropertyType getTopoPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointPropertyType target = null;
            target = (net.opengis.gml.TopoPointPropertyType)get_store().find_element_user(TOPOPOINTPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoPointProperty" element
     */
    @Inject(optional=true) public void setTopoPointProperty(net.opengis.gml.TopoPointPropertyType topoPointProperty)
    {
        generatedSetterHelperImpl(topoPointProperty, TOPOPOINTPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoPointProperty" element
     */
    public net.opengis.gml.TopoPointPropertyType addNewTopoPointProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointPropertyType target = null;
            target = (net.opengis.gml.TopoPointPropertyType)get_store().add_element_user(TOPOPOINTPROPERTY$0);
            return target;
        }
    }
}
