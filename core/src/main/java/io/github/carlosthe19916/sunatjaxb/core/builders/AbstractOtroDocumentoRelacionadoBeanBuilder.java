package io.github.carlosthe19916.sunatjaxb.core.builders;

import io.github.carlosthe19916.sunatjaxb.core.beans.OtroDocumentoRelacionadoBean;
import io.github.carlosthe19916.sunatjaxb.core.catalogos.Catalogo12;

public abstract class AbstractOtroDocumentoRelacionadoBeanBuilder<Builder extends AbstractOtroDocumentoRelacionadoBeanBuilder, Bean extends OtroDocumentoRelacionadoBean> {

    protected final OtroDocumentoRelacionadoBean otroDocumentoRelacionado;

    protected AbstractOtroDocumentoRelacionadoBeanBuilder(Bean bean) {
        this.otroDocumentoRelacionado = bean;
    }

    protected abstract Builder getOtroDocumentoRelacionadoBuilder();

    public Builder documentoRelacionado(String documentoRelacionado) {
        otroDocumentoRelacionado.setDocumentoRelacionado(documentoRelacionado);
        return getOtroDocumentoRelacionadoBuilder();
    }

    public Builder tipoDocumentoRelacionado(Catalogo12 tipoDocumentoRelacionado) {
        otroDocumentoRelacionado.setTipoDocumentoRelacionado(tipoDocumentoRelacionado);
        return getOtroDocumentoRelacionadoBuilder();
    }

}