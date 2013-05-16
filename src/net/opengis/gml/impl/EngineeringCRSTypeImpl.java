/*
 * XML Type:  EngineeringCRSType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.EngineeringCRSType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML EngineeringCRSType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EngineeringCRSTypeImpl extends net.opengis.gml.impl.AbstractReferenceSystemTypeImpl implements net.opengis.gml.EngineeringCRSType
{
    private static final long serialVersionUID = 1L;
    
    public EngineeringCRSTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESCS$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesCS");
    private static final javax.xml.namespace.QName USESENGINEERINGDATUM$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesEngineeringDatum");
    
    
    /**
     * Gets the "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType getUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().find_element_user(USESCS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesCS" element
     */
    @Inject(optional=true) public void setUsesCS(net.opengis.gml.CoordinateSystemRefType usesCS)
    {
        generatedSetterHelperImpl(usesCS, USESCS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesCS" element
     */
    public net.opengis.gml.CoordinateSystemRefType addNewUsesCS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CoordinateSystemRefType target = null;
            target = (net.opengis.gml.CoordinateSystemRefType)get_store().add_element_user(USESCS$0);
            return target;
        }
    }
    
    /**
     * Gets the "usesEngineeringDatum" element
     */
    public net.opengis.gml.EngineeringDatumRefType getUsesEngineeringDatum()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.EngineeringDatumRefType target = null;
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().find_element_user(USESENGINEERINGDATUM$2, 0);
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
        generatedSetterHelperImpl(usesEngineeringDatum, USESENGINEERINGDATUM$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.EngineeringDatumRefType)get_store().add_element_user(USESENGINEERINGDATUM$2);
            return target;
        }
    }
}
