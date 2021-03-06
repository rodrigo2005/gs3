package br.com.gs3.servico.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Long id;

    private String nome;

    private String cpf;

    private EnderecoDTO endereco;

    private List<EmailDTO> emails;

    private List<TelefoneDTO> telefones;

    private String criadoPor;

    private Date dataCriacao;

}
