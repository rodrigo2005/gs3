package br.com.gs3.servico.converter;

import br.com.gs3.servico.dto.EnderecoDTO;
import br.com.gs3.servico.entidade.Endereco;
import org.springframework.stereotype.Component;

@Component
public class EnderecoConverter extends AbstractEntityMapper<EnderecoDTO, Endereco> {

    @Override
    public Endereco toEntity(EnderecoDTO dto) {
        return Endereco.builder()
                .bairro(dto.getBairro())
                .cep(dto.getCep())
                .cidade(dto.getLocalidade())
                .id(dto.getId())
                .logradouro(dto.getLogradouro())
                .uf(dto.getUf())
                .build();
    }

    @Override
    public EnderecoDTO toDto(Endereco entity) {
        return EnderecoDTO.builder()
                .bairro(entity.getBairro())
                .cep(entity.getCep())
                .localidade(entity.getCidade())
                .id(entity.getId())
                .logradouro(entity.getLogradouro())
                .uf(entity.getUf())
                .build();
    }
}
