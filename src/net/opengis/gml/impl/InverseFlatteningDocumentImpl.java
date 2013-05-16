/*
 * An XML document type.
 * Localname: inverseFlattening
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.InverseFlatteningDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one inverseFlattening(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class InverseFlatteningDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.InverseFlatteningDocument
{
    private static final long serialVersionUID = 1L;
    
    public InverseFlatteningDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INVERSEFLATTENING$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "inverseFlattening");
    
    
    /**
     * Gets the "inverseFlattening" element
     */
    public net.opengis.gml.MeasureType getInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(INVERSEFLATTENING$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "inverseFlattening" element
     */
    @Inject(optional=true) public void setInverseFlattening(net.opengis.gml.MeasureType inverseFlattening)
    {
        generatedSetterHelperImpl(inverseFlattening, INVERSEFLATTENING$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "inverseFlattening" element
     */
    public net.opengis.gml.MeasureType addNewInverseFlattening()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(INVERSEFLATTENING$0);
            return target;
        }
    }
}
