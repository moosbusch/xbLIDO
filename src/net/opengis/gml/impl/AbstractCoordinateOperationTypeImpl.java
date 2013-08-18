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
 * An XML AbstractCoordinateOperationType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class AbstractCoordinateOperationTypeImpl extends net.opengis.gml.impl.AbstractCoordinateOperationBaseTypeImpl implements net.opengis.gml.AbstractCoordinateOperationType
{
    private static final long serialVersionUID = 1L;
    
    public AbstractCoordinateOperationTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COORDINATEOPERATIONID$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "coordinateOperationID");
    private static final javax.xml.namespace.QName REMARKS$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "remarks");
    private static final javax.xml.namespace.QName OPERATIONVERSION$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "operationVersion");
    private static final javax.xml.namespace.QName VALIDAREA$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "validArea");
    private static final javax.xml.namespace.QName SCOPE$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "scope");
    private static final javax.xml.namespace.QName POSITIONALACCURACY$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_positionalAccuracy");
    private static final org.apache.xmlbeans.QNameSet POSITIONALACCURACY$11 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_positionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "absoluteExternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "relativeInternalPositionalAccuracy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "covarianceMatrix"),
    });
    private static final javax.xml.namespace.QName SOURCECRS$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "sourceCRS");
    private static final javax.xml.namespace.QName TARGETCRS$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "targetCRS");
    
    
    /**
     * Gets a List of "coordinateOperationID" elements
     */
    public java.util.List<net.opengis.gml.IdentifierType> getCoordinateOperationIDList()
    {
        final class CoordinateOperationIDList extends java.util.AbstractList<net.opengis.gml.IdentifierType>
        {
            @Override
            public net.opengis.gml.IdentifierType get(int i)
                { return AbstractCoordinateOperationTypeImpl.this.getCoordinateOperationIDArray(i); }
            
            @Override
            public net.opengis.gml.IdentifierType set(int i, net.opengis.gml.IdentifierType o)
            {
                net.opengis.gml.IdentifierType old = AbstractCoordinateOperationTypeImpl.this.getCoordinateOperationIDArray(i);
                AbstractCoordinateOperationTypeImpl.this.setCoordinateOperationIDArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IdentifierType o)
                { AbstractCoordinateOperationTypeImpl.this.insertNewCoordinateOperationID(i).set(o); }
            
            @Override
            public net.opengis.gml.IdentifierType remove(int i)
            {
                net.opengis.gml.IdentifierType old = AbstractCoordinateOperationTypeImpl.this.getCoordinateOperationIDArray(i);
                AbstractCoordinateOperationTypeImpl.this.removeCoordinateOperationID(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractCoordinateOperationTypeImpl.this.sizeOfCoordinateOperationIDArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CoordinateOperationIDList();
        }
    }
    
    /**
     * Gets array of all "coordinateOperationID" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IdentifierType[] getCoordinateOperationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IdentifierType> targetList = new java.util.ArrayList<net.opengis.gml.IdentifierType>();
            get_store().find_all_element_users(COORDINATEOPERATIONID$0, targetList);
            net.opengis.gml.IdentifierType[] result = new net.opengis.gml.IdentifierType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType getCoordinateOperationIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().find_element_user(COORDINATEOPERATIONID$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "coordinateOperationID" element
     */
    public int sizeOfCoordinateOperationIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COORDINATEOPERATIONID$0);
        }
    }
    
    /**
     * Sets array of all "coordinateOperationID" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setCoordinateOperationIDArray(net.opengis.gml.IdentifierType[] coordinateOperationIDArray)
    {
        check_orphaned();
        arraySetterHelper(coordinateOperationIDArray, COORDINATEOPERATIONID$0);
    }
    
    /**
     * Sets ith "coordinateOperationID" element
     */
    @Inject(optional=true) public void setCoordinateOperationIDArray(int i, net.opengis.gml.IdentifierType coordinateOperationID)
    {
        generatedSetterHelperImpl(coordinateOperationID, COORDINATEOPERATIONID$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType insertNewCoordinateOperationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().insert_element_user(COORDINATEOPERATIONID$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "coordinateOperationID" element
     */
    public net.opengis.gml.IdentifierType addNewCoordinateOperationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IdentifierType target = null;
            target = (net.opengis.gml.IdentifierType)get_store().add_element_user(COORDINATEOPERATIONID$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "coordinateOperationID" element
     */
    public void removeCoordinateOperationID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COORDINATEOPERATIONID$0, i);
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
     * Gets the "operationVersion" element
     */
    public java.lang.String getOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "operationVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "operationVersion" element
     */
    public boolean isSetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPERATIONVERSION$4) != 0;
        }
    }
    
    /**
     * Sets the "operationVersion" element
     */
    @Inject(optional=true) public void setOperationVersion(java.lang.String operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPERATIONVERSION$4);
            }
            target.setStringValue(operationVersion);
        }
    }
    
    /**
     * Sets (as xml) the "operationVersion" element
     */
    public void xsetOperationVersion(org.apache.xmlbeans.XmlString operationVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPERATIONVERSION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPERATIONVERSION$4);
            }
            target.set(operationVersion);
        }
    }
    
    /**
     * Unsets the "operationVersion" element
     */
    public void unsetOperationVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPERATIONVERSION$4, 0);
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
            target = (net.opengis.gml.ExtentType)get_store().find_element_user(VALIDAREA$6, 0);
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
            return get_store().count_elements(VALIDAREA$6) != 0;
        }
    }
    
    /**
     * Sets the "validArea" element
     */
    @Inject(optional=true) public void setValidArea(net.opengis.gml.ExtentType validArea)
    {
        generatedSetterHelperImpl(validArea, VALIDAREA$6, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
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
            target = (net.opengis.gml.ExtentType)get_store().add_element_user(VALIDAREA$6);
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
            get_store().remove_element(VALIDAREA$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$8, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$8, 0);
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
            return get_store().count_elements(SCOPE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCOPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCOPE$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SCOPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SCOPE$8);
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
            get_store().remove_element(SCOPE$8, 0);
        }
    }
    
    /**
     * Gets a List of "_positionalAccuracy" elements
     */
    public java.util.List<net.opengis.gml.AbstractPositionalAccuracyType> getPositionalAccuracyList()
    {
        final class PositionalAccuracyList extends java.util.AbstractList<net.opengis.gml.AbstractPositionalAccuracyType>
        {
            @Override
            public net.opengis.gml.AbstractPositionalAccuracyType get(int i)
                { return AbstractCoordinateOperationTypeImpl.this.getPositionalAccuracyArray(i); }
            
            @Override
            public net.opengis.gml.AbstractPositionalAccuracyType set(int i, net.opengis.gml.AbstractPositionalAccuracyType o)
            {
                net.opengis.gml.AbstractPositionalAccuracyType old = AbstractCoordinateOperationTypeImpl.this.getPositionalAccuracyArray(i);
                AbstractCoordinateOperationTypeImpl.this.setPositionalAccuracyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractPositionalAccuracyType o)
                { AbstractCoordinateOperationTypeImpl.this.insertNewPositionalAccuracy(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractPositionalAccuracyType remove(int i)
            {
                net.opengis.gml.AbstractPositionalAccuracyType old = AbstractCoordinateOperationTypeImpl.this.getPositionalAccuracyArray(i);
                AbstractCoordinateOperationTypeImpl.this.removePositionalAccuracy(i);
                return old;
            }
            
            @Override
            public int size()
                { return AbstractCoordinateOperationTypeImpl.this.sizeOfPositionalAccuracyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PositionalAccuracyList();
        }
    }
    
    /**
     * Gets array of all "_positionalAccuracy" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractPositionalAccuracyType[] getPositionalAccuracyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractPositionalAccuracyType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractPositionalAccuracyType>();
            get_store().find_all_element_users(POSITIONALACCURACY$11, targetList);
            net.opengis.gml.AbstractPositionalAccuracyType[] result = new net.opengis.gml.AbstractPositionalAccuracyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_positionalAccuracy" element
     */
    public net.opengis.gml.AbstractPositionalAccuracyType getPositionalAccuracyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().find_element_user(POSITIONALACCURACY$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_positionalAccuracy" element
     */
    public int sizeOfPositionalAccuracyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSITIONALACCURACY$11);
        }
    }
    
    /**
     * Sets array of all "_positionalAccuracy" element  WARNING: This method is not atomicaly synchronized.
     */
    @Inject(optional=true) public void setPositionalAccuracyArray(net.opengis.gml.AbstractPositionalAccuracyType[] positionalAccuracyArray)
    {
        check_orphaned();
        arraySetterHelper(positionalAccuracyArray, POSITIONALACCURACY$10, POSITIONALACCURACY$11);
    }
    
    /**
     * Sets ith "_positionalAccuracy" element
     */
    @Inject(optional=true) public void setPositionalAccuracyArray(int i, net.opengis.gml.AbstractPositionalAccuracyType positionalAccuracy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().find_element_user(POSITIONALACCURACY$11, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(positionalAccuracy);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_positionalAccuracy" element
     */
    public net.opengis.gml.AbstractPositionalAccuracyType insertNewPositionalAccuracy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().insert_element_user(POSITIONALACCURACY$11, POSITIONALACCURACY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_positionalAccuracy" element
     */
    public net.opengis.gml.AbstractPositionalAccuracyType addNewPositionalAccuracy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractPositionalAccuracyType target = null;
            target = (net.opengis.gml.AbstractPositionalAccuracyType)get_store().add_element_user(POSITIONALACCURACY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "_positionalAccuracy" element
     */
    public void removePositionalAccuracy(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSITIONALACCURACY$11, i);
        }
    }
    
    /**
     * Gets the "sourceCRS" element
     */
    public net.opengis.gml.CRSRefType getSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().find_element_user(SOURCECRS$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "sourceCRS" element
     */
    public boolean isSetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCECRS$12) != 0;
        }
    }
    
    /**
     * Sets the "sourceCRS" element
     */
    @Inject(optional=true) public void setSourceCRS(net.opengis.gml.CRSRefType sourceCRS)
    {
        generatedSetterHelperImpl(sourceCRS, SOURCECRS$12, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "sourceCRS" element
     */
    public net.opengis.gml.CRSRefType addNewSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().add_element_user(SOURCECRS$12);
            return target;
        }
    }
    
    /**
     * Unsets the "sourceCRS" element
     */
    public void unsetSourceCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCECRS$12, 0);
        }
    }
    
    /**
     * Gets the "targetCRS" element
     */
    public net.opengis.gml.CRSRefType getTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().find_element_user(TARGETCRS$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "targetCRS" element
     */
    public boolean isSetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TARGETCRS$14) != 0;
        }
    }
    
    /**
     * Sets the "targetCRS" element
     */
    @Inject(optional=true) public void setTargetCRS(net.opengis.gml.CRSRefType targetCRS)
    {
        generatedSetterHelperImpl(targetCRS, TARGETCRS$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "targetCRS" element
     */
    public net.opengis.gml.CRSRefType addNewTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CRSRefType target = null;
            target = (net.opengis.gml.CRSRefType)get_store().add_element_user(TARGETCRS$14);
            return target;
        }
    }
    
    /**
     * Unsets the "targetCRS" element
     */
    public void unsetTargetCRS()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TARGETCRS$14, 0);
        }
    }
}
