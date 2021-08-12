package br.com.gs3.servico.converter;

import br.com.gs3.servico.dto.TelefoneDTO;
import br.com.gs3.servico.entidade.Telefone;
import org.springframework.stereotype.Component;

@Component
public class TelefoneConverter extends AbstractEntityMapper<TelefoneDTO, Telefone> {


    @Override
    public Telefone toEntity(TelefoneDTO dto) {
        return Telefone.builder()
                .id(dto.getId())
                .numero(dto.getNumero())
                .tipoTelefone(dto.getTipoTelefone())
                .build();
    }

    @Override
    public TelefoneDTO toDto(Telefone entity) {
        return TelefoneDTO.builder()
                .id(entity.getId())
                .numero(entity.getNumero())
                .tipoTelefone(entity.getTipoTelefone())
                .build();
    }
}
