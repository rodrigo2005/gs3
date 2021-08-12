package br.com.gs3.servico.service;

import br.com.gs3.servico.client.CepClient;
import br.com.gs3.servico.dto.EnderecoDTO;
import br.com.gs3.servico.repository.EnderecoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EnderecoService {

    private CepClient cepClient;
    private EnderecoRepository enderecoRepository;

    public EnderecoDTO getEnderecoByCep(String cep){
        return cepClient.buscaEnderecoPor(cep);
    }

}
