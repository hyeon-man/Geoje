package kr.ac.kopo.dao;

import kr.ac.kopo.model.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDaoImpl implements MemberDao {

    @Autowired
    SqlSession sql;

    @Override
    public List<Member> list() {
        return sql.selectList("member.list");
    }

    @Override
    public void add(Member item) {
        sql.insert("member.add", item);
    }

    @Override
    public void delete(String memberId) {
        sql.delete("member.delete", memberId);
    }
}
