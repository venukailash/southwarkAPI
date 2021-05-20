package com.southwark.api.items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.*;
import org.springframework.stereotype.Component;

import com.mongodb.client.result.UpdateResult;

@Component
public class ItemsCustomImpl implements ItemsCustomRepository {

	@Autowired
	MongoTemplate mongoTemplate;

	@Override
	public long updateUser(String id, String name) {
		Query query = new Query(Criteria.where("id").is(id));
		Update update = new Update();
		update.set("name", name);

		UpdateResult result = mongoTemplate.updateFirst(query, update, Items.class);
		if (result != null)
			return result.getModifiedCount();
		else
			return 0;
	}

}
