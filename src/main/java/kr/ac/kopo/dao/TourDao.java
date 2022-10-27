package kr.ac.kopo.dao;

import kr.ac.kopo.model.Tour;

import java.util.List;

public interface TourDao {
    List<Tour> list();

    void delete(int tourNum);

    void add(Tour item);

    Tour item(int tourNum);

    void update(Tour item);
}
