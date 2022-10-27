package kr.ac.kopo.service;

import kr.ac.kopo.dao.FoodDao;
import kr.ac.kopo.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    FoodDao dao;

    @Override
    public List<Food> list() {
        return dao.list();
    }

    @Override
    public void delete(int foodNum) {
        dao.delete(foodNum);
    }

    @Override
    public void add(Food item) {
        dao.add(item);
    }

    @Override
    public Food item(int foodNum) {
        return dao.item(foodNum);
    }

    @Override
    public void update(Food item) {
        dao.update(item);
    }
}
