package br.com.gs3.servico.service;

import br.com.gs3.servico.entidade.Cliente;
import br.com.gs3.servico.converter.ClienteConverter;
import br.com.gs3.servico.dto.ClienteDTO;
import br.com.gs3.servico.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ClienteService {

    ClienteRepository clienteRepository;
    ClienteConverter clienteConverter;

    @Transactional
    public ClienteDTO salvar(ClienteDTO clienteDTO)
    {
        Cliente cliente = clienteConverter.toEntity(clienteDTO);
        return clienteConverter.toDto(clienteRepository.save(cliente));
    }

    @Transactional
    public void delete(Long id){
        clienteRepository.deleteById(id);
    }

    public List<ClienteDTO> lista(){
        List<Cliente> lista = clienteRepository.findAll();
        return clienteConverter.toDto(lista);
    }

    public ClienteDTO buscaPorId(Long id){
        return clienteConverter.toDto(clienteRepository.findById(id).get());
    }
}
