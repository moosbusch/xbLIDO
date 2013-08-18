/* 
 * Copyright 2013 Gunnar Kappei.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.opengis.gml.impl; import com.google.inject.Inject;
/**
 * An XML ConcatenatedOperationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ConcatenatedOperationTypeImpl extends net.opengis.gml.impl.AbstractCoordinateOperationTypeImpl implements net.opengis.gml.ConcatenatedOperationType
{
    private static final long serialVersionUID = 1L;
    
    public ConcatenatedOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USESSINGLEOPERATION$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "usesSingleOperation");
    
    
    /**
     * Gets a List of "usesSingleOperation" elements
     */
    public java.util.List<net.opengis.gml.SingleOperationRefType> getUsesSingleOperationList()
    {
        final class UsesSingleOperationList extends java.util.AbstractList<net.opengis.gml.SingleOperationRefType>
        {
            @Override
            public net.opengis.gml.SingleOperationRefType get(int i)
                { return ConcatenatedOperationTypeImpl.this.getUsesSingleOperationArray(i); }
            
            @Override
            public net.opengis.gml.SingleOperationRefType set(int i, net.opengis.gml.SingleOperationRefType o)
            {
                net.opengis.gml.SingleOperationRefType old = ConcatenatedOperationTypeImpl.this.getUsesSingleOperationArray(i);
                ConcatenatedOperationTypeImpl.this.setUsesSingleOperationArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.SingleOperationRefType o)
                { ConcatenatedOperationTypeImpl.this.insertNewUsesSingleOperation(i).set(o); }
            
            @Override
            public net.opengis.gml.SingleOperationRefType remove(int i)
            {
                net.opengis.gml.SingleOperationRefType old = ConcatenatedOperationTypeImpl.this.getUsesSingleOperationArray(i);
                ConcatenatedOperationTypeImpl.this.removeUsesSingleOperation(i);
                return old;
            }
            
            @Override
            public int size()
                { return ConcatenatedOperationTypeImpl.this.sizeOfUsesSingleOperationArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new UsesSingleOperationList();
        }
    }
    
    /**
     * Gets array of all "usesSingleOperation" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.SingleOperationRefType[] getUsesSingleOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.SingleOperationRefType> targetList = new java.util.ArrayList<net.opengis.gml.SingleOperationRefType>();
            get_store().find_all_element_users(USESSINGLEOPERATION$0, targetList);
            net.opengis.gml.SingleOperationRefType[] result = new net.opengis.gml.SingleOperationRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "usesSingleOperation" element
     */
    public net.opengis.gml.SingleOperationRefType getUsesSingleOperationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SingleOperationRefType target = null;
            target = (net.opengis.gml.SingleOperationRefType)get_store().find_element_user(USESSINGLEOPERATION$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "usesSingleOperation" element
     */
    public int sizeOfUsesSingleOperationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USESSINGLEOPERATION$0);
        }
    }
    
    /**
     * Sets array of all "usesSingleOperation" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setUsesSingleOperationArray(net.opengis.gml.SingleOperationRefType[] usesSingleOperationArray)
    {
        check_orphaned();
        arraySetterHelper(usesSingleOperationArray, USESSINGLEOPERATION$0);
    }
    
    /**
     * Sets ith "usesSingleOperation" element
     */
    @Inject(optional=true) public void setUsesSingleOperationArray(int i, net.opengis.gml.SingleOperationRefType usesSingleOperation)
    {
        generatedSetterHelperImpl(usesSingleOperation, USESSINGLEOPERATION$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "usesSingleOperation" element
     */
    public net.opengis.gml.SingleOperationRefType insertNewUsesSingleOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SingleOperationRefType target = null;
            target = (net.opengis.gml.SingleOperationRefType)get_store().insert_element_user(USESSINGLEOPERATION$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "usesSingleOperation" element
     */
    public net.opengis.gml.SingleOperationRefType addNewUsesSingleOperation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SingleOperationRefType target = null;
            target = (net.opengis.gml.SingleOperationRefType)get_store().add_element_user(USESSINGLEOPERATION$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "usesSingleOperation" element
     */
    public void removeUsesSingleOperation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USESSINGLEOPERATION$0, i);
        }
    }
}
