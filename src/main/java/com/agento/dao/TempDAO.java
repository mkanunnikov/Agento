package com.agento.dao;

import com.agento.mvc.model.*;
import com.agento.mvc.model.DealObject;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class TempDAO implements DAO{
    public List<DealObject> getObjects(){
        List<DealObject> dealObjects = new ArrayList<DealObject>(5);
//        dealObjects.add(new Flat(1));
//        dealObjects.add(new Flat(1,100.00,"Улица2"));
//        dealObjects.add(new Flat(1,50.00,"Улица3"));
//        dealObjects.add(new House(10.5,2200.00,"Улица4"));
//        dealObjects.add(new House(5.2,1200.00,"Улица5"));
        return dealObjects;
    }

    @Override
    public List<DealObject> getObjects(Double price) {
        List<DealObject> dealObjects = new ArrayList<DealObject>(5);
//        dealObjects.add(new Flat(1,price,"Улица1"));
//        dealObjects.add(new Flat(1,price,"Улица2"));
//        dealObjects.add(new Flat(1,price,"Улица3"));
//        dealObjects.add(new House(10.5,price,"Улица4"));
//        dealObjects.add(new House(5.2,price,"Улица5"));
        return dealObjects;
    }
}
