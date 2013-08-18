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
 * A document containing one _Curve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class CurveDocumentImpl extends net.opengis.gml.impl.GeometricPrimitiveDocumentImpl implements net.opengis.gml.CurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public CurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve");
    private static final org.apache.xmlbeans.QNameSet CURVE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "OrientableCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "LineString"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CompositeCurve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "_Curve"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Curve"),
    });
    
    
    /**
     * Gets the "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType getCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "_Curve" element
     */
    @Inject(optional=true) public void setCurve(net.opengis.gml.AbstractCurveType curve)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().find_element_user(CURVE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.AbstractCurveType)get_store().add_element_user(CURVE$0);
            }
            target.set(curve);
        }
    }
    
    /**
     * Appends and returns a new empty "_Curve" element
     */
    public net.opengis.gml.AbstractCurveType addNewCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.AbstractCurveType target = null;
            target = (net.opengis.gml.AbstractCurveType)get_store().add_element_user(CURVE$0);
            return target;
        }
    }
}
