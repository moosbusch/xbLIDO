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
 * An XML CalDate(@http://www.opengis.net/gml).
 *
 * This is a union type. Instances are of one of the following types:
 *     org.apache.xmlbeans.XmlDate
 *     org.apache.xmlbeans.XmlGYearMonth
 *     org.apache.xmlbeans.XmlGYear
 */
public class CalDateImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements net.opengis.gml.CalDate, org.apache.xmlbeans.XmlDate, org.apache.xmlbeans.XmlGYearMonth, org.apache.xmlbeans.XmlGYear
{
    private static final long serialVersionUID = 1L;
    
    public CalDateImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalDateImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
