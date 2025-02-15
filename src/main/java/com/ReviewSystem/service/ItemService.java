package com.ReviewSystem.service;

import com.ReviewSystem.model.Item;
import com.ReviewSystem.repository.ItemRepository;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    private final ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public Item saveItem(Item item) {
        return this.itemRepository.save(item);
    }

    public Item getItem(Long id) {
        return this.itemRepository.findById(id).orElse(null);
    }

    public Iterable<Item> getAllItems() {
        return this.itemRepository.findAll();
    }

    public void deleteItem(Long id) {
        this.itemRepository.deleteById(id);
    }
}