/*
 * An XML document type.
 * Localname: Transformation
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TransformationDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Transformation(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TransformationDocumentImpl extends net.opengis.gml.impl.GeneralTransformationDocumentImpl implements net.opengis.gml.TransformationDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformationDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation");
    
    
    /**
     * Gets the "Transformation" element
     */
    public net.opengis.gml.TransformationType getTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TransformationType target = null;
            target = (net.opengis.gml.TransformationType)get_store().find_element_user(TRANSFORMATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Transformation" element
     */
    @Inject(optional=true) public void setTransformation(net.opengis.gml.TransformationType transformation)
    {
        generatedSetterHelperImpl(transformation, TRANSFORMATION$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Transformation" element
     */
    public net.opengis.gml.TransformationType addNewTransformation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TransformationType target = null;
            target = (net.opengis.gml.TransformationType)get_store().add_element_user(TRANSFORMATION$0);
            return target;
        }
    }
}
