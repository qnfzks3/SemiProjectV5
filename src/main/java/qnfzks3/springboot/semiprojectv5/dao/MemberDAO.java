package qnfzks3.springboot.semiprojectv5.dao;

import qnfzks3.springboot.semiprojectv5.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
