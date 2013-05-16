/*
 * An XML document type.
 * Localname: topoVolumeProperty
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoVolumePropertyDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one topoVolumeProperty(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoVolumePropertyDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoVolumePropertyDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumePropertyDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOVOLUMEPROPERTY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "topoVolumeProperty");
    
    
    /**
     * Gets the "topoVolumeProperty" element
     */
    public net.opengis.gml.TopoVolumePropertyType getTopoVolumeProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumePropertyType target = null;
            target = (net.opengis.gml.TopoVolumePropertyType)get_store().find_element_user(TOPOVOLUMEPROPERTY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "topoVolumeProperty" element
     */
    @Inject(optional=true) public void setTopoVolumeProperty(net.opengis.gml.TopoVolumePropertyType topoVolumeProperty)
    {
        generatedSetterHelperImpl(topoVolumeProperty, TOPOVOLUMEPROPERTY$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "topoVolumeProperty" element
     */
    public net.opengis.gml.TopoVolumePropertyType addNewTopoVolumeProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumePropertyType target = null;
            target = (net.opengis.gml.TopoVolumePropertyType)get_store().add_element_user(TOPOVOLUMEPROPERTY$0);
            return target;
        }
    }
}
