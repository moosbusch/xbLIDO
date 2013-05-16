/*
 * An XML document type.
 * Localname: conversionToPreferredUnit
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ConversionToPreferredUnitDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one conversionToPreferredUnit(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ConversionToPreferredUnitDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ConversionToPreferredUnitDocument
{
    private static final long serialVersionUID = 1L;
    
    public ConversionToPreferredUnitDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONVERSIONTOPREFERREDUNIT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "conversionToPreferredUnit");
    
    
    /**
     * Gets the "conversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType getConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().find_element_user(CONVERSIONTOPREFERREDUNIT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "conversionToPreferredUnit" element
     */
    @Inject(optional=true) public void setConversionToPreferredUnit(net.opengis.gml.ConversionToPreferredUnitType conversionToPreferredUnit)
    {
        generatedSetterHelperImpl(conversionToPreferredUnit, CONVERSIONTOPREFERREDUNIT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "conversionToPreferredUnit" element
     */
    public net.opengis.gml.ConversionToPreferredUnitType addNewConversionToPreferredUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ConversionToPreferredUnitType target = null;
            target = (net.opengis.gml.ConversionToPreferredUnitType)get_store().add_element_user(CONVERSIONTOPREFERREDUNIT$0);
            return target;
        }
    }
}
