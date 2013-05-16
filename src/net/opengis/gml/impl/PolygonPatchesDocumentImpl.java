/*
 * An XML document type.
 * Localname: polygonPatches
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PolygonPatchesDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one polygonPatches(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class PolygonPatchesDocumentImpl extends net.opengis.gml.impl.PatchesDocumentImpl implements net.opengis.gml.PolygonPatchesDocument
{
    private static final long serialVersionUID = 1L;
    
    public PolygonPatchesDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName POLYGONPATCHES$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "polygonPatches");
    
    
    /**
     * Gets the "polygonPatches" element
     */
    public net.opengis.gml.PolygonPatchArrayPropertyType getPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchArrayPropertyType target = null;
            target = (net.opengis.gml.PolygonPatchArrayPropertyType)get_store().find_element_user(POLYGONPATCHES$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "polygonPatches" element
     */
    @Inject(optional=true) public void setPolygonPatches(net.opengis.gml.PolygonPatchArrayPropertyType polygonPatches)
    {
        generatedSetterHelperImpl(polygonPatches, POLYGONPATCHES$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "polygonPatches" element
     */
    public net.opengis.gml.PolygonPatchArrayPropertyType addNewPolygonPatches()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.PolygonPatchArrayPropertyType target = null;
            target = (net.opengis.gml.PolygonPatchArrayPropertyType)get_store().add_element_user(POLYGONPATCHES$0);
            return target;
        }
    }
}
