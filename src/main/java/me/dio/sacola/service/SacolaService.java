package me.dio.sacola.service;

import me.dio.sacola.dto.ItemDTO;
import me.dio.sacola.model.Item;
import me.dio.sacola.model.Sacola;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public interface SacolaService {
    Item incluirItemNaSacola(ItemDTO itemDTO);
    Sacola verSacola(Long id);
    Sacola fecharSacola(Long id, int formaPagamento);
}
