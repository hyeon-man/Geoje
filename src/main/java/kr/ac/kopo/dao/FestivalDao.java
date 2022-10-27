package kr.ac.kopo.dao;

import kr.ac.kopo.model.Festival;

import java.util.List;

public interface FestivalDao {
    List<Festival> list();

    void delete(int festivalNum);

    void add(Festival item);

    void update(Festival item);

    Festival item(int festivalNum);
}
