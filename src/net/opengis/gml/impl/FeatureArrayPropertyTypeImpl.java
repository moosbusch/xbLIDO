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
 * An XML FeatureArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class FeatureArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.FeatureArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public FeatureArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FEATURE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature");
    private static final org.apache.xmlbeans.QNameSet FEATURE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
    });
    
    
    /**
     * Gets a List of "_Feature" elements
     */
    public java.util.List<net.opengis.gml.AbstractFeatureType> getFeatureList()
    {
        final class FeatureList extends java.util.AbstractList<net.opengis.gml.AbstractFeatureType>
        {
            @Override
            public net.opengis.gml.AbstractFeatureType get(int i)
                { return FeatureArrayPropertyTypeImpl.this.getFeatureArray(i); }
            
            @Override
            public net.opengis.gml.AbstractFeatureType set(int i, net.opengis.gml.AbstractFeatureType o)
            {
                net.opengis.gml.AbstractFeatureType old = FeatureArrayPropertyTypeImpl.this.getFeatureArray(i);
                FeatureArrayPropertyTypeImpl.this.setFeatureArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractFeatureType o)
                { FeatureArrayPropertyTypeImpl.this.insertNewFeature(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractFeatureType remove(int i)
            {
                net.opengis.gml.AbstractFeatureType old = FeatureArrayPropertyTypeImpl.this.getFeatureArray(i);
                FeatureArrayPropertyTypeImpl.this.removeFeature(i);
                return old;
            }
            
            @Override
            public int size()
                { return FeatureArrayPropertyTypeImpl.this.sizeOfFeatureArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new FeatureList();
        }
    }
    
    /**
     * Gets array of all "_Feature" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractFeatureType[] getFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractFeatureType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractFeatureType>();
            get_store().find_all_element_users(FEATURE$1, targetList);
            net.opengis.gml.AbstractFeatureType[] result = new net.opengis.gml.AbstractFeatureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Feature" element
     */
    public net.opengis.gml.AbstractFeatureType getFeatureArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().find_element_user(FEATURE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Feature" element
     */
    public int sizeOfFeatureArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FEATURE$1);
        }
    }
    
    /**
     * Sets array of all "_Feature" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setFeatureArray(net.opengis.gml.AbstractFeatureType[] featureArray)
    {
        check_orphaned();
        arraySetterHelper(featureArray, FEATURE$0, FEATURE$1);
    }
    
    /**
     * Sets ith "_Feature" element
     */
     public void setFeatureArray(int i, net.opengis.gml.AbstractFeatureType feature)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().find_element_user(FEATURE$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(feature);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Feature" element
     */
    public net.opengis.gml.AbstractFeatureType insertNewFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().insert_element_user(FEATURE$1, FEATURE$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Feature" element
     */
    public net.opengis.gml.AbstractFeatureType addNewFeature()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractFeatureType target = null;
            target = (net.opengis.gml.AbstractFeatureType)get_store().add_element_user(FEATURE$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Feature" element
     */
    public void removeFeature(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FEATURE$1, i);
        }
    }
}
