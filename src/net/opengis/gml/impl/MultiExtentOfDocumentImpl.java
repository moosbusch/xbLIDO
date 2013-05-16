/*
 * An XML document type.
 * Localname: multiExtentOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.MultiExtentOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one multiExtentOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class MultiExtentOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.MultiExtentOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public MultiExtentOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MULTIEXTENTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "multiExtentOf");
    
    
    /**
     * Gets the "multiExtentOf" element
     */
    public net.opengis.gml.MultiSurfacePropertyType getMultiExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().find_element_user(MULTIEXTENTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "multiExtentOf" element
     */
    @Inject(optional=true) public void setMultiExtentOf(net.opengis.gml.MultiSurfacePropertyType multiExtentOf)
    {
        generatedSetterHelperImpl(multiExtentOf, MULTIEXTENTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "multiExtentOf" element
     */
    public net.opengis.gml.MultiSurfacePropertyType addNewMultiExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MultiSurfacePropertyType target = null;
            target = (net.opengis.gml.MultiSurfacePropertyType)get_store().add_element_user(MULTIEXTENTOF$0);
            return target;
        }
    }
}
