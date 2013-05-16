/*
 * An XML document type.
 * Localname: imageCRSRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ImageCRSRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one imageCRSRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ImageCRSRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ImageCRSRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageCRSRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGECRSREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "imageCRSRef");
    
    
    /**
     * Gets the "imageCRSRef" element
     */
    public net.opengis.gml.ImageCRSRefType getImageCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageCRSRefType target = null;
            target = (net.opengis.gml.ImageCRSRefType)get_store().find_element_user(IMAGECRSREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "imageCRSRef" element
     */
    @Inject(optional=true) public void setImageCRSRef(net.opengis.gml.ImageCRSRefType imageCRSRef)
    {
        generatedSetterHelperImpl(imageCRSRef, IMAGECRSREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "imageCRSRef" element
     */
    public net.opengis.gml.ImageCRSRefType addNewImageCRSRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageCRSRefType target = null;
            target = (net.opengis.gml.ImageCRSRefType)get_store().add_element_user(IMAGECRSREF$0);
            return target;
        }
    }
}