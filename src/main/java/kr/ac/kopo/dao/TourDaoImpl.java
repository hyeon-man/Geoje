package kr.ac.kopo.dao;

import kr.ac.kopo.model.Tour;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TourDaoImpl implements TourDao{

    @Autowired
    SqlSession sql;

    @Override
    public List<Tour> list() {
        return sql.selectList("tour.list");
    }

    @Override
    public void delete(int tourNum) {
        sql.delete("tour.delete", tourNum);
    }

    @Override
    public void add(Tour item) {
        sql.insert("tour.add", item);
    }

    @Override
    public Tour item(int tourNum) {
        return sql.selectOne("tour.item", tourNum);
    }

    @Override
    public void update(Tour item) {
        sql.update("tour.update", item);
    }
}
