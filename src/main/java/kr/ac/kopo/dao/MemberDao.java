package kr.ac.kopo.dao;

import kr.ac.kopo.model.Member;

import java.util.List;

public interface MemberDao {

    List<Member> list();

    void add(Member item);

    void delete(String memberId);
}
