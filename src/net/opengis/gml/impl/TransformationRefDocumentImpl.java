/*
 * An XML document type.
 * Localname: transformationRef
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.TransformationRefDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one transformationRef(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TransformationRefDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TransformationRefDocument
{
    private static final long serialVersionUID = 1L;
    
    public TransformationRefDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRANSFORMATIONREF$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "transformationRef");
    
    
    /**
     * Gets the "transformationRef" element
     */
    public net.opengis.gml.TransformationRefType getTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TransformationRefType target = null;
            target = (net.opengis.gml.TransformationRefType)get_store().find_element_user(TRANSFORMATIONREF$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "transformationRef" element
     */
    @Inject(optional=true) public void setTransformationRef(net.opengis.gml.TransformationRefType transformationRef)
    {
        generatedSetterHelperImpl(transformationRef, TRANSFORMATIONREF$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "transformationRef" element
     */
    public net.opengis.gml.TransformationRefType addNewTransformationRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TransformationRefType target = null;
            target = (net.opengis.gml.TransformationRefType)get_store().add_element_user(TRANSFORMATIONREF$0);
            return target;
        }
    }
}
