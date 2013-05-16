/*
 * An XML document type.
 * Localname: usesEngineeringDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UsesEngineeringDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one usesEngineeringDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UsesEngineeringDatumDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UsesEngineeringDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public UsesEngineeringDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESENGINEERINGDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEngineeringDatum");
    
    
    /**
     * Gets the "usesEngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumRefType getUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumRefType target = null;
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().find_element_user(USESENGINEERINGDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesEngineeringDatum" element
     */
    @Inject(optional=true) public void setUsesEngineeringDatum(net.opengis.gml.EngineeringDatumRefType usesEngineeringDatum)
    {
        generatedSetterHelperImpl(usesEngineeringDatum, USESENGINEERINGDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesEngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumRefType addNewUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumRefType target = null;
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().add_element_user(USESENGINEERINGDATUM$0);
            return target;
        }
    }
}
