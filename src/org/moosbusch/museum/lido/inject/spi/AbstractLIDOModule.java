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
package org.moosbusch.museum.lido.inject.spi;

import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.document.XmlDocument;
import org.moosbusch.museum.inject.XmlModule;
import org.moosbusch.museum.inject.XmlObjectFactory;
import org.moosbusch.museum.inject.spi.AbstractXmlModule;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLIDOModule extends AbstractXmlModule implements LIDOModule {

    private final String relatedEncoding;

    public AbstractLIDOModule(XmlObjectFactory<? extends XmlModule,
            ? extends XmlObject> objFactory) {
        this.relatedEncoding = initRelatedEncoding();
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    protected abstract String createRelatedEncoding();

    @Override
    protected String createLanguage() {
        return XmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

}
