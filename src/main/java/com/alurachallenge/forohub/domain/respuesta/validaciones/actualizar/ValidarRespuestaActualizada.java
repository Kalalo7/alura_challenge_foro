package com.alurachallenge.forohub.domain.respuesta.validaciones.actualizar;

import com.alurachallenge.forohub.domain.respuesta.ActualizarRespuestaDTO;

public interface ValidarRespuestaActualizada {

    public void validate(ActualizarRespuestaDTO data, Long respuestaId);

}