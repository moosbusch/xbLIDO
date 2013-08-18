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
 * An XML GeodesicType(@http://www.opengis.net/gml).
 *
 * This is a complex type.
 */
public class GeodesicTypeImpl extends net.opengis.gml.impl.GeodesicStringTypeImpl implements net.opengis.gml.GeodesicType
{
    private static final long serialVersionUID = 1L;
    
    public GeodesicTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    
}
