/*
 * XML Type:  CovarianceMatrixType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.CovarianceMatrixType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML CovarianceMatrixType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class CovarianceMatrixTypeImpl extends net.opengis.gml.impl.AbstractPositionalAccuracyTypeImpl implements net.opengis.gml.CovarianceMatrixType
{
    private static final long serialVersionUID = 1L;
    
    public CovarianceMatrixTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNITOFMEASURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "unitOfMeasure");
    private static final javax.xml.namespace.QName INCLUDESELEMENT$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "includesElement");
    
    
    /**
     * Gets a List of "unitOfMeasure" elements
     */
    public java.util.List<net.opengis.gml.UnitOfMeasureType> getUnitOfMeasureList()
    {
        final class UnitOfMeasureList extends java.util.AbstractList<net.opengis.gml.UnitOfMeasureType>
        {
            @Override
            public net.opengis.gml.UnitOfMeasureType get(int i)
                { return CovarianceMatrixTypeImpl.this.getUnitOfMeasureArray(i); }
            
            @Override
            public net.opengis.gml.UnitOfMeasureType set(int i, net.opengis.gml.UnitOfMeasureType o)
            {
                net.opengis.gml.UnitOfMeasureType old = CovarianceMatrixTypeImpl.this.getUnitOfMeasureArray(i);
                CovarianceMatrixTypeImpl.this.setUnitOfMeasureArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.UnitOfMeasureType o)
                { CovarianceMatrixTypeImpl.this.insertNewUnitOfMeasure(i).set(o); }
            
            @Override
            public net.opengis.gml.UnitOfMeasureType remove(int i)
            {
                net.opengis.gml.UnitOfMeasureType old = CovarianceMatrixTypeImpl.this.getUnitOfMeasureArray(i);
                CovarianceMatrixTypeImpl.this.removeUnitOfMeasure(i);
                return old;
            }
            
            @Override
            public int size()
                { return CovarianceMatrixTypeImpl.this.sizeOfUnitOfMeasureArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UnitOfMeasureList();
        }
    }
    
    /**
     * Gets array of all "unitOfMeasure" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.UnitOfMeasureType[] getUnitOfMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.UnitOfMeasureType> targetList = new java.util.ArrayList<net.opengis.gml.UnitOfMeasureType>();
            get_store().find_all_element_users(UNITOFMEASURE$0, targetList);
            net.opengis.gml.UnitOfMeasureType[] result = new net.opengis.gml.UnitOfMeasureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unitOfMeasure" element
     */
    public net.opengis.gml.UnitOfMeasureType getUnitOfMeasureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitOfMeasureType target = null;
            target = (net.opengis.gml.UnitOfMeasureType)get_store().find_element_user(UNITOFMEASURE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unitOfMeasure" element
     */
    public int sizeOfUnitOfMeasureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITOFMEASURE$0);
        }
    }
    
    /**
     * Sets array of all "unitOfMeasure" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setUnitOfMeasureArray(net.opengis.gml.UnitOfMeasureType[] unitOfMeasureArray)
    {
        check_orphaned();
        arraySetterHelper(unitOfMeasureArray, UNITOFMEASURE$0);
    }
    
    /**
     * Sets ith "unitOfMeasure" element
     */
    @Inject(optional=true) public void setUnitOfMeasureArray(int i, net.opengis.gml.UnitOfMeasureType unitOfMeasure)
    {
        generatedSetterHelperImpl(unitOfMeasure, UNITOFMEASURE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitOfMeasure" element
     */
    public net.opengis.gml.UnitOfMeasureType insertNewUnitOfMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.UnitOfMeasureType target = null;
            target = (net.opengis.gml.UnitOfMeasureType)get_store().insert_element_user(UNITOFMEASURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitOfMeasure" element
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
    
    /**
     * Removes the ith "unitOfMeasure" element
     */
    public void removeUnitOfMeasure(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITOFMEASURE$0, i);
        }
    }
    
    /**
     * Gets a List of "includesElement" elements
     */
    public java.util.List<net.opengis.gml.CovarianceElementType> getIncludesElementList()
    {
        final class IncludesElementList extends java.util.AbstractList<net.opengis.gml.CovarianceElementType>
        {
            @Override
            public net.opengis.gml.CovarianceElementType get(int i)
                { return CovarianceMatrixTypeImpl.this.getIncludesElementArray(i); }
            
            @Override
            public net.opengis.gml.CovarianceElementType set(int i, net.opengis.gml.CovarianceElementType o)
            {
                net.opengis.gml.CovarianceElementType old = CovarianceMatrixTypeImpl.this.getIncludesElementArray(i);
                CovarianceMatrixTypeImpl.this.setIncludesElementArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CovarianceElementType o)
                { CovarianceMatrixTypeImpl.this.insertNewIncludesElement(i).set(o); }
            
            @Override
            public net.opengis.gml.CovarianceElementType remove(int i)
            {
                net.opengis.gml.CovarianceElementType old = CovarianceMatrixTypeImpl.this.getIncludesElementArray(i);
                CovarianceMatrixTypeImpl.this.removeIncludesElement(i);
                return old;
            }
            
            @Override
            public int size()
                { return CovarianceMatrixTypeImpl.this.sizeOfIncludesElementArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new IncludesElementList();
        }
    }
    
    /**
     * Gets array of all "includesElement" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CovarianceElementType[] getIncludesElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CovarianceElementType> targetList = new java.util.ArrayList<net.opengis.gml.CovarianceElementType>();
            get_store().find_all_element_users(INCLUDESELEMENT$2, targetList);
            net.opengis.gml.CovarianceElementType[] result = new net.opengis.gml.CovarianceElementType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "includesElement" element
     */
    public net.opengis.gml.CovarianceElementType getIncludesElementArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceElementType target = null;
            target = (net.opengis.gml.CovarianceElementType)get_store().find_element_user(INCLUDESELEMENT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "includesElement" element
     */
    public int sizeOfIncludesElementArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INCLUDESELEMENT$2);
        }
    }
    
    /**
     * Sets array of all "includesElement" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setIncludesElementArray(net.opengis.gml.CovarianceElementType[] includesElementArray)
    {
        check_orphaned();
        arraySetterHelper(includesElementArray, INCLUDESELEMENT$2);
    }
    
    /**
     * Sets ith "includesElement" element
     */
    @Inject(optional=true) public void setIncludesElementArray(int i, net.opengis.gml.CovarianceElementType includesElement)
    {
        generatedSetterHelperImpl(includesElement, INCLUDESELEMENT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "includesElement" element
     */
    public net.opengis.gml.CovarianceElementType insertNewIncludesElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceElementType target = null;
            target = (net.opengis.gml.CovarianceElementType)get_store().insert_element_user(INCLUDESELEMENT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "includesElement" element
     */
    public net.opengis.gml.CovarianceElementType addNewIncludesElement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CovarianceElementType target = null;
            target = (net.opengis.gml.CovarianceElementType)get_store().add_element_user(INCLUDESELEMENT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "includesElement" element
     */
    public void removeIncludesElement(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INCLUDESELEMENT$2, i);
        }
    }
}
