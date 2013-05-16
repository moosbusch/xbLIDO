/*
 * An XML document type.
 * Localname: Clothoid
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.ClothoidDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one Clothoid(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ClothoidDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ClothoidDocument
{
    private static final long serialVersionUID = 1L;
    
    public ClothoidDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLOTHOID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Clothoid");
    
    
    /**
     * Gets the "Clothoid" element
     */
    public net.opengis.gml.ClothoidType getClothoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ClothoidType target = null;
            target = (net.opengis.gml.ClothoidType)get_store().find_element_user(CLOTHOID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Clothoid" element
     */
    @Inject(optional=true) public void setClothoid(net.opengis.gml.ClothoidType clothoid)
    {
        generatedSetterHelperImpl(clothoid, CLOTHOID$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Clothoid" element
     */
    public net.opengis.gml.ClothoidType addNewClothoid()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ClothoidType target = null;
            target = (net.opengis.gml.ClothoidType)get_store().add_element_user(CLOTHOID$0);
            return target;
        }
    }
}
