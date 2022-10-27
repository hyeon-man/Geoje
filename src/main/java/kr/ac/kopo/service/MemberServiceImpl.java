package kr.ac.kopo.service;

import kr.ac.kopo.dao.MemberDao;
import kr.ac.kopo.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    MemberDao dao;

    @Override
    public List<Member> list() {
        return dao.list();
    }

    @Override
    public void add(Member item) {
        dao.add(item);
    }

    @Override
    public void delete(String memberId) {
        dao.delete(memberId);
    }
}
