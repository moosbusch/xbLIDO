/*
 * An XML document type.
 * Localname: AffinePlacement
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.AffinePlacementDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one AffinePlacement(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class AffinePlacementDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.AffinePlacementDocument
{
    private static final long serialVersionUID = 1L;
    
    public AffinePlacementDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName AFFINEPLACEMENT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "AffinePlacement");
    
    
    /**
     * Gets the "AffinePlacement" element
     */
    public net.opengis.gml.AffinePlacementType getAffinePlacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AffinePlacementType target = null;
            target = (net.opengis.gml.AffinePlacementType)get_store().find_element_user(AFFINEPLACEMENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "AffinePlacement" element
     */
    @Inject(optional=true) public void setAffinePlacement(net.opengis.gml.AffinePlacementType affinePlacement)
    {
        generatedSetterHelperImpl(affinePlacement, AFFINEPLACEMENT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "AffinePlacement" element
     */
    public net.opengis.gml.AffinePlacementType addNewAffinePlacement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AffinePlacementType target = null;
            target = (net.opengis.gml.AffinePlacementType)get_store().add_element_user(AFFINEPLACEMENT$0);
            return target;
        }
    }
}
