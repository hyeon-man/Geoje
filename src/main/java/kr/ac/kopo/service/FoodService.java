package kr.ac.kopo.service;

import kr.ac.kopo.model.Food;

import java.util.List;

public interface FoodService {
    List<Food> list();

    void delete(int foodNum);

    void add(Food item);

    Food item(int foodNum);

    void update(Food item);
}
