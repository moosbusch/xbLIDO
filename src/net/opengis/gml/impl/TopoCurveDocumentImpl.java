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
 * A document containing one TopoCurve(@http://www.opengis.net/gml) element.
 *
 * This is a complex type.
 */
public class TopoCurveDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements net.opengis.gml.TopoCurveDocument
{
    private static final long serialVersionUID = 1L;
    
    public TopoCurveDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TOPOCURVE$0 = 
        new javax.xml.namespace.QName("http://www.opengis.net/gml", "TopoCurve");
    
    
    /**
     * Gets the "TopoCurve" element
     */
    public net.opengis.gml.TopoCurveType getTopoCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoCurveType target = null;
            target = (net.opengis.gml.TopoCurveType)get_store().find_element_user(TOPOCURVE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "TopoCurve" element
     */
    @Inject(optional=true) public void setTopoCurve(net.opengis.gml.TopoCurveType topoCurve)
    {
        generatedSetterHelperImpl(topoCurve, TOPOCURVE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "TopoCurve" element
     */
    public net.opengis.gml.TopoCurveType addNewTopoCurve()
    {
        synchronized (monitor())
        {
            check_orphaned();
            net.opengis.gml.TopoCurveType target = null;
            target = (net.opengis.gml.TopoCurveType)get_store().add_element_user(TOPOCURVE$0);
            return target;
        }
    }
}
