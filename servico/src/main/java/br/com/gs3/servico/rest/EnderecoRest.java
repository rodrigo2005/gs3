package br.com.gs3.servico.rest;

import br.com.gs3.servico.service.EnderecoService;
import br.com.gs3.servico.dto.EnderecoDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/endereco")
@AllArgsConstructor
public class EnderecoRest {

    private EnderecoService enderecoService;

    @GetMapping("/cep/{cep}")
    public ResponseEntity<EnderecoDTO> getEnderecoByCep(@PathVariable String cep){
        return ResponseEntity.ok(enderecoService.getEnderecoByCep(cep));
    }


}
