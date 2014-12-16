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
 * An XML TopoPointPropertyType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class TopoPointPropertyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoPointPropertyType
{
    private static final long serialVersionUID = 1L;
    
    public TopoPointPropertyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOPOINT$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoPoint");
    
    
    /**
     * Gets the "TopoPoint" element
     */
    public net.opengis.gml.TopoPointType getTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointType target = null;
            target = (net.opengis.gml.TopoPointType)get_store().find_element_user(TOPOPOINT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoPoint" element
     */
     public void setTopoPoint(net.opengis.gml.TopoPointType topoPoint)
    {
        generatedSetterHelperImpl(topoPoint, TOPOPOINT$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoPoint" element
     */
    public net.opengis.gml.TopoPointType addNewTopoPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoPointType target = null;
            target = (net.opengis.gml.TopoPointType)get_store().add_element_user(TOPOPOINT$0);
            return target;
        }
    }
}
