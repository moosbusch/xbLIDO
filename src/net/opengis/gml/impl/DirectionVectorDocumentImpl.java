/*
 * An XML document type.
 * Localname: DirectionVector
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.DirectionVectorDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one DirectionVector(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class DirectionVectorDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.DirectionVectorDocument
{
    private static final long serialVersionUID = 1L;
    
    public DirectionVectorDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIRECTIONVECTOR$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectionVector");
    
    
    /**
     * Gets the "DirectionVector" element
     */
    public net.opengis.gml.DirectionVectorType getDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionVectorType target = null;
            target = (net.opengis.gml.DirectionVectorType)get_store().find_element_user(DIRECTIONVECTOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "DirectionVector" element
     */
    @Inject(optional=true) public void setDirectionVector(net.opengis.gml.DirectionVectorType directionVector)
    {
        generatedSetterHelperImpl(directionVector, DIRECTIONVECTOR$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "DirectionVector" element
     */
    public net.opengis.gml.DirectionVectorType addNewDirectionVector()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.DirectionVectorType target = null;
            target = (net.opengis.gml.DirectionVectorType)get_store().add_element_user(DIRECTIONVECTOR$0);
            return target;
        }
    }
}
