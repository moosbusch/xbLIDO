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
package net.opengis.gml.impl; 
/**
 * An XML EllipsoidType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class EllipsoidTypeImpl extends net.opengis.gml.impl.EllipsoidBaseTypeImpl implements net.opengis.gml.EllipsoidType
{
    private static final long serialVersionUID = 1L;
    
    public EllipsoidTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ELLIPSOIDID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ellipsoidID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName SEMIMAJORAXIS$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "semiMajorAxis");
    private static final javax.xml.namespace.QName SECONDDEFININGPARAMETER$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "secondDefiningParameter");
    
    
    /**
     * Gets a List of "ellipsoidID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getEllipsoidIDList()
    {
        final class EllipsoidIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return EllipsoidTypeImpl.this.getEllipsoidIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = EllipsoidTypeImpl.this.getEllipsoidIDArray(i);
                EllipsoidTypeImpl.this.setEllipsoidIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { EllipsoidTypeImpl.this.insertNewEllipsoidID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = EllipsoidTypeImpl.this.getEllipsoidIDArray(i);
                EllipsoidTypeImpl.this.removeEllipsoidID(i);
                return old;
            }
            
            @Override
            public int size()
                { return EllipsoidTypeImpl.this.sizeOfEllipsoidIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EllipsoidIDList();
        }
    }
    
    /**
     * Gets array of all "ellipsoidID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getEllipsoidIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(ELLIPSOIDID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ellipsoidID" element
     */
    public net.opengis.gml.IdentifierType getEllipsoidIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(ELLIPSOIDID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ellipsoidID" element
     */
    public int sizeOfEllipsoidIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ELLIPSOIDID$0);
        }
    }
    
    /**
     * Sets array of all "ellipsoidID" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setEllipsoidIDArray(net.opengis.gml.IdentifierType[] ellipsoidIDArray)
    {
        check_orphaned();
        arraySetterHelper(ellipsoidIDArray, ELLIPSOIDID$0);
    }
    
    /**
     * Sets ith "ellipsoidID" element
     */
     public void setEllipsoidIDArray(int i, net.opengis.gml.IdentifierType ellipsoidID)
    {
        generatedSetterHelperImpl(ellipsoidID, ELLIPSOIDID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ellipsoidID" element
     */
    public net.opengis.gml.IdentifierType insertNewEllipsoidID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(ELLIPSOIDID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ellipsoidID" element
     */
    public net.opengis.gml.IdentifierType addNewEllipsoidID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(ELLIPSOIDID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ellipsoidID" element
     */
    public void removeEllipsoidID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ELLIPSOIDID$0, i);
        }
    }
    
    /**
     * Gets the "remarks" element
     */
    public net.opengis.gml.StringOrRefType getRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().find_element_user(REMARKS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "remarks" element
     */
    public boolean isSetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REMARKS$2) != 0;
        }
    }
    
    /**
     * Sets the "remarks" element
     */
     public void setRemarks(net.opengis.gml.StringOrRefType remarks)
    {
        generatedSetterHelperImpl(remarks, REMARKS$2, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "remarks" element
     */
    public net.opengis.gml.StringOrRefType addNewRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.StringOrRefType target = null;
            target = (net.opengis.gml.StringOrRefType)get_store().add_element_user(REMARKS$2);
            return target;
        }
    }
    
    /**
     * Unsets the "remarks" element
     */
    public void unsetRemarks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REMARKS$2, 0);
        }
    }
    
    /**
     * Gets the "semiMajorAxis" element
     */
    public net.opengis.gml.MeasureType getSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(SEMIMAJORAXIS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "semiMajorAxis" element
     */
     public void setSemiMajorAxis(net.opengis.gml.MeasureType semiMajorAxis)
    {
        generatedSetterHelperImpl(semiMajorAxis, SEMIMAJORAXIS$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "semiMajorAxis" element
     */
    public net.opengis.gml.MeasureType addNewSemiMajorAxis()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(SEMIMAJORAXIS$4);
            return target;
        }
    }
    
    /**
     * Gets the "secondDefiningParameter" element
     */
    public net.opengis.gml.SecondDefiningParameterType getSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SecondDefiningParameterType target = null;
            target = (net.opengis.gml.SecondDefiningParameterType)get_store().find_element_user(SECONDDEFININGPARAMETER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "secondDefiningParameter" element
     */
     public void setSecondDefiningParameter(net.opengis.gml.SecondDefiningParameterType secondDefiningParameter)
    {
        generatedSetterHelperImpl(secondDefiningParameter, SECONDDEFININGPARAMETER$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "secondDefiningParameter" element
     */
    public net.opengis.gml.SecondDefiningParameterType addNewSecondDefiningParameter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.SecondDefiningParameterType target = null;
            target = (net.opengis.gml.SecondDefiningParameterType)get_store().add_element_user(SECONDDEFININGPARAMETER$6);
            return target;
        }
    }
}
