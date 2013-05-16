/*
 * An XML document type.
 * Localname: baseCRS
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.BaseCRSDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one baseCRS(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BaseCRSDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.BaseCRSDocument
{
    private static final long serialVersionUID = 1L;
    
    public BaseCRSDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASECRS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "baseCRS");
    
    
    /**
     * Gets the "baseCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType getBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().find_element_user(BASECRS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "baseCRS" element
     */
    @Inject(optional=true) public void setBaseCRS(net.opengis.gml.CoordinateReferenceSystemRefType baseCRS)
    {
        generatedSetterHelperImpl(baseCRS, BASECRS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "baseCRS" element
     */
    public net.opengis.gml.CoordinateReferenceSystemRefType addNewBaseCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateReferenceSystemRefType target = null;
            target = (net.opengis.gml.CoordinateReferenceSystemRefType)get_store().add_element_user(BASECRS$0);
            return target;
        }
    }
}
