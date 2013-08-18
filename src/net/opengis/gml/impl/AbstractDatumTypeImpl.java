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
 * An XML AbstractDatumType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractDatumTypeImpl extends net.opengis.gml.impl.AbstractDatumBaseTypeImpl implements net.opengis.gml.AbstractDatumType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractDatumTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DATUMID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "datumID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName ANCHORPOINT$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "anchorPoint");
    private static final javax.xml.namespace.QName REALIZATIONEPOCH$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "realizationEpoch");
    private static final javax.xml.namespace.QName VALIDAREA$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validArea");
    private static final javax.xml.namespace.QName SCOPE$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "scope");
    
    
    /**
     * Gets a List of "datumID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getDatumIDList()
    {
        final class DatumIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return AbstractDatumTypeImpl.this.getDatumIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = AbstractDatumTypeImpl.this.getDatumIDArray(i);
                AbstractDatumTypeImpl.this.setDatumIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { AbstractDatumTypeImpl.this.insertNewDatumID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = AbstractDatumTypeImpl.this.getDatumIDArray(i);
                AbstractDatumTypeImpl.this.removeDatumID(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractDatumTypeImpl.this.sizeOfDatumIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new DatumIDList();
        }
    }
    
    /**
     * Gets array of all "datumID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getDatumIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(DATUMID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "datumID" element
     */
    public net.opengis.gml.IdentifierType getDatumIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(DATUMID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "datumID" element
     */
    public int sizeOfDatumIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DATUMID$0);
        }
    }
    
    /**
     * Sets array of all "datumID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setDatumIDArray(net.opengis.gml.IdentifierType[] datumIDArray)
    {
        check_orphaned();
        arraySetterHelper(datumIDArray, DATUMID$0);
    }
    
    /**
     * Sets ith "datumID" element
     */
    @Inject(optional=true) public void setDatumIDArray(int i, net.opengis.gml.IdentifierType datumID)
    {
        generatedSetterHelperImpl(datumID, DATUMID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "datumID" element
     */
    public net.opengis.gml.IdentifierType insertNewDatumID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(DATUMID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "datumID" element
     */
    public net.opengis.gml.IdentifierType addNewDatumID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(DATUMID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "datumID" element
     */
    public void removeDatumID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DATUMID$0, i);
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
    @Inject(optional=true) public void setRemarks(net.opengis.gml.StringOrRefType remarks)
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
     * Gets the "anchorPoint" element
     */
    public net.opengis.gml.CodeType getAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(ANCHORPOINT$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "anchorPoint" element
     */
    public boolean isSetAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHORPOINT$4) != 0;
        }
    }
    
    /**
     * Sets the "anchorPoint" element
     */
    @Inject(optional=true) public void setAnchorPoint(net.opengis.gml.CodeType anchorPoint)
    {
        generatedSetterHelperImpl(anchorPoint, ANCHORPOINT$4, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "anchorPoint" element
     */
    public net.opengis.gml.CodeType addNewAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(ANCHORPOINT$4);
            return target;
        }
    }
    
    /**
     * Unsets the "anchorPoint" element
     */
    public void unsetAnchorPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHORPOINT$4, 0);
        }
    }
    
    /**
     * Gets the "realizationEpoch" element
     */
    public java.util.Calendar getRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "realizationEpoch" element
     */
    public org.apache.xmlbeans.XmlDate xgetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "realizationEpoch" element
     */
    public boolean isSetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REALIZATIONEPOCH$6) != 0;
        }
    }
    
    /**
     * Sets the "realizationEpoch" element
     */
    @Inject(optional=true) public void setRealizationEpoch(java.util.Calendar realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REALIZATIONEPOCH$6);
            }
            target.setCalendarValue(realizationEpoch);
        }
    }
    
    /**
     * Sets (as xml) the "realizationEpoch" element
     */
    public void xsetRealizationEpoch(org.apache.xmlbeans.XmlDate realizationEpoch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(REALIZATIONEPOCH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(REALIZATIONEPOCH$6);
            }
            target.set(realizationEpoch);
        }
    }
    
    /**
     * Unsets the "realizationEpoch" element
     */
    public void unsetRealizationEpoch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REALIZATIONEPOCH$6, 0);
        }
    }
    
    /**
     * Gets the "validArea" element
     */
    public net.opengis.gml.ExtentType getValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().find_element_user(VALIDAREA$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validArea" element
     */
    public boolean isSetValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDAREA$8) != 0;
        }
    }
    
    /**
     * Sets the "validArea" element
     */
    @Inject(optional=true) public void setValidArea(net.opengis.gml.ExtentType validArea)
    {
        generatedSetterHelperImpl(validArea, VALIDAREA$8, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "validArea" element
     */
    public net.opengis.gml.ExtentType addNewValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ExtentType target = null;
            target = (net.opengis.gml.ExtentType)get_store().add_element_user(VALIDAREA$8);
            return target;
        }
    }
    
    /**
     * Unsets the "validArea" element
     */
    public void unsetValidArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDAREA$8, 0);
        }
    }
    
    /**
     * Gets the "scope" element
     */
    public java.lang.String getScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "scope" element
     */
    public org.apache.xmlbeans.XmlString xgetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "scope" element
     */
    public boolean isSetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCOPE$10) != 0;
        }
    }
    
    /**
     * Sets the "scope" element
     */
    @Inject(optional=true) public void setScope(java.lang.String scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$10);
            }
            target.setStringValue(scope);
        }
    }
    
    /**
     * Sets (as xml) the "scope" element
     */
    public void xsetScope(org.apache.xmlbeans.XmlString scope)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$10);
            }
            target.set(scope);
        }
    }
    
    /**
     * Unsets the "scope" element
     */
    public void unsetScope()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCOPE$10, 0);
        }
    }
}
