package me.dio.sacola.controller;

import lombok.RequiredArgsConstructor;
import me.dio.sacola.dto.ItemDTO;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;
import me.dio.sacola.service.SacolaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ifood-devweek/sacola")
@RequiredArgsConstructor
public class SacolaController {
    private final SacolaService sacolaService;

    @PostMapping
    public Item incluirItemNaSacola(@RequestBody ItemDTO itemDTO) {
        return sacolaService.incluirItemNaSacola(itemDTO);
    }

    @GetMapping("/{id}")
    public Sacola verSacola(@PathVariable("id") Long id) {
        return sacolaService.verSacola(id);
    }

    @PatchMapping("fecharSacola/{idSacola}")
    public Sacola fecharSacola(Long idSacola,@RequestParam("formaPagamento") int formaPagamento) {
        return sacolaService.fecharSacola(idSacola, formaPagamento);
    }

}
