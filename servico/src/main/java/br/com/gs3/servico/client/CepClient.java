package br.com.gs3.servico.client;

import br.com.gs3.servico.dto.EnderecoDTO;
import feign.Param;
import feign.RequestLine;

public interface CepClient {

    @RequestLine("GET /{cep}/json")
    EnderecoDTO buscaEnderecoPor(@Param("cep") String cep);
}
