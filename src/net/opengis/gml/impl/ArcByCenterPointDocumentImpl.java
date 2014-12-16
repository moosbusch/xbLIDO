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
 * A document containing one ArcByCenterPoint(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class ArcByCenterPointDocumentImpl extends net.opengis.gml.impl.CurveSegmentDocumentImpl implements net.opengis.gml.ArcByCenterPointDocument
{
    private static final long serialVersionUID = 1L;
    
    public ArcByCenterPointDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ARCBYCENTERPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByCenterPoint");
    private static final org.apache.xmlbeans.QNameSet ARCBYCENTERPOINT$1 = org.apache.xmlbeans.QNameSet.forArray( new javax.xml.namespace.QName[] { 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "CircleByCenterPoint"),
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "ArcByCenterPoint"),
    });
    
    
    /**
     * Gets the "ArcByCenterPoint" element
     */
    public net.opengis.gml.ArcByCenterPointType getArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcByCenterPointType target = null;
            target = (net.opengis.gml.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ArcByCenterPoint" element
     */
     public void setArcByCenterPoint(net.opengis.gml.ArcByCenterPointType arcByCenterPoint)
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcByCenterPointType target = null;
            target = (net.opengis.gml.ArcByCenterPointType)get_store().find_element_user(ARCBYCENTERPOINT$1, 0);
            if (target == null)
            {
                target = (net.opengis.gml.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            }
            target.set(arcByCenterPoint);
        }
    }
    
    /**
     * Appends and returns a new empty "ArcByCenterPoint" element
     */
    public net.opengis.gml.ArcByCenterPointType addNewArcByCenterPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.ArcByCenterPointType target = null;
            target = (net.opengis.gml.ArcByCenterPointType)get_store().add_element_user(ARCBYCENTERPOINT$0);
            return target;
        }
    }
}
