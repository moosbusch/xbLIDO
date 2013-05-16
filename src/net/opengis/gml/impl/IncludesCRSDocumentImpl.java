/*
 * An XML document type.
 * Localname: includesCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.IncludesCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one includesCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class IncludesCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.IncludesCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public IncludesCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUDESCRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesCRS");
    
    
    /**
     * Gets the "includesCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getIncludesCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(INCLUDESCRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "includesCRS" element
     */
    @Inject(optional=true) public void setIncludesCRS(net.opengis.gml.CoordinateReferenceSystemRefType includesCRS)
    {
        generatedSetterHelperImpl(includesCRS, INCLUDESCRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "includesCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewIncludesCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(INCLUDESCRS$0);
            return target;
        }
    }
}
