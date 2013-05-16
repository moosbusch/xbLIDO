/*
 * An XML document type.
 * Localname: imageDatumRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ImageDatumRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one imageDatumRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ImageDatumRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ImageDatumRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageDatumRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEDATUMREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "imageDatumRef");
    
    
    /**
     * Gets the "imageDatumRef" element
     */
    public net.opengis.gml.ImageDatumRefType getImageDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().find_element_user(IMAGEDATUMREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imageDatumRef" element
     */
    @Inject(optional=true) public void setImageDatumRef(net.opengis.gml.ImageDatumRefType imageDatumRef)
    {
        generatedSetterHelperImpl(imageDatumRef, IMAGEDATUMREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "imageDatumRef" element
     */
    public net.opengis.gml.ImageDatumRefType addNewImageDatumRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumRefType target = null;
            target = (net.opengis.gml.ImageDatumRefType)get_store().add_element_user(IMAGEDATUMREF$0);
            return target;
        }
    }
}
