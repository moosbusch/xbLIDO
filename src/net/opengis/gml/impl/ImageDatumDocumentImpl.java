/*
 * An XML document type.
 * Localname: ImageDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ImageDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one ImageDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ImageDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.ImageDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public ImageDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMAGEDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum");
    
    
    /**
     * Gets the "ImageDatum" element
     */
    public net.opengis.gml.ImageDatumType getImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumType target = null;
            target = (net.opengis.gml.ImageDatumType)get_store().find_element_user(IMAGEDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ImageDatum" element
     */
    @Inject(optional=true) public void setImageDatum(net.opengis.gml.ImageDatumType imageDatum)
    {
        generatedSetterHelperImpl(imageDatum, IMAGEDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "ImageDatum" element
     */
    public net.opengis.gml.ImageDatumType addNewImageDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ImageDatumType target = null;
            target = (net.opengis.gml.ImageDatumType)get_store().add_element_user(IMAGEDATUM$0);
            return target;
        }
    }
}
