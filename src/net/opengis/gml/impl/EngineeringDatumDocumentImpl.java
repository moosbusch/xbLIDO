/*
 * An XML document type.
 * Localname: EngineeringDatum
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EngineeringDatumDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one EngineeringDatum(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class EngineeringDatumDocumentImpl extends net.opengis.gml.impl.DatumDocumentImpl implements net.opengis.gml.EngineeringDatumDocument
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringDatumDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENGINEERINGDATUM$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum");
    
    
    /**
     * Gets the "EngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumType getEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumType target = null;
            target = (net.opengis.gml.EngineeringDatumType)get_store().find_element_user(ENGINEERINGDATUM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "EngineeringDatum" element
     */
    @Inject(optional=true) public void setEngineeringDatum(net.opengis.gml.EngineeringDatumType engineeringDatum)
    {
        generatedSetterHelperImpl(engineeringDatum, ENGINEERINGDATUM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "EngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumType addNewEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumType target = null;
            target = (net.opengis.gml.EngineeringDatumType)get_store().add_element_user(ENGINEERINGDATUM$0);
            return target;
        }
    }
}
