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
 * An XML GeometryArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeometryArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.GeometryArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public GeometryArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRY$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry");
    private static final org.apache.xmlbeans.QNameSet GEOMETRY$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometricComplex"),
    });
    
    
    /**
     * Gets a List of "_Geometry" elements
     */
    public java.util.List<net.opengis.gml.AbstractGeometryType> getGeometryList()
    {
        final class GeometryList extends java.util.AbstractList<net.opengis.gml.AbstractGeometryType>
        {
            @Override
            public net.opengis.gml.AbstractGeometryType get(int i)
                { return GeometryArrayPropertyTypeImpl.this.getGeometryArray(i); }
            
            @Override
            public net.opengis.gml.AbstractGeometryType set(int i, net.opengis.gml.AbstractGeometryType o)
            {
                net.opengis.gml.AbstractGeometryType old = GeometryArrayPropertyTypeImpl.this.getGeometryArray(i);
                GeometryArrayPropertyTypeImpl.this.setGeometryArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.AbstractGeometryType o)
                { GeometryArrayPropertyTypeImpl.this.insertNewGeometry(i).set(o); }
            
            @Override
            public net.opengis.gml.AbstractGeometryType remove(int i)
            {
                net.opengis.gml.AbstractGeometryType old = GeometryArrayPropertyTypeImpl.this.getGeometryArray(i);
                GeometryArrayPropertyTypeImpl.this.removeGeometry(i);
                return old;
            }
            
            @Override
            public int size()
                { return GeometryArrayPropertyTypeImpl.this.sizeOfGeometryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GeometryList();
        }
    }
    
    /**
     * Gets array of all "_Geometry" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.AbstractGeometryType[] getGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.AbstractGeometryType> targetList = new java.util.ArrayList<net.opengis.gml.AbstractGeometryType>();
            get_store().find_all_element_users(GEOMETRY$1, targetList);
            net.opengis.gml.AbstractGeometryType[] result = new net.opengis.gml.AbstractGeometryType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Geometry" element
     */
    public net.opengis.gml.AbstractGeometryType getGeometryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(GEOMETRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Geometry" element
     */
    public int sizeOfGeometryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GEOMETRY$1);
        }
    }
    
    /**
     * Sets array of all "_Geometry" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setGeometryArray(net.opengis.gml.AbstractGeometryType[] geometryArray)
    {
        check_orphaned();
        arraySetterHelper(geometryArray, GEOMETRY$0, GEOMETRY$1);
    }
    
    /**
     * Sets ith "_Geometry" element
     */
     public void setGeometryArray(int i, net.opengis.gml.AbstractGeometryType geometry)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().find_element_user(GEOMETRY$1, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(geometry);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Geometry" element
     */
    public net.opengis.gml.AbstractGeometryType insertNewGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().insert_element_user(GEOMETRY$1, GEOMETRY$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Geometry" element
     */
    public net.opengis.gml.AbstractGeometryType addNewGeometry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometryType target = null;
            target = (net.opengis.gml.AbstractGeometryType)get_store().add_element_user(GEOMETRY$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Geometry" element
     */
    public void removeGeometry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GEOMETRY$1, i);
        }
    }
}
