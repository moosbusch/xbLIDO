/*
 * 
 *
 */
package org.moosbusch.museum.lido.inject.spi;

import org.apache.xmlbeans.XmlObject;
import org.moosbusch.museum.document.MuseumXmlDocument;
import org.moosbusch.museum.inject.MuseumXmlModule;
import org.moosbusch.museum.inject.MuseumXmlObjectFactory;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlModule;
import org.moosbusch.museum.lido.inject.LIDOModule;
import org.moosbusch.museum.lido.inject.impl.LIDOObjectFactory;

/**
 *
 * @author moosbusch
 */
public abstract class AbstractLIDOModule extends AbstractMuseumXmlModule implements LIDOModule {

    private final String relatedEncoding;

    public AbstractLIDOModule(MuseumXmlObjectFactory<? extends MuseumXmlModule,
            ? extends XmlObject> objFactory) {
        super(objFactory);
        this.relatedEncoding = initRelatedEncoding();
    }

    private String initRelatedEncoding() {
        return createRelatedEncoding();
    }

    protected abstract String createRelatedEncoding();

    @Override
    protected String createLanguage() {
        return MuseumXmlDocument.DEFAULT_LANGUAGE;
    }

    @Override
    public String getRelatedEncoding() {
        return relatedEncoding;
    }

    @Override
    public LIDOObjectFactory getObjectFactory() {
        return (LIDOObjectFactory) super.getObjectFactory();
    }

}
