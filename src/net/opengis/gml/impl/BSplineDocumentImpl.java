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
 * A document containing one BSpline(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class BSplineDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.BSplineDocument
{
    private static final long serialVersionUID = 1L;
    
    public BSplineDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BSPLINE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BSpline");
    private static final org.apache.xmlbeans.QNameSet BSPLINE$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "BSpline"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "Bezier"),
    });
    
    
    /**
     * Gets the "BSpline" element
     */
    public net.opengis.gml.BSplineType getBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "BSpline" element
     */
     public void setBSpline(net.opengis.gml.BSplineType bSpline)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().find_element_user(BSPLINE$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.BSplineType)get_store().add_element_user(BSPLINE$0);
            }
            target.set(bSpline);
        }
    }
    
    /**
     * Appends and returns a new empty "BSpline" element
     */
    public net.opengis.gml.BSplineType addNewBSpline()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.BSplineType target = null;
            target = (net.opengis.gml.BSplineType)get_store().add_element_user(BSPLINE$0);
            return target;
        }
    }
}
