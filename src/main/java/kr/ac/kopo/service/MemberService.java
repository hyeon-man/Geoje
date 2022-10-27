package kr.ac.kopo.service;

import kr.ac.kopo.model.Member;

import java.util.List;

public interface MemberService {

    List<Member> list();

    void add(Member item);

    void delete(String memberId);
}
