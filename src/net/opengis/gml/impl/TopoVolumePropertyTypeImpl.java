/*
 * XML Type:  TopoVolumePropertyType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TopoVolumePropertyType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML TopoVolumePropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoVolumePropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoVolumePropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TopoVolumePropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOVOLUME$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoVolume");
    
    
    /**
     * Gets the "TopoVolume" element
     */
    public net.opengis.gml.TopoVolumeType getTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumeType target = null;
            target = (net.opengis.gml.TopoVolumeType)get_store().find_element_user(TOPOVOLUME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoVolume" element
     */
    @Inject(optional=true) public void setTopoVolume(net.opengis.gml.TopoVolumeType topoVolume)
    {
        generatedSetterHelperImpl(topoVolume, TOPOVOLUME$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoVolume" element
     */
    public net.opengis.gml.TopoVolumeType addNewTopoVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoVolumeType target = null;
            target = (net.opengis.gml.TopoVolumeType)get_store().add_element_user(TOPOVOLUME$0);
            return target;
        }
    }
}
