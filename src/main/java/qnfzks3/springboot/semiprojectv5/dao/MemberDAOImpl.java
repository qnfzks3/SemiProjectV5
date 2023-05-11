package qnfzks3.springboot.semiprojectv5.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qnfzks3.springboot.semiprojectv5.model.Member;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO {

    @Autowired SqlSession sqlSession;

    @Override
    public int selectLogin(Member m) {
        return sqlSession.selectOne("member.selectLogin", m);
    }

}
