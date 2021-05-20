package com.southwark.api.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ItemsController {
	
	@Autowired
	ItemsRepository repository;
	
	@Autowired
	ItemsCustomRepository crepo;
	
	@GetMapping("/items")
	public List<Items> getItems(){
		return repository.findAll();
	}
	
	@PutMapping("items/{id}")
	public long updateName(@PathVariable String id, @RequestBody Items items) {
		String name = items.getName();
		return crepo.updateUser(id,name);
	}
	
	@PostMapping("/items")
	public Items addItem(@RequestBody Items items) {
		return repository.save(items);
	}
	
	@DeleteMapping("/items/{id}")
	public String deleteItem(@PathVariable String id) {
		repository.deleteById(id);
		return "Deleted - " + id;
	}
}
