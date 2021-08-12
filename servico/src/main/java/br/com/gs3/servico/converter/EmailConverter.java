package br.com.gs3.servico.converter;

import br.com.gs3.servico.dto.EmailDTO;
import br.com.gs3.servico.entidade.Email;
import org.springframework.stereotype.Component;

@Component
public class EmailConverter extends AbstractEntityMapper<EmailDTO, Email> {

    @Override
    public Email toEntity(EmailDTO dto) {
        return Email.builder()
                .id(dto.getId())
                .descricao(dto.getDescricao())
                .build();
    }

    @Override
    public EmailDTO toDto(Email entity) {
        return EmailDTO.builder()
                .id(entity.getId())
                .descricao(entity.getDescricao())
                .build();
    }
}
