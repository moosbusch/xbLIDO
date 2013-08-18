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
 * A document containing one _GeometricAggregate(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class GeometricAggregateDocumentImpl extends net.opengis.gml.impl.GeometryDocumentImpl implements net.opengis.gml.GeometricAggregateDocument
{
    private static final long serialVersionUID = 1L;
    
    public GeometricAggregateDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GEOMETRICAGGREGATE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate");
    private static final org.apache.xmlbeans.QNameSet GEOMETRICAGGREGATE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiGeometry"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSurface"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiLineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiPolygon"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "MultiSolid"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_GeometricAggregate"),
    });
    
    
    /**
     * Gets the "_GeometricAggregate" element
     */
    public net.opengis.gml.AbstractGeometricAggregateType getGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().find_element_user(GEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_GeometricAggregate" element
     */
    @Inject(optional=true) public void setGeometricAggregate(net.opengis.gml.AbstractGeometricAggregateType geometricAggregate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().find_element_user(GEOMETRICAGGREGATE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().add_element_user(GEOMETRICAGGREGATE$0);
            }
            target.set(geometricAggregate);
        }
    }
    
    /**
     * Appends and returns a new empty "_GeometricAggregate" element
     */
    public net.opengis.gml.AbstractGeometricAggregateType addNewGeometricAggregate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractGeometricAggregateType target = null;
            target = (net.opengis.gml.AbstractGeometricAggregateType)get_store().add_element_user(GEOMETRICAGGREGATE$0);
            return target;
        }
    }
}
