/*
 * An XML document type.
 * Localname: unitOfMeasure
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.UnitOfMeasureDocument
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * A document containing one unitOfMeasure(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class UnitOfMeasureDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.UnitOfMeasureDocument
{
    private static final long serialVersionUID = 1L;
    
    public UnitOfMeasureDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITOFMEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "unitOfMeasure");
    
    
    /**
     * Gets the "unitOfMeasure" element
     */
    public net.opengis.gml.UnitOfMeasureType getUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitOfMeasureType target = null;
            target = (net.opengis.gml.UnitOfMeasureType)get_store().find_element_user(UNITOFMEASURE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "unitOfMeasure" element
     */
    @Inject(optional=true) public void setUnitOfMeasure(net.opengis.gml.UnitOfMeasureType unitOfMeasure)
    {
        generatedSetterHelperImpl(unitOfMeasure, UNITOFMEASURE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "unitOfMeasure" element
     */
    public net.opengis.gml.UnitOfMeasureType addNewUnitOfMeasure()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitOfMeasureType target = null;
            target = (net.opengis.gml.UnitOfMeasureType)get_store().add_element_user(UNITOFMEASURE$0);
            return target;
        }
    }
}
