package qnfzks3.springboot.semiprojectv5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qnfzks3.springboot.semiprojectv5.dao.BoardDAO;
import qnfzks3.springboot.semiprojectv5.model.Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bdsrv")
public class BoardServiceImpl implements BoardService {

    @Autowired private BoardDAO bddao;

    @Override
    public List<Board> readBoard(int cpage) { //dao에서 정의한 params 데이터들 가져온다.  //게시판 창을 띄울 때 사용할 함수를 정의
        int stbno = (cpage - 1) * 25;          //
        return bddao.selectBoard(stbno);
    }

    @Override
    public List<Board> readBoard(int cpage, String ftype, String fkey) { //게시판 검색시 띄울 함수를 새로 또 정의 그래서 dao에서도 두개로 정의햇다.
        int stbno = (cpage - 1) * 25;

        // 처리시 사용할 데이터들을 해쉬맵에 담아서 보냄
        Map<String, Object> params = new HashMap<>();
        params.put("stbno", stbno);
        params.put("ftype", ftype);
        params.put("fkey", fkey);

        return bddao.selectBoard(params);
    }

    @Override
    public int countBoard() {
        return bddao.countBoard();
    }

    @Override
    public int countBoard(String ftype, String fkey) {
        Map<String, Object> params = new HashMap<>();
        params.put("ftype", ftype);
        params.put("fkey", fkey);
        return bddao.countBoard(params);
    }

    @Override
    public boolean newBoard(Board bd) {

        boolean result=false;
        if (bddao.insertBoard(bd) > 0)
            result=true;
        return result;
    }


    @Override
    public Board readOneBoard(String bno) {

        return bddao.selectOneBoard(bno);
    }





}