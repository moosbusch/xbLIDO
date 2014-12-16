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
 * An XML ValueArrayPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class ValueArrayPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.ValueArrayPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public ValueArrayPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BOOLEAN$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Boolean");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Category");
    private static final javax.xml.namespace.QName QUANTITY$4 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Quantity");
    private static final javax.xml.namespace.QName COUNT$6 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Count");
    private static final javax.xml.namespace.QName BOOLEANLIST$8 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BooleanList");
    private static final javax.xml.namespace.QName CATEGORYLIST$10 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryList");
    private static final javax.xml.namespace.QName QUANTITYLIST$12 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityList");
    private static final javax.xml.namespace.QName COUNTLIST$14 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountList");
    private static final javax.xml.namespace.QName CATEGORYEXTENT$16 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CategoryExtent");
    private static final javax.xml.namespace.QName QUANTITYEXTENT$18 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "QuantityExtent");
    private static final javax.xml.namespace.QName COUNTEXTENT$20 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CountExtent");
    private static final javax.xml.namespace.QName COMPOSITEVALUE$22 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue");
    private static final org.apache.xmlbeans.QNameSet COMPOSITEVALUE$23 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeValue"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ValueArray"),
    });
    private static final javax.xml.namespace.QName OBJECT$24 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object");
    private static final org.apache.xmlbeans.QNameSet OBJECT$25 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UnitDefinition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameterGroup"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolidCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeodeticDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Conversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GraphStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralConversion"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TriangulatedSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearRing"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConcatenatedOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Datum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CylindricalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGridCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureCollection"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimePrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PrimeMeridian"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendar"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "RectifiedGrid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ConventionalUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "FeatureStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometricComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TopoPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeTopologyComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_MetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Feature"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EllipsoidalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolarCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeObject"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Topology"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Geometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationMethod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Solid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bag"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCalendarEra"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurveCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CoordinateReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompoundCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurfaceCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ContinuousCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_SingleOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PolyhedralSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralDerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_CRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MovingObjectStatus"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimePeriod"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Edge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Coverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ellipsoid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPointCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeSlice"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "PassThroughOperation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GML"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeTopologyPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeCoordinateSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DirectedObservationAtDistance"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopologyStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TemporalDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeEdge"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeNode"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeographicCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Node"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Array"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ImageDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_ImplicitGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeocentricCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "EngineeringDatum"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Transformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeClock"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LinearCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GenericMetaData"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "SphericalCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Point"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Style"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Observation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeOrdinalReferenceSystem"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BaseUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Object"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ProjectedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Tin"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "GeometryStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_DiscreteCoverage"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Definition"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ObliqueCartesianCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Face"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Surface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralOperationParameter"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Polygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DefinitionProxy"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LabelStyle"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeGeometricPrimitive"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Operation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CoordinateSystemAxis"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "UserDefinedCS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Ring"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeneralTransformation"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_TimeComplex"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Dictionary"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "VerticalCRS"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "DerivedUnit"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Grid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TimeInstant"),
    });
    private static final javax.xml.namespace.QName NULL$26 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Null");
    
    
    /**
     * Gets a List of "Boolean" elements
     */
    public java.util.List<java.lang.Boolean> getBooleanList()
    {
        final class BooleanList extends java.util.AbstractList<java.lang.Boolean>
        {
            @Override
            public java.lang.Boolean get(int i)
                { return ValueArrayPropertyTypeImpl.this.getBooleanArray(i); }
            
            @Override
            public java.lang.Boolean set(int i, java.lang.Boolean o)
            {
                java.lang.Boolean old = ValueArrayPropertyTypeImpl.this.getBooleanArray(i);
                ValueArrayPropertyTypeImpl.this.setBooleanArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.Boolean o)
                { ValueArrayPropertyTypeImpl.this.insertBoolean(i, o); }
            
            @Override
            public java.lang.Boolean remove(int i)
            {
                java.lang.Boolean old = ValueArrayPropertyTypeImpl.this.getBooleanArray(i);
                ValueArrayPropertyTypeImpl.this.removeBoolean(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfBooleanArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanList();
        }
    }
    
    /**
     * Gets array of all "Boolean" elements
     * @deprecated
     */
    @Deprecated
    public boolean[] getBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlBoolean> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlBoolean>();
            get_store().find_all_element_users(BOOLEAN$0, targetList);
            boolean[] result = new boolean[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBooleanValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Boolean" element
     */
    public boolean getBooleanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Boolean" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlBoolean> xgetBooleanList()
    {
        final class BooleanList extends java.util.AbstractList<org.apache.xmlbeans.XmlBoolean>
        {
            @Override
            public org.apache.xmlbeans.XmlBoolean get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetBooleanArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlBoolean set(int i, org.apache.xmlbeans.XmlBoolean o)
            {
                org.apache.xmlbeans.XmlBoolean old = ValueArrayPropertyTypeImpl.this.xgetBooleanArray(i);
                ValueArrayPropertyTypeImpl.this.xsetBooleanArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlBoolean o)
                { ValueArrayPropertyTypeImpl.this.insertNewBoolean(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlBoolean remove(int i)
            {
                org.apache.xmlbeans.XmlBoolean old = ValueArrayPropertyTypeImpl.this.xgetBooleanArray(i);
                ValueArrayPropertyTypeImpl.this.removeBoolean(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfBooleanArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanList();
        }
    }
    
    /**
     * Gets array of all "Boolean" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlBoolean[] xgetBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlBoolean> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlBoolean>();
            get_store().find_all_element_users(BOOLEAN$0, targetList);
            org.apache.xmlbeans.XmlBoolean[] result = new org.apache.xmlbeans.XmlBoolean[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetBooleanArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Boolean" element
     */
    public int sizeOfBooleanArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEAN$0);
        }
    }
    
    /**
     * Sets array of all "Boolean" element
     */
     public void setBooleanArray(boolean[] xbooleanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xbooleanArray, BOOLEAN$0);
        }
    }
    
    /**
     * Sets ith "Boolean" element
     */
     public void setBooleanArray(int i, boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Sets (as xml) array of all "Boolean" element
     */
    public void xsetBooleanArray(org.apache.xmlbeans.XmlBoolean[]xbooleanArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xbooleanArray, BOOLEAN$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Boolean" element
     */
    public void xsetBooleanArray(int i, org.apache.xmlbeans.XmlBoolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(BOOLEAN$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xboolean);
        }
    }
    
    /**
     * Inserts the value as the ith "Boolean" element
     */
    public void insertBoolean(int i, boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOLEAN$0, i);
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Appends the value as the last "Boolean" element
     */
    public void addBoolean(boolean xboolean)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEAN$0);
            target.setBooleanValue(xboolean);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean insertNewBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().insert_element_user(BOOLEAN$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Boolean" element
     */
    public org.apache.xmlbeans.XmlBoolean addNewBoolean()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(BOOLEAN$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Boolean" element
     */
    public void removeBoolean(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEAN$0, i);
        }
    }
    
    /**
     * Gets a List of "Category" elements
     */
    public java.util.List<net.opengis.gml.CodeType> getCategoryList()
    {
        final class CategoryList extends java.util.AbstractList<net.opengis.gml.CodeType>
        {
            @Override
            public net.opengis.gml.CodeType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCategoryArray(i); }
            
            @Override
            public net.opengis.gml.CodeType set(int i, net.opengis.gml.CodeType o)
            {
                net.opengis.gml.CodeType old = ValueArrayPropertyTypeImpl.this.getCategoryArray(i);
                ValueArrayPropertyTypeImpl.this.setCategoryArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeType o)
                { ValueArrayPropertyTypeImpl.this.insertNewCategory(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeType remove(int i)
            {
                net.opengis.gml.CodeType old = ValueArrayPropertyTypeImpl.this.getCategoryArray(i);
                ValueArrayPropertyTypeImpl.this.removeCategory(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCategoryArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryList();
        }
    }
    
    /**
     * Gets array of all "Category" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CodeType[] getCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CodeType> targetList = new java.util.ArrayList<net.opengis.gml.CodeType>();
            get_store().find_all_element_users(CATEGORY$2, targetList);
            net.opengis.gml.CodeType[] result = new net.opengis.gml.CodeType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Category" element
     */
    public net.opengis.gml.CodeType getCategoryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().find_element_user(CATEGORY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Category" element
     */
    public int sizeOfCategoryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2);
        }
    }
    
    /**
     * Sets array of all "Category" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setCategoryArray(net.opengis.gml.CodeType[] categoryArray)
    {
        check_orphaned();
        arraySetterHelper(categoryArray, CATEGORY$2);
    }
    
    /**
     * Sets ith "Category" element
     */
     public void setCategoryArray(int i, net.opengis.gml.CodeType category)
    {
        generatedSetterHelperImpl(category, CATEGORY$2, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Category" element
     */
    public net.opengis.gml.CodeType insertNewCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().insert_element_user(CATEGORY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Category" element
     */
    public net.opengis.gml.CodeType addNewCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeType target = null;
            target = (net.opengis.gml.CodeType)get_store().add_element_user(CATEGORY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "Category" element
     */
    public void removeCategory(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, i);
        }
    }
    
    /**
     * Gets a List of "Quantity" elements
     */
    public java.util.List<net.opengis.gml.MeasureType> getQuantityList()
    {
        final class QuantityList extends java.util.AbstractList<net.opengis.gml.MeasureType>
        {
            @Override
            public net.opengis.gml.MeasureType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getQuantityArray(i); }
            
            @Override
            public net.opengis.gml.MeasureType set(int i, net.opengis.gml.MeasureType o)
            {
                net.opengis.gml.MeasureType old = ValueArrayPropertyTypeImpl.this.getQuantityArray(i);
                ValueArrayPropertyTypeImpl.this.setQuantityArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.MeasureType o)
                { ValueArrayPropertyTypeImpl.this.insertNewQuantity(i).set(o); }
            
            @Override
            public net.opengis.gml.MeasureType remove(int i)
            {
                net.opengis.gml.MeasureType old = ValueArrayPropertyTypeImpl.this.getQuantityArray(i);
                ValueArrayPropertyTypeImpl.this.removeQuantity(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfQuantityArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QuantityList();
        }
    }
    
    /**
     * Gets array of all "Quantity" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.MeasureType[] getQuantityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.MeasureType> targetList = new java.util.ArrayList<net.opengis.gml.MeasureType>();
            get_store().find_all_element_users(QUANTITY$4, targetList);
            net.opengis.gml.MeasureType[] result = new net.opengis.gml.MeasureType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Quantity" element
     */
    public net.opengis.gml.MeasureType getQuantityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().find_element_user(QUANTITY$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Quantity" element
     */
    public int sizeOfQuantityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITY$4);
        }
    }
    
    /**
     * Sets array of all "Quantity" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setQuantityArray(net.opengis.gml.MeasureType[] quantityArray)
    {
        check_orphaned();
        arraySetterHelper(quantityArray, QUANTITY$4);
    }
    
    /**
     * Sets ith "Quantity" element
     */
     public void setQuantityArray(int i, net.opengis.gml.MeasureType quantity)
    {
        generatedSetterHelperImpl(quantity, QUANTITY$4, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Quantity" element
     */
    public net.opengis.gml.MeasureType insertNewQuantity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().insert_element_user(QUANTITY$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Quantity" element
     */
    public net.opengis.gml.MeasureType addNewQuantity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureType target = null;
            target = (net.opengis.gml.MeasureType)get_store().add_element_user(QUANTITY$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Quantity" element
     */
    public void removeQuantity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITY$4, i);
        }
    }
    
    /**
     * Gets a List of "Count" elements
     */
    public java.util.List<java.math.BigInteger> getCountList()
    {
        final class CountList extends java.util.AbstractList<java.math.BigInteger>
        {
            @Override
            public java.math.BigInteger get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCountArray(i); }
            
            @Override
            public java.math.BigInteger set(int i, java.math.BigInteger o)
            {
                java.math.BigInteger old = ValueArrayPropertyTypeImpl.this.getCountArray(i);
                ValueArrayPropertyTypeImpl.this.setCountArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.math.BigInteger o)
                { ValueArrayPropertyTypeImpl.this.insertCount(i, o); }
            
            @Override
            public java.math.BigInteger remove(int i)
            {
                java.math.BigInteger old = ValueArrayPropertyTypeImpl.this.getCountArray(i);
                ValueArrayPropertyTypeImpl.this.removeCount(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountList();
        }
    }
    
    /**
     * Gets array of all "Count" elements
     * @deprecated
     */
    @Deprecated
    public java.math.BigInteger[] getCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlInteger>();
            get_store().find_all_element_users(COUNT$6, targetList);
            java.math.BigInteger[] result = new java.math.BigInteger[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getBigIntegerValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Count" element
     */
    public java.math.BigInteger getCountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Count" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlInteger> xgetCountList()
    {
        final class CountList extends java.util.AbstractList<org.apache.xmlbeans.XmlInteger>
        {
            @Override
            public org.apache.xmlbeans.XmlInteger get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetCountArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlInteger set(int i, org.apache.xmlbeans.XmlInteger o)
            {
                org.apache.xmlbeans.XmlInteger old = ValueArrayPropertyTypeImpl.this.xgetCountArray(i);
                ValueArrayPropertyTypeImpl.this.xsetCountArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlInteger o)
                { ValueArrayPropertyTypeImpl.this.insertNewCount(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlInteger remove(int i)
            {
                org.apache.xmlbeans.XmlInteger old = ValueArrayPropertyTypeImpl.this.xgetCountArray(i);
                ValueArrayPropertyTypeImpl.this.removeCount(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountList();
        }
    }
    
    /**
     * Gets array of all "Count" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlInteger[] xgetCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlInteger> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlInteger>();
            get_store().find_all_element_users(COUNT$6, targetList);
            org.apache.xmlbeans.XmlInteger[] result = new org.apache.xmlbeans.XmlInteger[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Count" element
     */
    public org.apache.xmlbeans.XmlInteger xgetCountArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Count" element
     */
    public int sizeOfCountArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNT$6);
        }
    }
    
    /**
     * Sets array of all "Count" element
     */
     public void setCountArray(java.math.BigInteger[] countArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countArray, COUNT$6);
        }
    }
    
    /**
     * Sets ith "Count" element
     */
     public void setCountArray(int i, java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Sets (as xml) array of all "Count" element
     */
    public void xsetCountArray(org.apache.xmlbeans.XmlInteger[]countArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countArray, COUNT$6);
        }
    }
    
    /**
     * Sets (as xml) ith "Count" element
     */
    public void xsetCountArray(int i, org.apache.xmlbeans.XmlInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().find_element_user(COUNT$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(count);
        }
    }
    
    /**
     * Inserts the value as the ith "Count" element
     */
    public void insertCount(int i, java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COUNT$6, i);
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Appends the value as the last "Count" element
     */
    public void addCount(java.math.BigInteger count)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNT$6);
            target.setBigIntegerValue(count);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Count" element
     */
    public org.apache.xmlbeans.XmlInteger insertNewCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().insert_element_user(COUNT$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Count" element
     */
    public org.apache.xmlbeans.XmlInteger addNewCount()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInteger target = null;
            target = (org.apache.xmlbeans.XmlInteger)get_store().add_element_user(COUNT$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "Count" element
     */
    public void removeCount(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNT$6, i);
        }
    }
    
    /**
     * Gets a List of "BooleanList" elements
     */
    public java.util.List<java.util.List> getBooleanListList()
    {
        final class BooleanListList extends java.util.AbstractList<java.util.List>
        {
            @Override
            public java.util.List get(int i)
                { return ValueArrayPropertyTypeImpl.this.getBooleanListArray(i); }
            
            @Override
            public java.util.List set(int i, java.util.List o)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getBooleanListArray(i);
                ValueArrayPropertyTypeImpl.this.setBooleanListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.util.List o)
                { ValueArrayPropertyTypeImpl.this.insertBooleanList(i, o); }
            
            @Override
            public java.util.List remove(int i)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getBooleanListArray(i);
                ValueArrayPropertyTypeImpl.this.removeBooleanList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfBooleanListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanListList();
        }
    }
    
    /**
     * Gets array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    public java.util.List[] getBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.BooleanOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.BooleanOrNullList>();
            get_store().find_all_element_users(BOOLEANLIST$8, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "BooleanList" element
     */
    public java.util.List getBooleanListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "BooleanList" elements
     */
    public java.util.List<net.opengis.gml.BooleanOrNullList> xgetBooleanListList()
    {
        final class BooleanListList extends java.util.AbstractList<net.opengis.gml.BooleanOrNullList>
        {
            @Override
            public net.opengis.gml.BooleanOrNullList get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetBooleanListArray(i); }
            
            @Override
            public net.opengis.gml.BooleanOrNullList set(int i, net.opengis.gml.BooleanOrNullList o)
            {
                net.opengis.gml.BooleanOrNullList old = ValueArrayPropertyTypeImpl.this.xgetBooleanListArray(i);
                ValueArrayPropertyTypeImpl.this.xsetBooleanListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.BooleanOrNullList o)
                { ValueArrayPropertyTypeImpl.this.insertNewBooleanList(i).set(o); }
            
            @Override
            public net.opengis.gml.BooleanOrNullList remove(int i)
            {
                net.opengis.gml.BooleanOrNullList old = ValueArrayPropertyTypeImpl.this.xgetBooleanListArray(i);
                ValueArrayPropertyTypeImpl.this.removeBooleanList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfBooleanListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new BooleanListList();
        }
    }
    
    /**
     * Gets array of all "BooleanList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.BooleanOrNullList[] xgetBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.BooleanOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.BooleanOrNullList>();
            get_store().find_all_element_users(BOOLEANLIST$8, targetList);
            net.opengis.gml.BooleanOrNullList[] result = new net.opengis.gml.BooleanOrNullList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList xgetBooleanListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "BooleanList" element
     */
    public int sizeOfBooleanListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BOOLEANLIST$8);
        }
    }
    
    /**
     * Sets array of all "BooleanList" element
     */
     public void setBooleanListArray(java.util.List[] booleanListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanListArray, BOOLEANLIST$8);
        }
    }
    
    /**
     * Sets ith "BooleanList" element
     */
     public void setBooleanListArray(int i, java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BOOLEANLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Sets (as xml) array of all "BooleanList" element
     */
    public void xsetBooleanListArray(net.opengis.gml.BooleanOrNullList[]booleanListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(booleanListArray, BOOLEANLIST$8);
        }
    }
    
    /**
     * Sets (as xml) ith "BooleanList" element
     */
    public void xsetBooleanListArray(int i, net.opengis.gml.BooleanOrNullList booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().find_element_user(BOOLEANLIST$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(booleanList);
        }
    }
    
    /**
     * Inserts the value as the ith "BooleanList" element
     */
    public void insertBooleanList(int i, java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(BOOLEANLIST$8, i);
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Appends the value as the last "BooleanList" element
     */
    public void addBooleanList(java.util.List booleanList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BOOLEANLIST$8);
            target.setListValue(booleanList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList insertNewBooleanList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().insert_element_user(BOOLEANLIST$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "BooleanList" element
     */
    public net.opengis.gml.BooleanOrNullList addNewBooleanList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BooleanOrNullList target = null;
            target = (net.opengis.gml.BooleanOrNullList)get_store().add_element_user(BOOLEANLIST$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "BooleanList" element
     */
    public void removeBooleanList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BOOLEANLIST$8, i);
        }
    }
    
    /**
     * Gets a List of "CategoryList" elements
     */
    public java.util.List<net.opengis.gml.CodeOrNullListType> getCategoryListList()
    {
        final class CategoryListList extends java.util.AbstractList<net.opengis.gml.CodeOrNullListType>
        {
            @Override
            public net.opengis.gml.CodeOrNullListType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCategoryListArray(i); }
            
            @Override
            public net.opengis.gml.CodeOrNullListType set(int i, net.opengis.gml.CodeOrNullListType o)
            {
                net.opengis.gml.CodeOrNullListType old = ValueArrayPropertyTypeImpl.this.getCategoryListArray(i);
                ValueArrayPropertyTypeImpl.this.setCategoryListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CodeOrNullListType o)
                { ValueArrayPropertyTypeImpl.this.insertNewCategoryList(i).set(o); }
            
            @Override
            public net.opengis.gml.CodeOrNullListType remove(int i)
            {
                net.opengis.gml.CodeOrNullListType old = ValueArrayPropertyTypeImpl.this.getCategoryListArray(i);
                ValueArrayPropertyTypeImpl.this.removeCategoryList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCategoryListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryListList();
        }
    }
    
    /**
     * Gets array of all "CategoryList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CodeOrNullListType[] getCategoryListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CodeOrNullListType> targetList = new java.util.ArrayList<net.opengis.gml.CodeOrNullListType>();
            get_store().find_all_element_users(CATEGORYLIST$10, targetList);
            net.opengis.gml.CodeOrNullListType[] result = new net.opengis.gml.CodeOrNullListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType getCategoryListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().find_element_user(CATEGORYLIST$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryList" element
     */
    public int sizeOfCategoryListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYLIST$10);
        }
    }
    
    /**
     * Sets array of all "CategoryList" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setCategoryListArray(net.opengis.gml.CodeOrNullListType[] categoryListArray)
    {
        check_orphaned();
        arraySetterHelper(categoryListArray, CATEGORYLIST$10);
    }
    
    /**
     * Sets ith "CategoryList" element
     */
     public void setCategoryListArray(int i, net.opengis.gml.CodeOrNullListType categoryList)
    {
        generatedSetterHelperImpl(categoryList, CATEGORYLIST$10, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType insertNewCategoryList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().insert_element_user(CATEGORYLIST$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryList" element
     */
    public net.opengis.gml.CodeOrNullListType addNewCategoryList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CodeOrNullListType target = null;
            target = (net.opengis.gml.CodeOrNullListType)get_store().add_element_user(CATEGORYLIST$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryList" element
     */
    public void removeCategoryList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYLIST$10, i);
        }
    }
    
    /**
     * Gets a List of "QuantityList" elements
     */
    public java.util.List<net.opengis.gml.MeasureOrNullListType> getQuantityListList()
    {
        final class QuantityListList extends java.util.AbstractList<net.opengis.gml.MeasureOrNullListType>
        {
            @Override
            public net.opengis.gml.MeasureOrNullListType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getQuantityListArray(i); }
            
            @Override
            public net.opengis.gml.MeasureOrNullListType set(int i, net.opengis.gml.MeasureOrNullListType o)
            {
                net.opengis.gml.MeasureOrNullListType old = ValueArrayPropertyTypeImpl.this.getQuantityListArray(i);
                ValueArrayPropertyTypeImpl.this.setQuantityListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.MeasureOrNullListType o)
                { ValueArrayPropertyTypeImpl.this.insertNewQuantityList(i).set(o); }
            
            @Override
            public net.opengis.gml.MeasureOrNullListType remove(int i)
            {
                net.opengis.gml.MeasureOrNullListType old = ValueArrayPropertyTypeImpl.this.getQuantityListArray(i);
                ValueArrayPropertyTypeImpl.this.removeQuantityList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfQuantityListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QuantityListList();
        }
    }
    
    /**
     * Gets array of all "QuantityList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.MeasureOrNullListType[] getQuantityListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.MeasureOrNullListType> targetList = new java.util.ArrayList<net.opengis.gml.MeasureOrNullListType>();
            get_store().find_all_element_users(QUANTITYLIST$12, targetList);
            net.opengis.gml.MeasureOrNullListType[] result = new net.opengis.gml.MeasureOrNullListType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType getQuantityListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().find_element_user(QUANTITYLIST$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityList" element
     */
    public int sizeOfQuantityListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYLIST$12);
        }
    }
    
    /**
     * Sets array of all "QuantityList" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setQuantityListArray(net.opengis.gml.MeasureOrNullListType[] quantityListArray)
    {
        check_orphaned();
        arraySetterHelper(quantityListArray, QUANTITYLIST$12);
    }
    
    /**
     * Sets ith "QuantityList" element
     */
     public void setQuantityListArray(int i, net.opengis.gml.MeasureOrNullListType quantityList)
    {
        generatedSetterHelperImpl(quantityList, QUANTITYLIST$12, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType insertNewQuantityList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().insert_element_user(QUANTITYLIST$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityList" element
     */
    public net.opengis.gml.MeasureOrNullListType addNewQuantityList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.MeasureOrNullListType target = null;
            target = (net.opengis.gml.MeasureOrNullListType)get_store().add_element_user(QUANTITYLIST$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityList" element
     */
    public void removeQuantityList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYLIST$12, i);
        }
    }
    
    /**
     * Gets a List of "CountList" elements
     */
    public java.util.List<java.util.List> getCountListList()
    {
        final class CountListList extends java.util.AbstractList<java.util.List>
        {
            @Override
            public java.util.List get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCountListArray(i); }
            
            @Override
            public java.util.List set(int i, java.util.List o)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getCountListArray(i);
                ValueArrayPropertyTypeImpl.this.setCountListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.util.List o)
                { ValueArrayPropertyTypeImpl.this.insertCountList(i, o); }
            
            @Override
            public java.util.List remove(int i)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getCountListArray(i);
                ValueArrayPropertyTypeImpl.this.removeCountList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountListList();
        }
    }
    
    /**
     * Gets array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    public java.util.List[] getCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IntegerOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.IntegerOrNullList>();
            get_store().find_all_element_users(COUNTLIST$14, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CountList" element
     */
    public java.util.List getCountListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "CountList" elements
     */
    public java.util.List<net.opengis.gml.IntegerOrNullList> xgetCountListList()
    {
        final class CountListList extends java.util.AbstractList<net.opengis.gml.IntegerOrNullList>
        {
            @Override
            public net.opengis.gml.IntegerOrNullList get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetCountListArray(i); }
            
            @Override
            public net.opengis.gml.IntegerOrNullList set(int i, net.opengis.gml.IntegerOrNullList o)
            {
                net.opengis.gml.IntegerOrNullList old = ValueArrayPropertyTypeImpl.this.xgetCountListArray(i);
                ValueArrayPropertyTypeImpl.this.xsetCountListArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.IntegerOrNullList o)
                { ValueArrayPropertyTypeImpl.this.insertNewCountList(i).set(o); }
            
            @Override
            public net.opengis.gml.IntegerOrNullList remove(int i)
            {
                net.opengis.gml.IntegerOrNullList old = ValueArrayPropertyTypeImpl.this.xgetCountListArray(i);
                ValueArrayPropertyTypeImpl.this.removeCountList(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountListArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountListList();
        }
    }
    
    /**
     * Gets array of all "CountList" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.IntegerOrNullList[] xgetCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.IntegerOrNullList> targetList = new java.util.ArrayList<net.opengis.gml.IntegerOrNullList>();
            get_store().find_all_element_users(COUNTLIST$14, targetList);
            net.opengis.gml.IntegerOrNullList[] result = new net.opengis.gml.IntegerOrNullList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList xgetCountListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CountList" element
     */
    public int sizeOfCountListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTLIST$14);
        }
    }
    
    /**
     * Sets array of all "CountList" element
     */
     public void setCountListArray(java.util.List[] countListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countListArray, COUNTLIST$14);
        }
    }
    
    /**
     * Sets ith "CountList" element
     */
     public void setCountListArray(int i, java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTLIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(countList);
        }
    }
    
    /**
     * Sets (as xml) array of all "CountList" element
     */
    public void xsetCountListArray(net.opengis.gml.IntegerOrNullList[]countListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countListArray, COUNTLIST$14);
        }
    }
    
    /**
     * Sets (as xml) ith "CountList" element
     */
    public void xsetCountListArray(int i, net.opengis.gml.IntegerOrNullList countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().find_element_user(COUNTLIST$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(countList);
        }
    }
    
    /**
     * Inserts the value as the ith "CountList" element
     */
    public void insertCountList(int i, java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COUNTLIST$14, i);
            target.setListValue(countList);
        }
    }
    
    /**
     * Appends the value as the last "CountList" element
     */
    public void addCountList(java.util.List countList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTLIST$14);
            target.setListValue(countList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList insertNewCountList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().insert_element_user(COUNTLIST$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CountList" element
     */
    public net.opengis.gml.IntegerOrNullList addNewCountList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.IntegerOrNullList target = null;
            target = (net.opengis.gml.IntegerOrNullList)get_store().add_element_user(COUNTLIST$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "CountList" element
     */
    public void removeCountList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTLIST$14, i);
        }
    }
    
    /**
     * Gets a List of "CategoryExtent" elements
     */
    public java.util.List<net.opengis.gml.CategoryExtentType> getCategoryExtentList()
    {
        final class CategoryExtentList extends java.util.AbstractList<net.opengis.gml.CategoryExtentType>
        {
            @Override
            public net.opengis.gml.CategoryExtentType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCategoryExtentArray(i); }
            
            @Override
            public net.opengis.gml.CategoryExtentType set(int i, net.opengis.gml.CategoryExtentType o)
            {
                net.opengis.gml.CategoryExtentType old = ValueArrayPropertyTypeImpl.this.getCategoryExtentArray(i);
                ValueArrayPropertyTypeImpl.this.setCategoryExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CategoryExtentType o)
                { ValueArrayPropertyTypeImpl.this.insertNewCategoryExtent(i).set(o); }
            
            @Override
            public net.opengis.gml.CategoryExtentType remove(int i)
            {
                net.opengis.gml.CategoryExtentType old = ValueArrayPropertyTypeImpl.this.getCategoryExtentArray(i);
                ValueArrayPropertyTypeImpl.this.removeCategoryExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCategoryExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CategoryExtentList();
        }
    }
    
    /**
     * Gets array of all "CategoryExtent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CategoryExtentType[] getCategoryExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CategoryExtentType> targetList = new java.util.ArrayList<net.opengis.gml.CategoryExtentType>();
            get_store().find_all_element_users(CATEGORYEXTENT$16, targetList);
            net.opengis.gml.CategoryExtentType[] result = new net.opengis.gml.CategoryExtentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType getCategoryExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().find_element_user(CATEGORYEXTENT$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CategoryExtent" element
     */
    public int sizeOfCategoryExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYEXTENT$16);
        }
    }
    
    /**
     * Sets array of all "CategoryExtent" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setCategoryExtentArray(net.opengis.gml.CategoryExtentType[] categoryExtentArray)
    {
        check_orphaned();
        arraySetterHelper(categoryExtentArray, CATEGORYEXTENT$16);
    }
    
    /**
     * Sets ith "CategoryExtent" element
     */
     public void setCategoryExtentArray(int i, net.opengis.gml.CategoryExtentType categoryExtent)
    {
        generatedSetterHelperImpl(categoryExtent, CATEGORYEXTENT$16, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType insertNewCategoryExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().insert_element_user(CATEGORYEXTENT$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CategoryExtent" element
     */
    public net.opengis.gml.CategoryExtentType addNewCategoryExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CategoryExtentType target = null;
            target = (net.opengis.gml.CategoryExtentType)get_store().add_element_user(CATEGORYEXTENT$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "CategoryExtent" element
     */
    public void removeCategoryExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYEXTENT$16, i);
        }
    }
    
    /**
     * Gets a List of "QuantityExtent" elements
     */
    public java.util.List<net.opengis.gml.QuantityExtentType> getQuantityExtentList()
    {
        final class QuantityExtentList extends java.util.AbstractList<net.opengis.gml.QuantityExtentType>
        {
            @Override
            public net.opengis.gml.QuantityExtentType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getQuantityExtentArray(i); }
            
            @Override
            public net.opengis.gml.QuantityExtentType set(int i, net.opengis.gml.QuantityExtentType o)
            {
                net.opengis.gml.QuantityExtentType old = ValueArrayPropertyTypeImpl.this.getQuantityExtentArray(i);
                ValueArrayPropertyTypeImpl.this.setQuantityExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.QuantityExtentType o)
                { ValueArrayPropertyTypeImpl.this.insertNewQuantityExtent(i).set(o); }
            
            @Override
            public net.opengis.gml.QuantityExtentType remove(int i)
            {
                net.opengis.gml.QuantityExtentType old = ValueArrayPropertyTypeImpl.this.getQuantityExtentArray(i);
                ValueArrayPropertyTypeImpl.this.removeQuantityExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfQuantityExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new QuantityExtentList();
        }
    }
    
    /**
     * Gets array of all "QuantityExtent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.QuantityExtentType[] getQuantityExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.QuantityExtentType> targetList = new java.util.ArrayList<net.opengis.gml.QuantityExtentType>();
            get_store().find_all_element_users(QUANTITYEXTENT$18, targetList);
            net.opengis.gml.QuantityExtentType[] result = new net.opengis.gml.QuantityExtentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType getQuantityExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().find_element_user(QUANTITYEXTENT$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "QuantityExtent" element
     */
    public int sizeOfQuantityExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUANTITYEXTENT$18);
        }
    }
    
    /**
     * Sets array of all "QuantityExtent" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setQuantityExtentArray(net.opengis.gml.QuantityExtentType[] quantityExtentArray)
    {
        check_orphaned();
        arraySetterHelper(quantityExtentArray, QUANTITYEXTENT$18);
    }
    
    /**
     * Sets ith "QuantityExtent" element
     */
     public void setQuantityExtentArray(int i, net.opengis.gml.QuantityExtentType quantityExtent)
    {
        generatedSetterHelperImpl(quantityExtent, QUANTITYEXTENT$18, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType insertNewQuantityExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().insert_element_user(QUANTITYEXTENT$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "QuantityExtent" element
     */
    public net.opengis.gml.QuantityExtentType addNewQuantityExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.QuantityExtentType target = null;
            target = (net.opengis.gml.QuantityExtentType)get_store().add_element_user(QUANTITYEXTENT$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "QuantityExtent" element
     */
    public void removeQuantityExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUANTITYEXTENT$18, i);
        }
    }
    
    /**
     * Gets a List of "CountExtent" elements
     */
    public java.util.List<java.util.List> getCountExtentList()
    {
        final class CountExtentList extends java.util.AbstractList<java.util.List>
        {
            @Override
            public java.util.List get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCountExtentArray(i); }
            
            @Override
            public java.util.List set(int i, java.util.List o)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getCountExtentArray(i);
                ValueArrayPropertyTypeImpl.this.setCountExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.util.List o)
                { ValueArrayPropertyTypeImpl.this.insertCountExtent(i, o); }
            
            @Override
            public java.util.List remove(int i)
            {
                java.util.List old = ValueArrayPropertyTypeImpl.this.getCountExtentArray(i);
                ValueArrayPropertyTypeImpl.this.removeCountExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountExtentList();
        }
    }
    
    /**
     * Gets array of all "CountExtent" elements
     * @deprecated
     */
    @Deprecated
    public java.util.List[] getCountExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CountExtentType> targetList = new java.util.ArrayList<net.opengis.gml.CountExtentType>();
            get_store().find_all_element_users(COUNTEXTENT$20, targetList);
            java.util.List[] result = new java.util.List[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getListValue();
            return result;
        }
    }
    
    /**
     * Gets ith "CountExtent" element
     */
    public java.util.List getCountExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "CountExtent" elements
     */
    public java.util.List<net.opengis.gml.CountExtentType> xgetCountExtentList()
    {
        final class CountExtentList extends java.util.AbstractList<net.opengis.gml.CountExtentType>
        {
            @Override
            public net.opengis.gml.CountExtentType get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetCountExtentArray(i); }
            
            @Override
            public net.opengis.gml.CountExtentType set(int i, net.opengis.gml.CountExtentType o)
            {
                net.opengis.gml.CountExtentType old = ValueArrayPropertyTypeImpl.this.xgetCountExtentArray(i);
                ValueArrayPropertyTypeImpl.this.xsetCountExtentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CountExtentType o)
                { ValueArrayPropertyTypeImpl.this.insertNewCountExtent(i).set(o); }
            
            @Override
            public net.opengis.gml.CountExtentType remove(int i)
            {
                net.opengis.gml.CountExtentType old = ValueArrayPropertyTypeImpl.this.xgetCountExtentArray(i);
                ValueArrayPropertyTypeImpl.this.removeCountExtent(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCountExtentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CountExtentList();
        }
    }
    
    /**
     * Gets array of all "CountExtent" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CountExtentType[] xgetCountExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CountExtentType> targetList = new java.util.ArrayList<net.opengis.gml.CountExtentType>();
            get_store().find_all_element_users(COUNTEXTENT$20, targetList);
            net.opengis.gml.CountExtentType[] result = new net.opengis.gml.CountExtentType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "CountExtent" element
     */
    public net.opengis.gml.CountExtentType xgetCountExtentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CountExtent" element
     */
    public int sizeOfCountExtentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTEXTENT$20);
        }
    }
    
    /**
     * Sets array of all "CountExtent" element
     */
     public void setCountExtentArray(java.util.List[] countExtentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countExtentArray, COUNTEXTENT$20);
        }
    }
    
    /**
     * Sets ith "CountExtent" element
     */
     public void setCountExtentArray(int i, java.util.List countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COUNTEXTENT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setListValue(countExtent);
        }
    }
    
    /**
     * Sets (as xml) array of all "CountExtent" element
     */
    public void xsetCountExtentArray(net.opengis.gml.CountExtentType[]countExtentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countExtentArray, COUNTEXTENT$20);
        }
    }
    
    /**
     * Sets (as xml) ith "CountExtent" element
     */
    public void xsetCountExtentArray(int i, net.opengis.gml.CountExtentType countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().find_element_user(COUNTEXTENT$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(countExtent);
        }
    }
    
    /**
     * Inserts the value as the ith "CountExtent" element
     */
    public void insertCountExtent(int i, java.util.List countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COUNTEXTENT$20, i);
            target.setListValue(countExtent);
        }
    }
    
    /**
     * Appends the value as the last "CountExtent" element
     */
    public void addCountExtent(java.util.List countExtent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COUNTEXTENT$20);
            target.setListValue(countExtent);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CountExtent" element
     */
    public net.opengis.gml.CountExtentType insertNewCountExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().insert_element_user(COUNTEXTENT$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CountExtent" element
     */
    public net.opengis.gml.CountExtentType addNewCountExtent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CountExtentType target = null;
            target = (net.opengis.gml.CountExtentType)get_store().add_element_user(COUNTEXTENT$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "CountExtent" element
     */
    public void removeCountExtent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTEXTENT$20, i);
        }
    }
    
    /**
     * Gets a List of "CompositeValue" elements
     */
    public java.util.List<net.opengis.gml.CompositeValueType> getCompositeValueList()
    {
        final class CompositeValueList extends java.util.AbstractList<net.opengis.gml.CompositeValueType>
        {
            @Override
            public net.opengis.gml.CompositeValueType get(int i)
                { return ValueArrayPropertyTypeImpl.this.getCompositeValueArray(i); }
            
            @Override
            public net.opengis.gml.CompositeValueType set(int i, net.opengis.gml.CompositeValueType o)
            {
                net.opengis.gml.CompositeValueType old = ValueArrayPropertyTypeImpl.this.getCompositeValueArray(i);
                ValueArrayPropertyTypeImpl.this.setCompositeValueArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.CompositeValueType o)
                { ValueArrayPropertyTypeImpl.this.insertNewCompositeValue(i).set(o); }
            
            @Override
            public net.opengis.gml.CompositeValueType remove(int i)
            {
                net.opengis.gml.CompositeValueType old = ValueArrayPropertyTypeImpl.this.getCompositeValueArray(i);
                ValueArrayPropertyTypeImpl.this.removeCompositeValue(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfCompositeValueArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CompositeValueList();
        }
    }
    
    /**
     * Gets array of all "CompositeValue" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.CompositeValueType[] getCompositeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.CompositeValueType> targetList = new java.util.ArrayList<net.opengis.gml.CompositeValueType>();
            get_store().find_all_element_users(COMPOSITEVALUE$23, targetList);
            net.opengis.gml.CompositeValueType[] result = new net.opengis.gml.CompositeValueType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType getCompositeValueArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$23, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "CompositeValue" element
     */
    public int sizeOfCompositeValueArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPOSITEVALUE$23);
        }
    }
    
    /**
     * Sets array of all "CompositeValue" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setCompositeValueArray(net.opengis.gml.CompositeValueType[] compositeValueArray)
    {
        check_orphaned();
        arraySetterHelper(compositeValueArray, COMPOSITEVALUE$22, COMPOSITEVALUE$23);
    }
    
    /**
     * Sets ith "CompositeValue" element
     */
     public void setCompositeValueArray(int i, net.opengis.gml.CompositeValueType compositeValue)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().find_element_user(COMPOSITEVALUE$23, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(compositeValue);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType insertNewCompositeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().insert_element_user(COMPOSITEVALUE$23, COMPOSITEVALUE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "CompositeValue" element
     */
    public net.opengis.gml.CompositeValueType addNewCompositeValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.CompositeValueType target = null;
            target = (net.opengis.gml.CompositeValueType)get_store().add_element_user(COMPOSITEVALUE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "CompositeValue" element
     */
    public void removeCompositeValue(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPOSITEVALUE$23, i);
        }
    }
    
    /**
     * Gets a List of "_Object" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlObject> getObjectList()
    {
        final class ObjectList extends java.util.AbstractList<org.apache.xmlbeans.XmlObject>
        {
            @Override
            public org.apache.xmlbeans.XmlObject get(int i)
                { return ValueArrayPropertyTypeImpl.this.getObjectArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlObject set(int i, org.apache.xmlbeans.XmlObject o)
            {
                org.apache.xmlbeans.XmlObject old = ValueArrayPropertyTypeImpl.this.getObjectArray(i);
                ValueArrayPropertyTypeImpl.this.setObjectArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlObject o)
                { ValueArrayPropertyTypeImpl.this.insertNewObject(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlObject remove(int i)
            {
                org.apache.xmlbeans.XmlObject old = ValueArrayPropertyTypeImpl.this.getObjectArray(i);
                ValueArrayPropertyTypeImpl.this.removeObject(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfObjectArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ObjectList();
        }
    }
    
    /**
     * Gets array of all "_Object" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlObject[] getObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlObject> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlObject>();
            get_store().find_all_element_users(OBJECT$25, targetList);
            org.apache.xmlbeans.XmlObject[] result = new org.apache.xmlbeans.XmlObject[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "_Object" element
     */
    public org.apache.xmlbeans.XmlObject getObjectArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$25, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "_Object" element
     */
    public int sizeOfObjectArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OBJECT$25);
        }
    }
    
    /**
     * Sets array of all "_Object" element  WARNING: This method is not atomicaly synchronized.
     */
     public void setObjectArray(org.apache.xmlbeans.XmlObject[] objectArray)
    {
        check_orphaned();
        arraySetterHelper(objectArray, OBJECT$24, OBJECT$25);
    }
    
    /**
     * Sets ith "_Object" element
     */
     public void setObjectArray(int i, org.apache.xmlbeans.XmlObject object)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().find_element_user(OBJECT$25, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(object);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "_Object" element
     */
    public org.apache.xmlbeans.XmlObject insertNewObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().insert_element_user(OBJECT$25, OBJECT$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "_Object" element
     */
    public org.apache.xmlbeans.XmlObject addNewObject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlObject target = null;
            target = (org.apache.xmlbeans.XmlObject)get_store().add_element_user(OBJECT$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "_Object" element
     */
    public void removeObject(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OBJECT$25, i);
        }
    }
    
    /**
     * Gets a List of "Null" elements
     */
    public java.util.List<java.lang.Object> getNullList()
    {
        final class NullList extends java.util.AbstractList<java.lang.Object>
        {
            @Override
            public java.lang.Object get(int i)
                { return ValueArrayPropertyTypeImpl.this.getNullArray(i); }
            
            @Override
            public java.lang.Object set(int i, java.lang.Object o)
            {
                java.lang.Object old = ValueArrayPropertyTypeImpl.this.getNullArray(i);
                ValueArrayPropertyTypeImpl.this.setNullArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.Object o)
                { ValueArrayPropertyTypeImpl.this.insertNull(i, o); }
            
            @Override
            public java.lang.Object remove(int i)
            {
                java.lang.Object old = ValueArrayPropertyTypeImpl.this.getNullArray(i);
                ValueArrayPropertyTypeImpl.this.removeNull(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfNullArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NullList();
        }
    }
    
    /**
     * Gets array of all "Null" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.Object[] getNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.NullType> targetList = new java.util.ArrayList<net.opengis.gml.NullType>();
            get_store().find_all_element_users(NULL$26, targetList);
            java.lang.Object[] result = new java.lang.Object[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getObjectValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Null" element
     */
    public java.lang.Object getNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getObjectValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Null" elements
     */
    public java.util.List<net.opengis.gml.NullType> xgetNullList()
    {
        final class NullList extends java.util.AbstractList<net.opengis.gml.NullType>
        {
            @Override
            public net.opengis.gml.NullType get(int i)
                { return ValueArrayPropertyTypeImpl.this.xgetNullArray(i); }
            
            @Override
            public net.opengis.gml.NullType set(int i, net.opengis.gml.NullType o)
            {
                net.opengis.gml.NullType old = ValueArrayPropertyTypeImpl.this.xgetNullArray(i);
                ValueArrayPropertyTypeImpl.this.xsetNullArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, net.opengis.gml.NullType o)
                { ValueArrayPropertyTypeImpl.this.insertNewNull(i).set(o); }
            
            @Override
            public net.opengis.gml.NullType remove(int i)
            {
                net.opengis.gml.NullType old = ValueArrayPropertyTypeImpl.this.xgetNullArray(i);
                ValueArrayPropertyTypeImpl.this.removeNull(i);
                return old;
            }
            
            @Override
            public int size()
                { return ValueArrayPropertyTypeImpl.this.sizeOfNullArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new NullList();
        }
    }
    
    /**
     * Gets array of all "Null" elements
     * @deprecated
     */
    @Deprecated
    public net.opengis.gml.NullType[] xgetNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<net.opengis.gml.NullType> targetList = new java.util.ArrayList<net.opengis.gml.NullType>();
            get_store().find_all_element_users(NULL$26, targetList);
            net.opengis.gml.NullType[] result = new net.opengis.gml.NullType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Null" element
     */
    public net.opengis.gml.NullType xgetNullArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Null" element
     */
    public int sizeOfNullArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NULL$26);
        }
    }
    
    /**
     * Sets array of all "Null" element
     */
     public void setNullArray(java.lang.Object[] xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            unionArraySetterHelper(xnullArray, NULL$26);
        }
    }
    
    /**
     * Sets ith "Null" element
     */
     public void setNullArray(int i, java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NULL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Sets (as xml) array of all "Null" element
     */
    public void xsetNullArray(net.opengis.gml.NullType[]xnullArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(xnullArray, NULL$26);
        }
    }
    
    /**
     * Sets (as xml) ith "Null" element
     */
    public void xsetNullArray(int i, net.opengis.gml.NullType xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().find_element_user(NULL$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(xnull);
        }
    }
    
    /**
     * Inserts the value as the ith "Null" element
     */
    public void insertNull(int i, java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(NULL$26, i);
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Appends the value as the last "Null" element
     */
    public void addNull(java.lang.Object xnull)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NULL$26);
            target.setObjectValue(xnull);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Null" element
     */
    public net.opengis.gml.NullType insertNewNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().insert_element_user(NULL$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Null" element
     */
    public net.opengis.gml.NullType addNewNull()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.NullType target = null;
            target = (net.opengis.gml.NullType)get_store().add_element_user(NULL$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "Null" element
     */
    public void removeNull(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NULL$26, i);
        }
    }
}
