package kr.ac.kopo.dao;

import kr.ac.kopo.model.Food;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodDaoImpl implements FoodDao{

    @Autowired
    SqlSession sql;

    @Override
    public List<Food> list() {
        return sql.selectList("food.list");
    }

    @Override
    public void delete(int foodNum) {
        sql.delete("food.delete", foodNum);
    }

    @Override
    public void add(Food item) {
        sql.insert("food.add", item);
    }

    @Override
    public void update(Food item) {
        sql.update("food.update", item);
    }

    @Override
    public Food item(int foodNum) {
        return sql.selectOne("food.item", foodNum);
    }


}
