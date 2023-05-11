package qnfzks3.springboot.semiprojectv5.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qnfzks3.springboot.semiprojectv5.model.Board;

import java.util.List;
import java.util.Map;

@Repository("bddao")
public class BoardDAOImpl implements BoardDAO {

    @Autowired private SqlSession sqlSession;

    @Override
    public List<Board> selectBoard(int stbno) {  //selectBoard(int stbno) 메서드는 stbno를 조건으로 검색하고,
        return sqlSession.selectList("board.selectBoard", stbno);
    }

    @Override
    public List<Board> selectBoard(Map<String, Object> params) { 
        //selectBoard(Map<String, Object> params) params를 Map(스트링 타입의, 데이터) 로 정의 -- 매개 변수다 -
        // service에서도 같은 타입의 매개변수로 넣어줘야한다.
        return sqlSession.selectList("board.selectFindBoard", params); 
        //즉 sql문으로 가져온 String 타입의 board.selectFindBoard를 params라는 맵에 저장해라
        //참고로 board.selectFindBoard는 mybatis 에서 selectFindBoard라고 정의한 sql문을 가져와라
        //참고로 mybatis에서 namespace로 board라고 정의했기 때문에 board.selectFindBoard 라고 씀
    }

    @Override
    public int countBoard() {
        return sqlSession.selectOne("board.countBoard");
    }

    @Override
    public int countBoard(Map<String,Object> params) {//Map<String, Object> params => Map <타입, 값 > Params -> 스트링 타입의 오브젝트
        return sqlSession.selectOne("board.countFindBoard",params); //sql문을 쓰기위해서 지정해줌- 즉, 데이터를 저장하기위해 사용
                                                                        //데이터 저장 컬렉션 같은 느낌이라고 보면됨
    }


    @Override
    public int insertBoard(Board bd) {
        return sqlSession.insert("board.insertBoard",bd);
    }


    @Override
    public Board selectOneBoard(String bno) {
        sqlSession.update("board.countViewBoard",bno);
        return sqlSession.selectOne("board.selectOneBoard", bno);
    }
}