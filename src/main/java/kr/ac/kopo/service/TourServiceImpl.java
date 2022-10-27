package kr.ac.kopo.service;

import kr.ac.kopo.dao.TourDao;
import kr.ac.kopo.model.Tour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    TourDao dao;

    @Override
    public List<Tour> list() {
        return dao.list();
    }

    @Override
    public void delete(int tourNum) {
        dao.delete(tourNum);
    }

    @Override
    public void add(Tour item) {
        dao.add(item);
    }

    @Override
    public Tour item(int tourNum) {
        return dao.item(tourNum);
    }

    @Override
    public void update(Tour item) {
        dao.update(item);
    }
}
