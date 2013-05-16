/*
 * An XML document type.
 * Localname: extentOf
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ExtentOfDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one extentOf(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ExtentOfDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ExtentOfDocument
{
    private static final long serialVersionUID = 1L;
    
    public ExtentOfDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXTENTOF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "extentOf");
    
    
    /**
     * Gets the "extentOf" element
     */
    public net.opengis.gml.SurfacePropertyType getExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().find_element_user(EXTENTOF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "extentOf" element
     */
    @Inject(optional=true) public void setExtentOf(net.opengis.gml.SurfacePropertyType extentOf)
    {
        generatedSetterHelperImpl(extentOf, EXTENTOF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "extentOf" element
     */
    public net.opengis.gml.SurfacePropertyType addNewExtentOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SurfacePropertyType target = null;
            target = (net.opengis.gml.SurfacePropertyType)get_store().add_element_user(EXTENTOF$0);
            return target;
        }
    }
}
