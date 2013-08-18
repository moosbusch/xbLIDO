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
package org.lidoSchema.impl;  import com.google.inject.Inject;
/**
 * An XML measurementsSetComplexType(@http://www.lido-schema.org).
 *
 * This is a complex type.
 */
public class MeasurementsSetComplexTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements org.lidoSchema.MeasurementsSetComplexType
{
    private static final long serialVersionUID = 1L;
    
    public MeasurementsSetComplexTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MEASUREMENTTYPE$0 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "measurementType");
    private static final javax.xml.namespace.QName MEASUREMENTUNIT$2 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "measurementUnit");
    private static final javax.xml.namespace.QName MEASUREMENTVALUE$4 = 
        new javax.xml.namespace.QName("http://www.lido-schema.org", "measurementValue");
    
    
    /**
     * Gets a List of "measurementType" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getMeasurementTypeList()
    {
        final class MeasurementTypeList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return MeasurementsSetComplexTypeImpl.this.getMeasurementTypeArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = MeasurementsSetComplexTypeImpl.this.getMeasurementTypeArray(i);
                MeasurementsSetComplexTypeImpl.this.setMeasurementTypeArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { MeasurementsSetComplexTypeImpl.this.insertNewMeasurementType(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = MeasurementsSetComplexTypeImpl.this.getMeasurementTypeArray(i);
                MeasurementsSetComplexTypeImpl.this.removeMeasurementType(i);
                return old;
            }
            
            @Override
            public int size()
                { return MeasurementsSetComplexTypeImpl.this.sizeOfMeasurementTypeArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MeasurementTypeList();
        }
    }
    
    /**
     * Gets array of all "measurementType" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getMeasurementTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(MEASUREMENTTYPE$0, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "measurementType" element
     */
    public org.lidoSchema.TextComplexType getMeasurementTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(MEASUREMENTTYPE$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "measurementType" element
     */
    public int sizeOfMeasurementTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREMENTTYPE$0);
        }
    }
    
    /**
     * Sets array of all "measurementType" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMeasurementTypeArray(org.lidoSchema.TextComplexType[] measurementTypeArray)
    {
        check_orphaned();
        arraySetterHelper(measurementTypeArray, MEASUREMENTTYPE$0);
    }
    
    /**
     * Sets ith "measurementType" element
     */
    @Inject(optional=true) public void setMeasurementTypeArray(int i, org.lidoSchema.TextComplexType measurementType)
    {
        generatedSetterHelperImpl(measurementType, MEASUREMENTTYPE$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measurementType" element
     */
    public org.lidoSchema.TextComplexType insertNewMeasurementType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(MEASUREMENTTYPE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measurementType" element
     */
    public org.lidoSchema.TextComplexType addNewMeasurementType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(MEASUREMENTTYPE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "measurementType" element
     */
    public void removeMeasurementType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREMENTTYPE$0, i);
        }
    }
    
    /**
     * Gets a List of "measurementUnit" elements
     */
    public java.util.List<org.lidoSchema.TextComplexType> getMeasurementUnitList()
    {
        final class MeasurementUnitList extends java.util.AbstractList<org.lidoSchema.TextComplexType>
        {
            @Override
            public org.lidoSchema.TextComplexType get(int i)
                { return MeasurementsSetComplexTypeImpl.this.getMeasurementUnitArray(i); }
            
            @Override
            public org.lidoSchema.TextComplexType set(int i, org.lidoSchema.TextComplexType o)
            {
                org.lidoSchema.TextComplexType old = MeasurementsSetComplexTypeImpl.this.getMeasurementUnitArray(i);
                MeasurementsSetComplexTypeImpl.this.setMeasurementUnitArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.lidoSchema.TextComplexType o)
                { MeasurementsSetComplexTypeImpl.this.insertNewMeasurementUnit(i).set(o); }
            
            @Override
            public org.lidoSchema.TextComplexType remove(int i)
            {
                org.lidoSchema.TextComplexType old = MeasurementsSetComplexTypeImpl.this.getMeasurementUnitArray(i);
                MeasurementsSetComplexTypeImpl.this.removeMeasurementUnit(i);
                return old;
            }
            
            @Override
            public int size()
                { return MeasurementsSetComplexTypeImpl.this.sizeOfMeasurementUnitArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MeasurementUnitList();
        }
    }
    
    /**
     * Gets array of all "measurementUnit" elements
     * @deprecated
     */
    @Deprecated
    public org.lidoSchema.TextComplexType[] getMeasurementUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.lidoSchema.TextComplexType> targetList = new java.util.ArrayList<org.lidoSchema.TextComplexType>();
            get_store().find_all_element_users(MEASUREMENTUNIT$2, targetList);
            org.lidoSchema.TextComplexType[] result = new org.lidoSchema.TextComplexType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "measurementUnit" element
     */
    public org.lidoSchema.TextComplexType getMeasurementUnitArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(MEASUREMENTUNIT$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "measurementUnit" element
     */
    public int sizeOfMeasurementUnitArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MEASUREMENTUNIT$2);
        }
    }
    
    /**
     * Sets array of all "measurementUnit" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setMeasurementUnitArray(org.lidoSchema.TextComplexType[] measurementUnitArray)
    {
        check_orphaned();
        arraySetterHelper(measurementUnitArray, MEASUREMENTUNIT$2);
    }
    
    /**
     * Sets ith "measurementUnit" element
     */
    @Inject(optional=true) public void setMeasurementUnitArray(int i, org.lidoSchema.TextComplexType measurementUnit)
    {
        generatedSetterHelperImpl(measurementUnit, MEASUREMENTUNIT$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "measurementUnit" element
     */
    public org.lidoSchema.TextComplexType insertNewMeasurementUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().insert_element_user(MEASUREMENTUNIT$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "measurementUnit" element
     */
    public org.lidoSchema.TextComplexType addNewMeasurementUnit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(MEASUREMENTUNIT$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "measurementUnit" element
     */
    public void removeMeasurementUnit(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MEASUREMENTUNIT$2, i);
        }
    }
    
    /**
     * Gets the "measurementValue" element
     */
    public org.lidoSchema.TextComplexType getMeasurementValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().find_element_user(MEASUREMENTVALUE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "measurementValue" element
     */
    @Inject(optional=true) public void setMeasurementValue(org.lidoSchema.TextComplexType measurementValue)
    {
        generatedSetterHelperImpl(measurementValue, MEASUREMENTVALUE$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "measurementValue" element
     */
    public org.lidoSchema.TextComplexType addNewMeasurementValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.lidoSchema.TextComplexType target = null;
            target = (org.lidoSchema.TextComplexType)get_store().add_element_user(MEASUREMENTVALUE$4);
            return target;
        }
    }
}
