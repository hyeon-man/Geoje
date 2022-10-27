package kr.ac.kopo.service;

import kr.ac.kopo.model.Tour;

import java.util.List;

public interface TourService {
    List<Tour> list();

    void delete(int tourNum);

    void add(Tour item);

    Tour item(int tourNum);

    void update(Tour item);
}
