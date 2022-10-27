package kr.ac.kopo.service;

import kr.ac.kopo.dao.FestivalDao;
import kr.ac.kopo.model.Festival;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalServiceImpl implements FestivalService{

    @Autowired
    FestivalDao dao;

    @Override
    public List<Festival> list() {
        return dao.list();
    }

    @Override
    public void delete(int festivalNum) {
        dao.delete(festivalNum);
    }

    @Override
    public void add(Festival item) {
        dao.add(item);
    }

    @Override
    public Festival item(int festivalNum) {
        return dao.item(festivalNum);
    }

    @Override
    public void update(Festival item) {
        dao.update(item);
    }
}
