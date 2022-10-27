package kr.ac.kopo.service;

import kr.ac.kopo.model.Festival;

import java.util.List;

public interface FestivalService {
    List<Festival> list();

    void delete(int festivalNum);

    void add(Festival item);

    Festival item(int festivalNum);

    void update(Festival item);
}
