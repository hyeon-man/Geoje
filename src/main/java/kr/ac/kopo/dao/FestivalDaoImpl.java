package kr.ac.kopo.dao;

import kr.ac.kopo.model.Festival;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FestivalDaoImpl implements FestivalDao {

    @Autowired
    SqlSession sql;

    @Override
    public List<Festival> list() {
        return sql.selectList("festival.list");
    }

    @Override
    public void delete(int festivalNum) {
        sql.delete("festival.delete", festivalNum);
    }

    @Override
    public void add(Festival item) {
        sql.insert("festival.add", item);
    }

    @Override
    public void update(Festival item) {
        sql.update("festival.update", item);
    }

    @Override
    public Festival item(int festivalNum) {
        return sql.selectOne("festival.item", festivalNum);
    }
}
