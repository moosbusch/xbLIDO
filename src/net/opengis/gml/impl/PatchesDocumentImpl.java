/*
 * An XML document type.
 * Localname: patches
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PatchesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one patches(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PatchesDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.PatchesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "patches");
    private static final org.apache.xmlbeans.QNameSet PATCHES$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "patches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "trianglePatches"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonPatches"),
    });
    
    
    /**
     * Gets the "patches" element
     */
    public net.opengis.gml.SurfacePatchArrayPropertyType getPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "patches" element
     */
    @Inject(optional=true) public void setPatches(net.opengis.gml.SurfacePatchArrayPropertyType patches)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().find_element_user(PATCHES$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            }
            target.set(patches);
        }
    }
    
    /**
     * Appends and returns a new empty "patches" element
     */
    public net.opengis.gml.SurfacePatchArrayPropertyType addNewPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePatchArrayPropertyType target = null;
            target = (net.opengis.gml.SurfacePatchArrayPropertyType)get_store().add_element_user(PATCHES$0);
            return target;
        }
    }
}
