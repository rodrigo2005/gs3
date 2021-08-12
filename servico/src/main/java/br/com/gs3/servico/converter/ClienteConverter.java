package br.com.gs3.servico.converter;

import br.com.gs3.servico.dto.ClienteDTO;
import br.com.gs3.servico.entidade.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ClienteConverter extends AbstractEntityMapper<ClienteDTO, Cliente> {

    private EmailConverter emailConverter;
    private EnderecoConverter enderecoConverter;
    private TelefoneConverter telefoneConverter;


    @Override
    public Cliente toEntity(ClienteDTO dto) {
        return Cliente.builder()
                .cpf(dto.getCpf())
                .emails(emailConverter.toEntity(dto.getEmails()))
                .endereco(enderecoConverter.toEntity(dto.getEndereco()))
                .id(dto.getId())
                .nome(dto.getNome())
                .telefones(telefoneConverter.toEntity(dto.getTelefones()))
                .build();
    }

    @Override
    public ClienteDTO toDto(Cliente entity) {
        return ClienteDTO.builder()
                .cpf(entity.getCpf())
                .emails(emailConverter.toDto(entity.getEmails()))
                .endereco(enderecoConverter.toDto(entity.getEndereco()))
                .id(entity.getId())
                .nome(entity.getNome())
                .telefones(telefoneConverter.toDto(entity.getTelefones()))
                .build();
    }
}
