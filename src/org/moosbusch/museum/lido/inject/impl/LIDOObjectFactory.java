/*

 *
 */
package org.moosbusch.museum.lido.inject.impl;

import org.apache.xmlbeans.XmlObject;
import org.lidoSchema.AdministrativeMetadataComplexType;
import org.lidoSchema.LidoWrapDocument;
import org.lidoSchema.LidoWrapDocument.LidoWrap.Lido;
import org.moosbusch.museum.inject.spi.AbstractMuseumXmlObjectFactory;
import org.moosbusch.museum.lido.inject.LIDOModule;

/**
 *
 * @author moosbusch
 */
public class LIDOObjectFactory extends AbstractMuseumXmlObjectFactory
        <LIDOModule, LidoWrapDocument> {

    @Override
    protected LIDOModule createModule() {
        return new LIDOModuleImpl(this);
    }

    @Override
    public LidoWrapDocument createRootElement() {
        return createTypedObject(LidoWrapDocument.class);
    }

    @Override
    public <X extends XmlObject> void afterInjectedChildMembers(X entity) {
        if (entity instanceof Lido) {
            Lido lido = (Lido) entity;
            AdministrativeMetadataComplexType adminMetadata =
                    createTypedObject(AdministrativeMetadataComplexType.class);
            lido.getAdministrativeMetadataList().add(adminMetadata);
        }
    }

}
