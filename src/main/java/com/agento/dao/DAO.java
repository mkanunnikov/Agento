package com.agento.dao;

import com.agento.mvc.model.DealObject;

import java.util.List;

/**
 * Created by Max on 20.12.13.
 */
public interface DAO {
    List<DealObject> getObjects();
    List<DealObject> getObjects(Double price);
}
