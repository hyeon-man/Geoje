package kr.ac.kopo.dao;

import kr.ac.kopo.model.Food;

import java.util.List;

public interface FoodDao {
    List<Food> list();

    void delete(int foodNum);

    void add(Food item);

    Food item(int foodNum);

    void update(Food item);
}
