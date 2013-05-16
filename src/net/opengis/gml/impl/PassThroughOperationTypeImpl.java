/*
 * XML Type:  PassThroughOperationType
 * Namespace: http://www.opengis.net/gml
 * Java type: net.opengis.gml.PassThroughOperationType
 *
 * Automatically generated - do not modify.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML PassThroughOperationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class PassThroughOperationTypeImpl extends net.opengis.gml.impl.AbstractCoordinateOperationTypeImpl implements net.opengis.gml.PassThroughOperationType
{
    private static final long serialVersionUID = 1L;
    
    public PassThroughOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MODIFIEDCOORDINATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "modifiedCoordinate");
    private static final javax.xml.namespace.QName USESOPERATION$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesOperation");
    
    
    /**
     * Gets a List of "modifiedCoordinate" elements
     */
    public java.util.List<java.math.BigInteger> getModifiedCoordinateList()
    {
        final class ModifiedCoordinateList extends java.util.AbstractList<java.math.BigInteger>
        {
            @Override
            public java.math.BigInteger get(int i)
                { return PassThroughOperationTypeImpl.this.getModifiedCoordinateArray(i); }
            
            @Override
            public java.math.BigInteger set(int i, java.math.BigInteger o)
            {
                java.math.BigInteger old = PassThroughOperationTypeImpl.this.getModifiedCoordinateArray(i);
                PassThroughOperationTypeImpl.this.setModifiedCoordinateArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.math.BigInteger o)
                { PassThroughOperationTypeImpl.this.insertModifiedCoordinate(i, o); }
            
            @Override
            public java.math.BigInteger remove(int i)
            {
                java.math.BigInteger old = PassThroughOperationTypeImpl.this.getModifiedCoordinateArray(i);
                PassThroughOperationTypeImpl.this.removeModifiedCoordinate(i);
                return old;
            }
            
            @Override
            public int size()
                { return PassThroughOperationTypeImpl.this.sizeOfModifiedCoordinateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ModifiedCoordinateList();
        }
    }
    
    /**
     * Gets array of all "modifiedCoordinate" elements
     * @deprecated
     */
    @Deprecated
    public java.math.BigInteger[] getModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlPositiveInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlPositiveInteger>();
            get_store().find_all_element_users(MODIFIEDCOORDINATE$0, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "modifiedCoordinate" element
     */
    public java.math.BigInteger getModifiedCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "modifiedCoordinate" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlPositiveInteger> xgetModifiedCoordinateList()
    {
        final class ModifiedCoordinateList extends java.util.AbstractList<org.apache.xmlbeans.XmlPositiveInteger>
        {
            @Override
            public org.apache.xmlbeans.XmlPositiveInteger get(int i)
                { return PassThroughOperationTypeImpl.this.xgetModifiedCoordinateArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlPositiveInteger set(int i, org.apache.xmlbeans.XmlPositiveInteger o)
            {
                org.apache.xmlbeans.XmlPositiveInteger old = PassThroughOperationTypeImpl.this.xgetModifiedCoordinateArray(i);
                PassThroughOperationTypeImpl.this.xsetModifiedCoordinateArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlPositiveInteger o)
                { PassThroughOperationTypeImpl.this.insertNewModifiedCoordinate(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlPositiveInteger remove(int i)
            {
                org.apache.xmlbeans.XmlPositiveInteger old = PassThroughOperationTypeImpl.this.xgetModifiedCoordinateArray(i);
                PassThroughOperationTypeImpl.this.removeModifiedCoordinate(i);
                return old;
            }
            
            @Override
            public int size()
                { return PassThroughOperationTypeImpl.this.sizeOfModifiedCoordinateArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ModifiedCoordinateList();
        }
    }
    
    /**
     * Gets array of all "modifiedCoordinate" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlPositiveInteger[] xgetModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlPositiveInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlPositiveInteger>();
            get_store().find_all_element_users(MODIFIEDCOORDINATE$0, targetList);
            org.apache.xmlbeans.XmlPositiveInteger[] result = new org.apache.xmlbeans.XmlPositiveInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger xgetModifiedCoordinateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "modifiedCoordinate" element
     */
    public int sizeOfModifiedCoordinateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets array of all "modifiedCoordinate" element
     */
    @Inject(optional=true) public void setModifiedCoordinateArray(java.math.BigInteger[] modifiedCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(modifiedCoordinateArray, MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets ith "modifiedCoordinate" element
     */
    @Inject(optional=true) public void setModifiedCoordinateArray(int i, java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Sets (as xml) array of all "modifiedCoordinate" element
     */
    public void xsetModifiedCoordinateArray(org.apache.xmlbeans.XmlPositiveInteger[]modifiedCoordinateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(modifiedCoordinateArray, MODIFIEDCOORDINATE$0);
        }
    }
    
    /**
     * Sets (as xml) ith "modifiedCoordinate" element
     */
    public void xsetModifiedCoordinateArray(int i, org.apache.xmlbeans.XmlPositiveInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().find_element_user(MODIFIEDCOORDINATE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(modifiedCoordinate);
        }
    }
    
    /**
     * Inserts the value as the ith "modifiedCoordinate" element
     */
    public void insertModifiedCoordinate(int i, java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MODIFIEDCOORDINATE$0, i);
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Appends the value as the last "modifiedCoordinate" element
     */
    public void addModifiedCoordinate(java.math.BigInteger modifiedCoordinate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            target.setBigIntegerValue(modifiedCoordinate);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger insertNewModifiedCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().insert_element_user(MODIFIEDCOORDINATE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "modifiedCoordinate" element
     */
    public org.apache.xmlbeans.XmlPositiveInteger addNewModifiedCoordinate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlPositiveInteger target = null;
            target = (org.apache.xmlbeans.XmlPositiveInteger)get_store().add_element_user(MODIFIEDCOORDINATE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "modifiedCoordinate" element
     */
    public void removeModifiedCoordinate(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDCOORDINATE$0, i);
        }
    }
    
    /**
     * Gets the "usesOperation" element
     */
    public net.opengis.gml.OperationRefType getUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().find_element_user(USESOPERATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "usesOperation" element
     */
    @Inject(optional=true) public void setUsesOperation(net.opengis.gml.OperationRefType usesOperation)
    {
        generatedSetterHelperImpl(usesOperation, USESOPERATION$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "usesOperation" element
     */
    public net.opengis.gml.OperationRefType addNewUsesOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.OperationRefType target = null;
            target = (net.opengis.gml.OperationRefType)get_store().add_element_user(USESOPERATION$2);
            return target;
        }
    }
}
