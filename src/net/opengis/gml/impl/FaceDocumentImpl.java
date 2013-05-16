/*
 * An XML document type.
 * Localname: Face
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.FaceDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Face(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class FaceDocumentImpl extends net.opengis.gml.impl.TopoPrimitiveDocumentImpl implements net.opengis.gml.FaceDocument
{
    private static final long serialVersionUID = 1L;
    
    public FaceDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FACE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face");
    
    
    /**
     * Gets the "Face" element
     */
    public net.opengis.gml.FaceType getFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FaceType target = null;
            target = (net.opengis.gml.FaceType)get_store().find_element_user(FACE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Face" element
     */
    @Inject(optional=true) public void setFace(net.opengis.gml.FaceType face)
    {
        generatedSetterHelperImpl(face, FACE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Face" element
     */
    public net.opengis.gml.FaceType addNewFace()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.FaceType target = null;
            target = (net.opengis.gml.FaceType)get_store().add_element_user(FACE$0);
            return target;
        }
    }
}
