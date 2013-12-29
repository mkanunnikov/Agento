package com.agento.dao;

import com.agento.mvc.model.DealObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import static org.springframework.data.mongodb.core.query.Criteria.where;

import java.util.List;

/**
 * Created by Max on 20.12.13.
 */

@Repository
public class MongoDAO implements DAO {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<DealObject> getObjects() {
        List<DealObject> dealObjects = mongoTemplate.findAll(DealObject.class);
        return dealObjects;
    }

    @Override
    public List<DealObject> getObjects(Double price) {
        List<DealObject> dealObjects = mongoTemplate.find(new Query(where("price").gte(23.4)), DealObject.class);
        return dealObjects;
    }
}
