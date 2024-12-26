package com.alurachallenge.forohub.domain.usuario.validaciones.actualizar;

import com.alurachallenge.forohub.domain.usuario.ActualizarUsuarioDTO;
import com.alurachallenge.forohub.domain.usuario.UsuarioRepository;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidarActualizacionUsuario implements ValidarActualizarUsuario{

    @Autowired
    private UsuarioRepository repository;

    @Override
    public void validate(ActualizarUsuarioDTO data) {
        if(data.email() != null){
            var emailDuplicado = repository.findByEmail(data.email());
            if(emailDuplicado != null){
                throw new ValidationException("Este email ya esta en uso");
            }
        }
    }
}